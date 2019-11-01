package io.renren.modules.project.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.modules.project.entity.ProjectContractEntity;
import io.renren.modules.project.service.ProjectContractService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 合同表
 *
 * @author ygg
 * @date 2019-10-30 15:40:10
 */
@RestController
@RequestMapping("project/contract")
public class ProjectContractController {
    @Autowired
    private ProjectContractService projectContractService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("project:contract:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = projectContractService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("project:contract:info")
    public R info(@PathVariable("id") Integer id){
		ProjectContractEntity projectContract = projectContractService.selectById(id);

        return R.ok().put("projectContract", projectContract);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("project:contract:save")
    public R save(@RequestBody ProjectContractEntity projectContract){
		projectContractService.save(projectContract);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("project:contract:update")
    public R update(@RequestBody ProjectContractEntity projectContract){
		projectContractService.updateById(projectContract);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("project:contract:delete")
    public R delete(@RequestBody Long[] ids){
		projectContractService.deleteBatch(ids);

        return R.ok();
    }

}
