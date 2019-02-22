package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.HhoUserDao;
import io.renren.modules.generator.entity.HhoUserEntity;
import io.renren.modules.generator.service.HhoUserService;


@Service("hhoUserService")
public class HhoUserServiceImpl extends ServiceImpl<HhoUserDao, HhoUserEntity> implements HhoUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HhoUserEntity> page = this.selectPage(
                new Query<HhoUserEntity>(params).getPage(),
                new EntityWrapper<HhoUserEntity>()
        );

        return new PageUtils(page);
    }

}
