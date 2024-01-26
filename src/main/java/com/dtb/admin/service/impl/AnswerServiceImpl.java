package com.dtb.admin.service.impl;

import com.dtb.admin.dao.AnswerMapper;
import com.dtb.admin.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author banglin
 * @version 1.0.0
 * @create 2021/4/2-23:09
 */
@Service("answerAdminService")
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Integer softDeleteById(Integer id) {
        return answerMapper.softDeleteById(id);
    }
}
