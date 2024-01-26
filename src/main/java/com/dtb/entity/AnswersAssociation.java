package com.dtb.entity;

/**
 * @Author：banglin
 * @Description：
 * @Date：Created on 23:16 2021/3/6.
 * @ModifyBy：
 */
public class AnswersAssociation extends AnswersWithBLOBs {

    private User user;

    private QuestionsWithBLOBs question;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public QuestionsWithBLOBs getQuestion() {
        return question;
    }

    public void setQuestion(QuestionsWithBLOBs question) {
        this.question = question;
    }
}
