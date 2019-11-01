package io.renren.modules.project.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.renren.common.utils.StringUtil;
import io.renren.modules.project.dao.ProjectContractDao;
import io.renren.modules.project.entity.ProjectContractEntity;
import io.renren.modules.project.entity.ProjectEntity;
import io.renren.modules.project.service.ProjectContractService;
import io.renren.modules.project.service.ProjectService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import org.springframework.transaction.annotation.Transactional;


@Service("projectContractService")
public class ProjectContractServiceImpl extends ServiceImpl<ProjectContractDao, ProjectContractEntity> implements ProjectContractService {

    @Autowired
    public ProjectService projectService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String)params.get("key");
        String startDate = (String)params.get("startDate");
        String endDate = (String)params.get("endDate");
        boolean isAsc = params.get("order").equals("asc");
        Page<ProjectContractEntity> page = this.selectPage(
                new Query<ProjectContractEntity>(params).getPage(),
                new EntityWrapper<ProjectContractEntity>().like(StringUtils.isNotBlank(key),"contractName", key)
                        .and(StringUtils.isNotBlank(startDate) , "contract_add_time>={0}",startDate)
                        .and(StringUtils.isNotBlank(endDate) , "contract_add_time<={0}",endDate)
                        .orderBy("id",isAsc )
        );
        //查找合同对应的项目
        for ( ProjectContractEntity entity: page.getRecords() ) {
            Map<String, Object> parms = new HashMap<>();
            parms.put("contractNo", entity.getcontractNo());
            entity.setprojectList( projectService.queryList(parms) );
        }


        return new PageUtils(page);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(ProjectContractEntity entity) {
        this.insert(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(ProjectContractEntity entity) {
        this.updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteBatch(Long[] roleIds) {
        //删除
        this.deleteBatchIds(Arrays.asList(roleIds));
    }

}