package com.dtb.admin.service;

/**
 * @author banglin
 * @version 1.0.0
 * @create 2021/4/2-23:09
 */
public interface AnswerService {

    /**
     * 根据id删除
     *
     * @param id 主键
     * @return java.lang.Integer
     * @author banglin
     * @date 2021/4/2 23:09
     */
    Integer softDeleteById(Integer id);
}
