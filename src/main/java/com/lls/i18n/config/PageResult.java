package com.lls.i18n.config;

import java.util.List;

/************************************
 * PageResult
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
public class PageResult<T> extends Result<List<T>> {

    private int page;
    private int size;
    private long total;

    public PageResult(List<T> data) {
        super(data);
    }

    public PageResult(String code, String message, List<T> data) {
        super(code, message, data);
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

}
