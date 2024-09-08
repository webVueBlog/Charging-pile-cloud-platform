package org.dromara.omind.baseplat.api.service.pile;


import org.dromara.common.core.exception.base.BaseException;
import org.dromara.omind.baseplat.api.domain.entity.SysOperator;
import org.dromara.omind.baseplat.api.domain.request.QueryStopChargeData;

public interface RemoteStopChargingService {

    /**
     * 停止充电
     * @param sysOperator 操作员
     * @param queryStopChargeData 查询停止充电数据
     * @return
     * @throws BaseException
     */
    int stopCharging(SysOperator sysOperator, QueryStopChargeData queryStopChargeData) throws BaseException;

}
