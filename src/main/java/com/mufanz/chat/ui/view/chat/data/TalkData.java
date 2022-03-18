package com.mufanz.chat.ui.view.chat.data;

/**
 * @ClassName TalkData
 * @Description 对话用户数据
 * @Author 张慕帆
 * @Date 3:38 PM 3/18/2022
 * @Version 1.0
 **/
public class TalkData {
    private String talkName;
    private String talkHead;

    public TalkData(){}

    public TalkData(String talkName, String talkHead) {
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public String getTalkName() {
        return talkName;
    }

    public void setTalkName(String talkName) {
        this.talkName = talkName;
    }

    public String getTalkHead() {
        return talkHead;
    }

    public void setTalkHead(String talkHead) {
        this.talkHead = talkHead;
    }
}
