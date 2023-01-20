package org.shuijing.gushe_app.service;

import org.shuijing.gushe_app.pojo.MailRequest;

/**
 * 邮件发送接口
 */
public interface SendMailService {

    /**
     * 简单文本邮件
     *
     * @param mailRequest
     * @return
     */
    void sendSimpleMail(MailRequest mailRequest);


    /**
     * Html格式邮件,可带附件
     *
     * @param mailRequest
     * @return
     */
    void sendHtmlMail(MailRequest mailRequest);
}
