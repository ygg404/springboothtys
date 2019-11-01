package io.renren.modules.project.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.project.entity.ProjectEntity;
import io.renren.modules.project.service.ProjectService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 项目列表
 *
 * @author ygg
 * @date 2019-10-31 11:36:02
 */
@RestController
@RequestMapping("project/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("project:project:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = projectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("project:project:info")
    public R info(@PathVariable("id") Integer id){
		ProjectEntity project = projectService.selectById(id);

        return R.ok().put("project", project);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("project:project:save")
    public R save(@RequestBody ProjectEntity project){
		projectService.save(project);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("project:project:update")
    public R update(@RequestBody ProjectEntity project){
		projectService.updateById(project);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("project:project:delete")
    public R delete(@RequestBody Long[] ids){
		projectService.deleteBatch(ids);

        return R.ok();
    }

}
