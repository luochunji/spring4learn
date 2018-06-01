package com.cjluo.chapter10.condition;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author：luocj
 * @date：2018/5/31
 */
public class Page implements Serializable {

    private int pageSize = 10;

    private int totalRecord = 0;

    private int currentPage = 1;

    private int totalPage = 0;

    private List records = Collections.emptyList();

    public Page() {
    }

    public Page(int pageSize, int currentPage) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public Page(int pageSize, int totalRecord, int currentPage) {
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        this.currentPage = currentPage;
    }

    /**
     * 查询startIndex，第一条记录从1开始
     *
     * @return
     */
    public int getStartIndex() {
        if (this.currentPage > 0) {
            return (this.currentPage - 1) * this.pageSize + 1;
        }
        return 0;
    }

    /**
     * 查询endIndex
     *
     * @return
     */
    public int getEndIndex() {
        if (this.currentPage > 0) {
            return this.currentPage * this.pageSize;
        }
        return 0;
    }


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return (int) Math.ceil((this.totalRecord * 1.0d) / this.pageSize);
    }

    public <T> List<T> getRecords() {
        return records;
    }

    public <T> void setRecords(List<T> records) {
        this.records = records;
    }

    /**
     * 字段定义名
     *
     * @author xiezm
     */
    public static class FieldDomain {

        /**
         * 开始记录位置
         */
        public static final String RECORD_START = "recordStart";

        /**
         * 结束记录位置
         */
        public static final String RECORD_END = "recordEnd";

        /**
         * 每页显示记录数
         */
        public static final String PAGE_SIZE = "pageSize";

        /**
         * 查询结果总记录数
         */
        public static final String TOTAL_RECORD = "totalRecord";

        /**
         * 每页显示记录数
         */
        public static final String CURRENT_PAGE = "currentPage";

        /**
         * 总共页数
         */
        public static final String TOTAL_PAGE = "totalPage";

        /**
         * 记录集
         */
        public static final String RECORDS = "records";
    }
}
