package org.dromara.system.api;

import org.dromara.system.api.domain.bo.RemoteSocialBo;
import org.dromara.system.api.domain.vo.RemoteSocialVo;

import java.util.List;

/**
 * 社会化关系服务
 *
 * 
 */
public interface RemoteSocialService {

    /**
     * 根据 authId 查询用户信息
     */
    List<RemoteSocialVo> selectByAuthId(String authId);

    /**
     * 保存社会化关系
     */
    void insertByBo(RemoteSocialBo bo);

    /**
     * 更新社会化关系
     */
    void updateByBo(RemoteSocialBo bo);

    /**
     * 删除社会化关系
     */
    Boolean deleteWithValidById(Long socialId);

}
