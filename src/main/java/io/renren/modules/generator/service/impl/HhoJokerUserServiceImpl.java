package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.HhoJokerUserDao;
import io.renren.modules.generator.entity.HhoJokerUserEntity;
import io.renren.modules.generator.service.HhoJokerUserService;


@Service("hhoJokerUserService")
public class HhoJokerUserServiceImpl extends ServiceImpl<HhoJokerUserDao, HhoJokerUserEntity> implements HhoJokerUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HhoJokerUserEntity> page = this.selectPage(
                new Query<HhoJokerUserEntity>(params).getPage(),
                new EntityWrapper<HhoJokerUserEntity>()
        );

        return new PageUtils(page);
    }

}
