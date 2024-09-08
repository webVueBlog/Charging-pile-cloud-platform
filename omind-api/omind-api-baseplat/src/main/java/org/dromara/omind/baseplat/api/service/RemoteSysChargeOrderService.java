package org.dromara.omind.baseplat.api.service;

import org.dromara.common.core.exception.base.BaseException;
import org.dromara.omind.baseplat.api.domain.entity.SysChargeOrder;

public interface RemoteSysChargeOrderService {

    /**
     * 根据开始充电流水号查询充电订单
     * @param startChargeSeq
     * @return
     */
    SysChargeOrder getChargeOrderByStartChargeSeq(String startChargeSeq);

    void save(SysChargeOrder sysChargeOrder) throws BaseException;

    void update(SysChargeOrder sysChargeOrder) throws BaseException;

}
