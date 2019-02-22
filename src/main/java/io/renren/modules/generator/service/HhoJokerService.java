package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.dto.BestCondition;
import io.renren.modules.generator.dto.OptDto;
import io.renren.modules.generator.dto.RandomDto;
import io.renren.modules.generator.entity.HhoJokerEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-24 14:39:32
 */
public interface HhoJokerService extends IService<HhoJokerEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<HhoJokerEntity> findRandom(RandomDto randomDto);

    List<HhoJokerEntity> findBest(BestCondition condition);

    void customOpt(OptDto optDto);
}

