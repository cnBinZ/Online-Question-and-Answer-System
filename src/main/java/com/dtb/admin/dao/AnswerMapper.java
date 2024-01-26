package com.dtb.admin.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author banglin
 * @version 1.0.0
 * @create 2021/4/2-23:08
 */
@Repository("answerAdminMapper")
public interface AnswerMapper {

    /**
     * 根据id删除
     *
     * @param id 主键
     * @return java.lang.Integer
     * @author banglin
     * @date 2021/4/2 23:09
     */
    Integer softDeleteById(@Param("id") Integer id);
}
