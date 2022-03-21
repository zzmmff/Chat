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


    /*
     * @author 张慕帆
     * @description: 设置用户登录头像
     * @date 3:00 PM 3/19/2022
     * @param userId             用户id
     * @param userNickName       用户昵称
     * @param userHead           头像图片
     **/
    void setUserInfo(String userId,String userNickName,String userHead);


    /*
     * @author 张慕帆
     * @description: 填充对话框消息【好友】
     * @date 3:02 PM 3/19/2022
     * @param talkId      对话框id
     * @param msg         消息
     * @param msgData     时间
     * @param idxFirst    是否设置首位
     * @param selected    是否选中
     * @param isRemind    是否提醒
     **/
    void addTalkMsgUserLeft(String talkId, String msg, Date msgData, Boolean idxFirst, Boolean selected, Boolean isRemind);



    /*
     * @author 张慕帆
     * @description: 填充对话框消息【群组】
     * @date 3:04 PM 3/19/2022
     * @param talkId              对话框id
     * @param userId              用户id
     * @param userNickName        用户昵称
     * @param userHead            用户头像
     * @param msg                 消息
     * @param msgDate             时间
     * @param idxFirst            是否设置首位
     * @param selected            是否选中
     * @param isRemind            是否提醒
     **/
    void addTalkMsgGroupLeft(String talkId, String userId, String userNickName, String userHead, String msg, Date msgDate, Boolean idxFirst, Boolean selected, Boolean isRemind);



    /*
     * @author 张慕帆
     * @description: 填充我的消息
     * @date 3:17 PM 3/19/2022
     * @param talkId      对话框id
     * @param msg         消息
     * @param msgData     时间
     * @param idxFirst   是否设置首位
     * @param selected   是否选中
     * @param isRemind   是否提醒
     **/
    void addTalkMsgRight(String talkId, String msg, Date msgData, Boolean idxFirst, Boolean selected, Boolean isRemind);
}
