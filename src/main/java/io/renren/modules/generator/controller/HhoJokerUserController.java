package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.HhoJokerUserEntity;
import io.renren.modules.generator.service.HhoJokerUserService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-01-30 16:06:09
 */
@RestController
@RequestMapping("generator/hhojokeruser")
public class HhoJokerUserController {
    @Autowired
    private HhoJokerUserService hhoJokerUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:hhojokeruser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hhoJokerUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:hhojokeruser:info")
    public R info(@PathVariable("id") String id){
			HhoJokerUserEntity hhoJokerUser = hhoJokerUserService.selectById(id);

        return R.ok().put("hhoJokerUser", hhoJokerUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:hhojokeruser:save")
    public R save(@RequestBody HhoJokerUserEntity hhoJokerUser){
			hhoJokerUserService.insert(hhoJokerUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:hhojokeruser:update")
    public R update(@RequestBody HhoJokerUserEntity hhoJokerUser){
			hhoJokerUserService.updateById(hhoJokerUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:hhojokeruser:delete")
    public R delete(@RequestBody String[] ids){
			hhoJokerUserService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
