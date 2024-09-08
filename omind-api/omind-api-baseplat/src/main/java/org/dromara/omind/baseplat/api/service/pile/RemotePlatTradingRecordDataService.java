package org.dromara.omind.baseplat.api.service.pile;

import org.dromara.omind.baseplat.api.domain.entity.PlatTradingRecordData;

public interface RemotePlatTradingRecordDataService {

    /**
     * 根据交易号查询交易记录
     * @param tradeNo
     * @return
     */
    PlatTradingRecordData getByTradeNo(String tradeNo);

    /**
     * 保存交易记录
     * @param platTradingRecordData
     * @return
     */
    boolean save(PlatTradingRecordData platTradingRecordData);

}
