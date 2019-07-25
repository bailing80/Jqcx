package com.xm.xmap1702044.base;

import com.baomidou.mybatisplus.plugins.Page;

public class PageUtil {
    public static PageManager initPageManager(PageManager pageManager, Page page){
        PageManager page_ = new PageManager();
        int pageCount = page.getPages();
        // 如果传过来的当前页码大于总页码 则把当前页码设置为最大页码
        if (pageManager.getPage() + 1 > pageCount && pageCount != 0) {
            pageManager.setPage(pageCount);
        }
        if(pageManager.getPageRows()==-1){
            pageManager.setPageRows(10);
        }
        page_.setTotalCount(page.getTotal());
        // 将页面传过来的当前页传回到前台
        page_.setPage(pageManager.getPage() + 1);
        page_.setTotalPages(pageCount);
        page_.setData(page.getRecords());
        page_.setsEcho(pageManager.getsEcho());
        return page_;
    }
}
