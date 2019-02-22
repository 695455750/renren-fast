package io.renren.modules.generator.controller;

import io.renren.common.utils.R;
import io.renren.modules.generator.entity.MusicListEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("generator/musicSearch")
@Api("乐谱搜索")
@EnableSwagger2
public class MusicSearchController {
    /**
     * 搜索列表
     */
    @ApiOperation("搜索列表")
    @GetMapping("/list")
    public R list(@RequestParam String name) {
        List<MusicListEntity> musicListEntity = new ArrayList<>();
        try {
            String[] args1 = new String[]{"python", "F:\\python\\zgqpw.py", name};
            Process pr = Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                MusicListEntity entity = new MusicListEntity();
                entity.setTitle(line.split("_wyb_")[0]);
                entity.setHref(line.split("_wyb_")[1]);
                musicListEntity.add(entity);
            }
            in.close();
            pr.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.ok().put("page", musicListEntity);
    }
    /**
     * 搜索列表
     */
    @ApiOperation("搜索列表")
    @GetMapping("/findImg")
    public R findImg(@RequestParam String href) {
        List<String> imgList = new ArrayList<>();
        try {
            String[] args1 = new String[]{"python", "F:\\python\\zgqpw2.py", href};
            Process pr = Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                imgList.add(line);
            }
            in.close();
            pr.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.ok().put("page", imgList);
    }
}
