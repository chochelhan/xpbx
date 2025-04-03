package com.xpbx.xpbx.domain;

public class AddRinggroupPaging extends AddRinggroup {
    private String page;
    private int limit;
    private int start;

    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }

}
