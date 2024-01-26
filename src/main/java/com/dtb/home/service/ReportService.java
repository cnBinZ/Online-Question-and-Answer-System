package com.dtb.home.service;

import com.dtb.entity.Report;

/**
 * @author banglin
 * @version 1.0.0
 * @create 2021/4/21-22:22
 */
public interface ReportService {

    /**
     * 添加举报
     *
     * @param report 参数
     * @return java.lang.Integer
     * @author banglin
     * @date 2021/4/21 22:23
     */
    Integer addReport(Report report);
}
