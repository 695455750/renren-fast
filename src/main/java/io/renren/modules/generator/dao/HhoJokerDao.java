package io.renren.modules.generator.dao;

import io.renren.modules.generator.dto.BestCondition;
import io.renren.modules.generator.dto.OptDto;
import io.renren.modules.generator.dto.RandomDto;
import io.renren.modules.generator.entity.HhoJokerEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-24 14:39:32
 */
@Mapper
public interface HhoJokerDao extends BaseMapper<HhoJokerEntity> {
	List<HhoJokerEntity> findBest(BestCondition condition);

	List<HhoJokerEntity> findRandom(RandomDto randomDto);

	void customOpt(OptDto optDto);
}
