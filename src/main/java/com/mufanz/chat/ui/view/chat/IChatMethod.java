package com.mufanz.chat.ui.view.chat;

import java.util.Date;

public interface IChatMethod {

    /*
     * @author 张慕帆
     * @description: 打开窗口
     * @date 12:55 PM 3/17/2022
     **/
    void doShow();


    /*
     * @author 张慕帆
     * @description:  填充对话框列表
     * @date 4:15 PM 3/18/2022
     * @param talkIdx          对话框位置；首位0、默认-1
     * @param talkType         对话框类型；好友0、群组1
     * @param talkId           对话框ID，1v1聊天ID、1vn聊天ID
     * @param talkName         对话框名称
     * @param talkHead         对话框头像
     * @param talkSketch       对话框通信简述(聊天内容最后一组信息)
     * @param talkDate         对话框通信时间
     * @param selected         选中[true/false]
     **/
    void addTalkBox(int talkIdx, Integer talkType, String talkId, String talkName, String talkHead, String talkSketch, Date talkDate, Boolean selected);
}
