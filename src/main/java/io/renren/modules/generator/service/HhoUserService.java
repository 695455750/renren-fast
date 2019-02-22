package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.HhoUserEntity;

import java.util.Map;

/**
 * 客户管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-24 14:39:32
 */
public interface HhoUserService extends IService<HhoUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

