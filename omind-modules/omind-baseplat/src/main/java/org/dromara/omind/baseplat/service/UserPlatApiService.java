package org.dromara.omind.baseplat.service;

import org.dromara.omind.baseplat.api.domain.entity.SysOperator;
import org.dromara.omind.baseplat.api.domain.response.QueryEquipBusinessPolicyResponseData;
import org.dromara.omind.baseplat.api.domain.response.QueryTokenResponseData;

/**
 * 用户平台接口
 */
public interface UserPlatApiService {

    QueryTokenResponseData authLogin(SysOperator sysOperator);

    QueryEquipBusinessPolicyResponseData policyInfo(String connectorId);

    String getTokenAuto(SysOperator sysOperator);

    String refreshToken(SysOperator sysOperator);

}
