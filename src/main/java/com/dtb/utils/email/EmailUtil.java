package com.dtb.utils.email;

import java.util.Map;

/**
 * @Author：wg
 * @Description：邮件操作工具接口类
 * @Date：Created on 23:45 2021/3/1.
 * @ModifyBy：
 */
public interface EmailUtil {

    /**
     * @auther: wg
     * @date: 2021/3/2 0:04
     * @descript: 发送简单邮件
     * @param: to 收件人地址
     * @param: subject 邮件主题
     * @param: content 邮件内容
     * @return: void
     */
    public void sendSimpleMail(String to, String subject, String content);

    /**
     * @auther: wg
     * @date: 2021/3/2 0:04
     * @descript: html邮件
     * @param: to 收件人地址
     * @param: subject 邮件主题
     * @param: content 邮件内容
     * @return: void
     */
    public void sendHtmlMail(String to, String subject, String content);

    /**
     * @auther: wg
     * @date: 2021/3/2 0:04
     * @descript: 带附件邮件
     * @param: to 收件人地址
     * @param: subject 邮件主题
     * @param: content 邮件内容
     * @param: filePath 附件文件路径
     * @return: void
     */
    public void sendAttachmentsMail(String to, String subject, String content, String filePath);

    /**
     * @auther: wg
     * @date: 2021/3/2 0:05
     * @descript: 带静态资源文件（图片）的邮件
     * @param: to 收件人地址
     * @param: subject 邮件主题
     * @param: content 邮件内容
     * @param: rscPath 图片地址
     * @param: rscId
     * @return: void
     */
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

    /**
     * @auther: wg
     * @date: 2021/3/2 1:10
     * @descript: 发送模板邮件
     * @param: to 收件人地址
     * @param: subject 邮件主题
     * @param: paramsMap 模板参数map
     * @param: templateName 模板地址名称
     * @return: void
     */
    public void sendTemplateMail(String to, String subject, Map<String, Object> paramsMap, String templateName);

    /**
     * 异步发送邮件
     *
     * @param to           接收者
     * @param subject      主题
     * @param paramsMap    参数
     * @param templateName 模板名
     * @author wg
     * @date 2021/4/6 12:21
     */
    public void sendTemplateMailAsync(final String to, final String subject, final Map<String, Object> paramsMap, final String templateName);

}
