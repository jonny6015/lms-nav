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
import cn.lmsite.lmsnav.core.common.node.ZTreeNode;
import cn.lmsite.lmsnav.modular.system.model.Dept;

import java.util.List;
import java.util.Map;

/**
 * 部门服务
 *
 * @author jonny
 * @date 2019-04-27 17:00
 */
public interface IDeptService extends IService<Dept> {

    /**
     * 删除部门
     */
    void deleteDept(Integer deptId);

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();

    /**
     * 获取所有部门列表
     */
    List<Map<String, Object>> list(String condition);
}
