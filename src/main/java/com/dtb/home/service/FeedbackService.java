package com.dtb.home.service;

import com.dtb.entity.FeedbackWithBLOBs;

/**
 * @author banglin
 * @version 1.0.0
 * @create 2021/3/24-20:26
 */
public interface FeedbackService {

    /**
     * 添加反馈记录
     *
     * @param feedback 参数
     * @return java.lang.Integer
     * @author banglin
     * @date 2021/3/24 20:27
     */
    Integer addFeedback(FeedbackWithBLOBs feedback);
}
