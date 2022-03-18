package com.mufanz.chat.ui.view.chat.data;

/**
 * @ClassName TalkBoxData
 * @Description 对话框数据
 * @Author 张慕帆
 * @Date 3:38 PM 3/18/2022
 * @Version 1.0
 **/
public class TalkBoxData {
    private String talkId;    // 对话Id
    private Integer talkType; // 对话类型
    private String talkName;  // 对话名称
    private String talkHead;  // 对话头像

    public TalkBoxData() {
    }

    public TalkBoxData(String talkId, Integer talkType, String talkName, String talkHead) {
        this.talkId = talkId;
        this.talkType = talkType;
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public Integer getTalkType() {
        return talkType;
    }

    public void setTalkType(Integer talkType) {
        this.talkType = talkType;
    }

    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
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
