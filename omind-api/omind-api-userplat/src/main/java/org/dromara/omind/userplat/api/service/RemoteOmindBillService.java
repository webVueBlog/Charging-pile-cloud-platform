package org.dromara.omind.userplat.api.service;

import org.dromara.omind.userplat.api.domain.entity.OmindBillEntity;

/**
 * 账单服务
 * RemoteOmindBillService是 一个接口，用于定义获取账单信息的方法。
 */
public interface RemoteOmindBillService {

    OmindBillEntity get(String startChargeSeq);

    OmindBillEntity getLatest(String connectorId);

}
