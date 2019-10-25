package io.renren.modules.set.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.set.dao.WorkGroupDao;
import io.renren.modules.set.entity.WorkGroupEntity;
import io.renren.modules.set.service.WorkGroupService;
import org.springframework.transaction.annotation.Transactional;


@Service("workGroupService")
public class WorkGroupServiceImpl extends ServiceImpl<WorkGroupDao, WorkGroupEntity> implements WorkGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String)params.get("key");

        Page<WorkGroupEntity> page = this.selectPage(
                new Query<WorkGroupEntity>(params).getPage(),
                new EntityWrapper<WorkGroupEntity>().like(StringUtils.isNotBlank(key),"id", key)
        );

        return new PageUtils(page);
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(WorkGroupEntity workGroupEntity) {
        this.insert(workGroupEntity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(WorkGroupEntity workGroupEntity) {
        this.updateById(workGroupEntity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteBatch(Long[] roleIds) {
        //删除
        this.deleteBatchIds(Arrays.asList(roleIds));
    }

}