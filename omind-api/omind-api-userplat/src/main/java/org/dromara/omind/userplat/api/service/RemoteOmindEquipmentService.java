package org.dromara.omind.userplat.api.service;

import org.dromara.omind.userplat.api.domain.entity.OmindEquipmentEntity;

import java.util.List;

/**
 * 设备服务
 */
public interface RemoteOmindEquipmentService {

    List<OmindEquipmentEntity> all(String stationId);

    OmindEquipmentEntity get(String equipmentId);

}
