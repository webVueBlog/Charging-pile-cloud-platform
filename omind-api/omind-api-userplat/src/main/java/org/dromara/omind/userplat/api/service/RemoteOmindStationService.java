package org.dromara.omind.userplat.api.service;

import org.dromara.omind.userplat.api.domain.entity.OmindStationEntity;

import java.util.List;

/**
 * 远程站点服务接口
 */
public interface RemoteOmindStationService {

    OmindStationEntity get(String stationId);

    List<OmindStationEntity> getAllGeoData();

}
