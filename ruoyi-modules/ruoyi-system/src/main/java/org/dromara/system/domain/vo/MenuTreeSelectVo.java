package org.dromara.system.domain.vo;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 角色菜单列表树信息
 *
 * 
 */
@Data
public class MenuTreeSelectVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 选中菜单列表
     */
    private List<Long> checkedKeys;

    /**
     * 菜单下拉树结构列表
     */
    private List<Tree<Long>> menus;

}