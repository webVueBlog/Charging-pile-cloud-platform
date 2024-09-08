package org.dromara.omind.userplat.api.service;

import org.dromara.omind.userplat.api.domain.entity.OmindStationImageEntity;

import java.util.List;

/**
 * 远程调用站点镜像服务
 */
public interface RemoteOmindStationImageService {

    List<OmindStationImageEntity> all(String stationId);

}
