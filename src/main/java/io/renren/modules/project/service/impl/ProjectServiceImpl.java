package io.renren.modules.project.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.modules.set.entity.ShortTypeEntity;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.project.dao.ProjectDao;
import io.renren.modules.project.entity.ProjectEntity;
import io.renren.modules.project.service.ProjectService;
import org.springframework.transaction.annotation.Transactional;


@Service("projectService")
public class ProjectServiceImpl extends ServiceImpl<ProjectDao, ProjectEntity> implements ProjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String)params.get("key");

        Page<ProjectEntity> page = this.selectPage(
                new Query<ProjectEntity>(params).getPage(),
                new EntityWrapper<ProjectEntity>().like(StringUtils.isNotBlank(key),"project_name", key)
        );

        return new PageUtils(page);
    }

    @Override
    public List<ProjectEntity> queryList(Map<String, Object> params){
        String contractNo = (String)params.get("contractNo");
        List<ProjectEntity> lsit = this.selectList( new EntityWrapper<ProjectEntity>().eq("contract_no", contractNo));
        return lsit;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(ProjectEntity entity) {
        this.insert(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(ProjectEntity entity) {
        this.updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteBatch(Long[] roleIds) {
        //删除
        this.deleteBatchIds(Arrays.asList(roleIds));
    }

}