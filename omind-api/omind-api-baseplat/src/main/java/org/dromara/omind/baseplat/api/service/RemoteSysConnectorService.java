package org.dromara.omind.baseplat.api.service;

import org.dromara.omind.baseplat.api.domain.ConnectorInfoData;
import org.dromara.omind.baseplat.api.domain.entity.SysConnector;

import java.util.Date;
import java.util.List;

/**
 * 充电接口服务
 */
public interface RemoteSysConnectorService {

    /**
     * 根据充电接口ID获取充电接口信息
     * @param connectorId
     * @return
     */
    SysConnector getConnectorById(String connectorId);

    /**
     * 根据设备ID获取充电接口信息
     * @param equipmentId
     * @return
     */
    List<ConnectorInfoData> getAllByEquipmentId(String equipmentId);

    /**
     * 根据设备ID获取充电接口ID列表
     * @param equipmentId
     * @return
     */
    List<String> getAllIdByEquipmentId(String equipmentId);

    Boolean add(SysConnector sysConnector);

    Boolean updateById(SysConnector sysConnector);

    Boolean remove(SysConnector sysConnector);

    /**
     * 将心跳更新时间更新至缓存，数据库不更新，防止I/O影响性能
     * @param connectorId   充电接口ID
     * @param tm            心跳时间戳
     * @return
     */
    Boolean updatePingTm2Cache(String connectorId, Date tm);


}
