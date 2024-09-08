package org.dromara.omind.userplat.api.service;

import org.dromara.omind.userplat.api.domain.entity.OmindUserEntity;

/**
 * RemoteOmindUserService是 一个远程服务接口，用于处理用户相关的操作。
 */
public interface RemoteOmindUserService {

    OmindUserEntity getUserByUnionId(String unionId);

    Boolean addUser(OmindUserEntity userEntity);

    Boolean updateById(OmindUserEntity userEntity);

    OmindUserEntity getUserById(Long uid);
}
