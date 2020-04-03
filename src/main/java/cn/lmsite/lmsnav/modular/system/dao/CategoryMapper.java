package cn.lmsite.lmsnav.modular.system.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.lmsite.lmsnav.core.common.node.MenuNode;
import cn.lmsite.lmsnav.core.common.node.ZTreeNode;
import cn.lmsite.lmsnav.modular.system.model.Category;

public interface CategoryMapper extends BaseDao<Category> {

    List<Category> getCatogry(Map map);

    List<MenuNode> getCatogryNode(Map map);

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();
}
