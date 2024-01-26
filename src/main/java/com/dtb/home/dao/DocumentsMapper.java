package com.dtb.home.dao;

import com.dtb.entity.Documents;
import com.dtb.entity.DocumentsAssociation;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface DocumentsMapper {
    int deleteByPrimaryKey(Integer id);


    /**
     * @auther banglin
     * @date 2021/3/17 21:20
     * @descript 添加一个文档
     * @param record 文档实体类
     * @return int受影响行数
     */
    int insertSelective(Documents record);

    /**
     * @auther banglin
     * @date 2021/3/19 22:45
     * @descript 分页查询文件列表
     * @param documents
     * @return com.github.pagehelper.Page<com.dtb.entity.DocumentsAssociation>
     */
    Page<DocumentsAssociation> selectDocumentListToLimit(Documents documents);

    /**
     * @param id 文档id
     * @return java.lang.Integer
     * @auther banglin
     * @date 2021/3/21 23:11
     * @descript 下载次数自增一
     */
    @Update("UPDATE as_documents SET download_count=download_count+1,update_time=CURRENT_TIMESTAMP WHERE id = #{id}")
    Integer downloadCountAdd(@Param("id") Integer id);

    Documents selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 根据主键修改信息
     * @author banglin
     * @date 2021/3/27 21:34
     * @param record 参数
     * @return java.lang.Integer
     */
    Integer updateByPrimaryKeySelective(Documents record);

    /**
     * 根据当前用户的评分，计算出此文档的平均分
     * @author banglin
     * @date 2021/3/28 0:24
     * @param id 文档id
     * @param score 用户评分
     * @return java.lang.Integer
     */
    Integer changeDocumentScoreById(@Param("id") Integer id, @Param("score") Float score);
}