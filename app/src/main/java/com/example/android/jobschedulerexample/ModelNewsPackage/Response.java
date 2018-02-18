package com.example.android.jobschedulerexample.ModelNewsPackage;

import android.nfc.Tag;

/**
 * Created by c4q on 2/18/18.
 */

public class Response {
    private String status;
    private String userTier;
    private int total;
    private int startIndex;
    private int pageSize;
    private String orderBy;
    private Tag tag;
    private LeadContent[] leadContent;
    private Results[] results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserTier() {
        return userTier;
    }

    public void setUserTier(String userTier) {
        this.userTier = userTier;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public LeadContent[] getLeadContent() {
        return leadContent;
    }

    public void setLeadContent(LeadContent[] leadContent) {
        this.leadContent = leadContent;
    }

    public Results[] getResults() {
        return results;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }
}
