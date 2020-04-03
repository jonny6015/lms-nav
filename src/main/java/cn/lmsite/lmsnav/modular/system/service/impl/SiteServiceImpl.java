package cn.lmsite.lmsnav.modular.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lmsite.lmsnav.core.util.Pager;
import cn.lmsite.lmsnav.modular.system.dao.SiteMapper;
import cn.lmsite.lmsnav.modular.system.model.Site;
import cn.lmsite.lmsnav.modular.system.service.BaseService;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jsnjfz
 * @Date 2019/7/21 15:17
 * 分类相关业务接口实现类
 */
@Service
public class SiteServiceImpl extends BaseService<Site> {

    @Autowired
    private SiteMapper siteMapper;

    public static Pager<Site> pager = null;

    /**
     * 分页处理
     */
    public Pager<Site> getPage(Map<String, Object> map, Integer pageNo, Integer size) {
        if (map == null) {
            if (pager != null) {
                return pager;
            }
            map = new HashMap<>();
        }
        int total = siteMapper.getTotalCount(map);
        Pager<Site> page = new Pager<>(total, pageNo, size);
        map.put("offset", pageNo);
        map.put("size", size);
        page.setList(siteMapper.getList(map));
        if (pager == null) {
            pager = page;
        }
        return page;
    }

}
