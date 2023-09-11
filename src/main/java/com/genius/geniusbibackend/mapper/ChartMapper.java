package com.genius.geniusbibackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.genius.geniusbibackend.model.entity.Chart;

import java.util.List;
import java.util.Map;

/**
 * @Entity com.genius.geniusbibackend.model.entity.Chart
 */
public interface ChartMapper extends BaseMapper<Chart> {

    List<Map<String, Object>> queryChartData(String querySql);
}




