package org.dromara.omind.baseplat.service;

import org.dromara.omind.baseplat.domain.request.StationStatsFullRequest;
import org.dromara.omind.baseplat.domain.response.StationStatsFullResponse;

/**
 * 统计服务
 */
public interface StatsService {

    StationStatsFullResponse stationStats(StationStatsFullRequest request);

}
