/**
 * Copyright 2018-2020 Jonny Chang  (https://github.com/jonny6015)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.lmsite.lmsnav.modular.system.service;

import com.baomidou.mybatisplus.service.IService;
import cn.lmsite.lmsnav.core.common.node.MenuNode;
import cn.lmsite.lmsnav.core.common.node.ZTreeNode;
import cn.lmsite.lmsnav.modular.system.model.Menu;

import java.util.List;
import java.util.Map;

/**
 * 菜单服务
 *
 * @author jonny
 * @date 2019-05-05 22:19
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 删除菜单
     *
     * @author Jonny Chang
     * @date 2019/5/5 22:20
     */
    void delMenu(Long menuId);

    /**
     * 删除菜单包含所有子菜单
     *
     * @author Jonny Chang
     * @date 2019/6/13 22:02
     */
    void delMenuContainSubMenus(Long menuId);

    /**
     * 根据条件查询菜单
     *
     * @return
     * @date 2019年2月12日 下午9:14:34
     */
    List<Map<String, Object>> selectMenus(String condition, String level);

    /**
     * 根据条件查询菜单
     *
     * @return
     * @date 2019年2月12日 下午9:14:34
     */
    List<Long> getMenuIdsByRoleId(Integer roleId);

    /**
     * 获取菜单列表树
     *
     * @return
     * @date 2019年2月19日 下午1:33:51
     */
    List<ZTreeNode> menuTreeList();

    /**
     * 获取菜单列表树
     *
     * @return
     * @date 2019年2月19日 下午1:33:51
     */
    List<ZTreeNode> menuTreeListByMenuIds(List<Long> menuIds);

    /**
     * 删除menu关联的relation
     *
     * @param menuId
     * @return
     * @date 2019年2月19日 下午4:10:59
     */
    int deleteRelationByMenu(Long menuId);

    /**
     * 获取资源url通过角色id
     *
     * @param roleId
     * @return
     * @date 2019年2月19日 下午7:12:38
     */
    List<String> getResUrlsByRoleId(Integer roleId);

    /**
     * 根据角色获取菜单
     *
     * @param roleIds
     * @return
     * @date 2019年2月19日 下午10:35:40
     */
    List<MenuNode> getMenusByRoleIds(List<Integer> roleIds);
}
