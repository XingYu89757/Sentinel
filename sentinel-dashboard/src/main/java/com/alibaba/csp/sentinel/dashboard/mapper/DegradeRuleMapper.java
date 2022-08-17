package com.alibaba.csp.sentinel.dashboard.mapper;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.mysql.DegradeRule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yu.xing
 * @since 2022-08-04
 */
@Mapper
public interface DegradeRuleMapper extends BaseMapper<DegradeRule> {

}