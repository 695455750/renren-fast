package io.renren.modules.generator.service.impl;

import io.renren.modules.generator.dto.BestCondition;
import io.renren.modules.generator.dto.OptDto;
import io.renren.modules.generator.dto.RandomDto;
import io.renren.modules.generator.entity.HhoJokerUserEntity;
import io.renren.modules.generator.service.HhoJokerUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.HhoJokerDao;
import io.renren.modules.generator.entity.HhoJokerEntity;
import io.renren.modules.generator.service.HhoJokerService;
import org.springframework.transaction.annotation.Transactional;


@Service("hhoJokerService")
public class HhoJokerServiceImpl extends ServiceImpl<HhoJokerDao, HhoJokerEntity> implements HhoJokerService {
    @Autowired
    private HhoJokerDao hhoJokerDao;
    @Autowired
    private HhoJokerUserService hhoJokerUserService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HhoJokerEntity> page = this.selectPage(
                new Query<HhoJokerEntity>(params).getPage(),
                new EntityWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<HhoJokerEntity> findRandom(RandomDto randomDto) {
        return hhoJokerDao.findRandom(randomDto);
    }

    @Override
    public List<HhoJokerEntity> findBest(BestCondition condition) {
        return hhoJokerDao.findBest(condition);
    }
    @Transactional
    @Override
    public void customOpt(OptDto optDto) {
        HhoJokerUserEntity jokerUserEntity = new HhoJokerUserEntity();
        jokerUserEntity.setCid(optDto.getcId());
        jokerUserEntity.setHate(optDto.getHate());
        jokerUserEntity.setJokerId(optDto.getjId());
        jokerUserEntity.setLove(optDto.getLove());
        jokerUserEntity.setRepost(optDto.getRepost());
        jokerUserEntity.setRecordTime(new Date());
        //先插入记录表
        hhoJokerUserService.insert(jokerUserEntity);
        //更新主表
        hhoJokerDao.customOpt(optDto);
    }

}
