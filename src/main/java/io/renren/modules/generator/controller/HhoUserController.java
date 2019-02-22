package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.generator.entity.HhoUserEntity;
import io.renren.modules.generator.service.HhoUserService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 客户管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-24 14:39:32
 */
@Api("用户管理")
@RestController
@RequestMapping("generator/hhouser")
@EnableSwagger2
public class HhoUserController {
    @Autowired
    private HhoUserService hhoUserService;

    /**
     * 列表
     */
    @ApiOperation("列表")
    @GetMapping("/list")
    @RequiresPermissions("generator:hhouser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hhoUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("单个查询")
    @GetMapping("/info/{id}")
    @RequiresPermissions("generator:hhouser:info")
    public R info(@PathVariable("id") String id){
			HhoUserEntity hhoUser = hhoUserService.selectById(id);

        return R.ok().put("hhoUser", hhoUser);
    }

    /**
     * 保存
     */
    @ApiOperation("添加")
    @PostMapping("/save")
    @RequiresPermissions("generator:hhouser:save")
    public R save(@RequestBody HhoUserEntity hhoUser){
			hhoUserService.insert(hhoUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @RequiresPermissions("generator:hhouser:update")
    public R update(@RequestBody HhoUserEntity hhoUser){
			hhoUserService.updateById(hhoUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @RequiresPermissions("generator:hhouser:delete")
    public R delete(@RequestBody String[] ids){
			hhoUserService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
