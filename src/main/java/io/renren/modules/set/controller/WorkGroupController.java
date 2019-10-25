package io.renren.modules.set.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.set.entity.WorkGroupEntity;
import io.renren.modules.set.service.WorkGroupService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 部门列表
 *
 * @author ygg
 * @date 2019-10-23 17:08:31
 */
@RestController
@RequestMapping("/set/workgroup")
public class WorkGroupController {
    @Autowired
    private WorkGroupService workGroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("set:workgroup:list")
    public R list(@RequestParam Map<String, Object> params){
        List<WorkGroupEntity> groupList = workGroupService.selectList(new EntityWrapper<WorkGroupEntity>().orderBy("orderNum" , true));
        for (WorkGroupEntity sysMenuEntity : groupList) {
            WorkGroupEntity parentMenuEntity = workGroupService.selectById(sysMenuEntity.getpId());
            if (parentMenuEntity != null) {
                sysMenuEntity.setParentName(parentMenuEntity.getname());
            }
        }
        return R.ok().put("list", groupList);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("set:workgroup:info")
    public R info(@PathVariable("id") Integer id){
		WorkGroupEntity workGroup = workGroupService.selectById(id);

        return R.ok().put("workGroup", workGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("set:workgroup:save")
    public R save(@RequestBody WorkGroupEntity workGroup){
		workGroupService.save(workGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("set:workgroup:update")
    public R update(@RequestBody WorkGroupEntity workGroup){
		workGroupService.updateById(workGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("set:workgroup:delete")
    public R delete(@RequestBody Long[] ids){
		workGroupService.deleteBatch(ids);

        return R.ok();
    }

}
