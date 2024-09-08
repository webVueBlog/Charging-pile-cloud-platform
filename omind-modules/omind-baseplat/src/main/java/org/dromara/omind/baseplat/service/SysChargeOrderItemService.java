package org.dromara.omind.baseplat.service;

import org.dromara.omind.baseplat.api.domain.ChargeDetailData;
import org.dromara.omind.baseplat.api.domain.entity.SysChargeOrderItem;

import java.util.List;

/**
 * 订单明细服务接口
 */
public interface SysChargeOrderItemService {

    List<ChargeDetailData> getList4StartChargeSeq(String startChargeSeq);

    /**
     * 更新订单明细（会删除旧的明细）
     * @param startChargeSeq
     * @param list
     * @return
     */
    boolean saveBatch(String startChargeSeq, List<SysChargeOrderItem> list);

}
