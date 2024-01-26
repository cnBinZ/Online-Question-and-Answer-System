package com.dtb.home.service;

import com.dtb.entity.Grade;

import java.util.List;

/**
 * @Author：banglin
 * @Description：
 * @Date：Created on 16:55 2021/3/3.
 * @ModifyBy：
 */
public interface GradeService {

    /**
     * @auther: banglin
     * @date: 2021/3/3 16:59
     * @descript: 查询所有年级信息
     * @param:
     * @return: java.util.List<com.dtb.entity.Grade>
     */
    List<Grade> findAll();

    /**
     * @auther: banglin
     * @date: 2021/3/3 17:00
     * @descript: 根据id查询年级信息
     * @param: id 年级id
     * @return: com.dtb.entity.Grade
     */
    Grade findById(Integer id);
}
