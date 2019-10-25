package io.renren.modules.set.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.set.entity.WorkGroupEntity;

import java.util.Map;

/**
 * 部门列表
 *
 * @author ygg
 * @date 2019-10-23 17:08:31
 */
public interface WorkGroupService extends IService<WorkGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void save(WorkGroupEntity role);

    void update(WorkGroupEntity role);

    void deleteBatch(Long[] roleIds);
}

