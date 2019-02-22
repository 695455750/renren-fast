package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import io.renren.modules.generator.dto.BestCondition;
import io.renren.modules.generator.dto.OptDto;
import io.renren.modules.generator.dto.RandomDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.generator.entity.HhoJokerEntity;
import io.renren.modules.generator.service.HhoJokerService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-24 14:39:32
 */
@RestController
@RequestMapping("generator/hhojoker")
@Api("笑话管理")
@EnableSwagger2
public class HhoJokerController {
    @Autowired
    private HhoJokerService hhoJokerService;
    private static final String TEXT_TYPE = "10";
    private static final String IMG_TYPE = "20";
    private static int LIMIT = 10;
    /**
     * 列表
     */
    @ApiOperation("列表")
    @GetMapping("/list")
//    @RequiresPermissions("generator:hhojoker:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = hhoJokerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("单个信息")
    @GetMapping("/info/{id}")
//    @RequiresPermissions("generator:hhojoker:info")
    public R info(@PathVariable("id") String id) {
        HhoJokerEntity hhoJoker = hhoJokerService.selectById(id);

        return R.ok().put("hhoJoker", hhoJoker);
    }

    /**
     * 保存
     */
    @ApiOperation("添加")
    @PostMapping("/save")
//    @RequiresPermissions("generator:hhojoker:save")
    public R save(@RequestBody HhoJokerEntity hhoJoker) {
        hhoJokerService.insert(hhoJoker);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
//    @RequiresPermissions("generator:hhojoker:update")
    public R update(@RequestBody HhoJokerEntity hhoJoker) {
        hhoJokerService.updateById(hhoJoker);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
//    @RequiresPermissions("generator:hhojoker:delete")
    public R delete(@RequestBody String[] ids) {
        hhoJokerService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

    /**
     * 查询数据
     *
     * @return
     */
    @ApiOperation("根据用户本地保存的标识查询最佳数据")
    @PostMapping("/findBest")
    public R find(@RequestBody BestCondition condition) {
        List<HhoJokerEntity> page = hhoJokerService.findBest(condition);

        return R.ok().put("page", page);
    }

    /**
     * 查询数据
     *
     * @return
     */
    @ApiOperation("随机查10条")
    @GetMapping("/findRandom/{type}")
    public R findRandom(@PathVariable("type") String type) {
        Integer random = 0;
        if (TEXT_TYPE.equals(type)) {
            random = new Random().nextInt(11360);
        }else if(IMG_TYPE.equals(type)){
            random = new Random().nextInt(20204);
        }
        RandomDto randomDto = new RandomDto();
        randomDto.setType(type);
        randomDto.setPage(random);
        randomDto.setLimit(LIMIT);
        List<HhoJokerEntity> page = hhoJokerService.findRandom(randomDto);

        return R.ok().put("page", page);
    }
    /**
     * 顶 踩 转发评分计数
     */
    @ApiOperation("用户操作（顶、踩、转发等）")
    @PostMapping("/opt")
    public R opt(@RequestBody OptDto optDto) {

        hhoJokerService.customOpt(optDto);

        return R.ok();
    }
}
