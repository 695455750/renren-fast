package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.HhoJokerUserEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-01-30 16:06:09
 */
public interface HhoJokerUserService extends IService<HhoJokerUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

