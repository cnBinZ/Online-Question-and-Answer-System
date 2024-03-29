package com.dtb.home.service;

import com.dtb.entity.Subject;

import java.util.List;

/**
 * @Author：banglin
 * @Description：
 * @Date：Created on 16:49 2021/3/3.
 * @ModifyBy：
 */
public interface SubjectService {

    /**
     * @auther: banglin
     * @date: 2021/3/3 16:49
     * @descript: 查询所有学科分类
     * @param:
     * @return: java.util.List<com.dtb.entity.Subject>
     */
    List<Subject> findAll();

    /**
     * @auther: banglin
     * @date: 2021/3/3 16:51
     * @descript: 根据学科主键id查询
     * @param: id 主键id
     * @return: com.dtb.entity.Subject
     */
    Subject findById(Integer id);
}
