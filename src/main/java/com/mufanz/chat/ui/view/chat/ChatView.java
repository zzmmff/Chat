package com.mufanz.chat.ui.view.chat;

import com.mufanz.chat.ui.view.chat.data.RemindCount;
import com.mufanz.chat.ui.view.chat.data.TalkBoxData;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

/**
 * @ClassName ChatView
 * @Description 聊天窗口展示
 * @Author 张慕帆
 * @Date 12:54 PM 3/17/2022
 * @Version 1.0
 **/
public class ChatView {
    private ChatInit chatInit;
    private IChatEvent chatEvent;

    public ChatView(ChatInit chatInit, IChatEvent chatEvent){
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
    }

    /*
     * @author 张慕帆
     * @description:     更行对话框列表元素指定位置，并选中
     * @date 3:56 PM 3/19/2022
     * @param talkType            对话框类型[0 好友，1群组]
     * @param talkElementPane     对话框元素面板
     * @param msgRemindLabel      消息提醒标签
     * @param idxFirst            是否设置首位
     * @param selected            是否选中
     * @param isRemind             是否提醒
     **/
    void updateTalkListIdxAndSelected(int talkType, Pane talkElementPane, Label msgRemindLabel, Boolean idxFirst, Boolean selected, Boolean isRemind){
        // 对话框ID、好友ID
        TalkBoxData talkBoxData = (TalkBoxData) talkElementPane.getUserData();
        // 填充到对话框
        ListView<Pane> talkList = chatInit.$("talkList", ListView.class);
        // 对话空为空，初始化[置顶、选中、提醒]
        if (talkList.getItems().isEmpty()) {
            if (idxFirst) {
                talkList.getItems().add(0, talkElementPane);
            }
            if (selected) {
                // 设置对话框[√选中]
                talkList.getSelectionModel().select(talkElementPane);
            }
            isRemind(msgRemindLabel, talkType, isRemind);
            return;
        }
        // 对话空不为空，判断第一个元素是否当前聊天Pane
        Pane firstPane = talkList.getItems().get(0);
        // 判断元素是否在首位，如果是首位可返回不需要重新设置首位
        if (talkBoxData.getTalkId().equals(((TalkBoxData) firstPane.getUserData()).getTalkId())) {
            Pane selectedItem = talkList.getSelectionModel().getSelectedItem();
            // 选中判断；如果第一个元素已经选中[说明正在会话]，那么清空消息提醒
            if (null == selectedItem){
                isRemind(msgRemindLabel, talkType, isRemind);
                return;
            }
            TalkBoxData selectedItemUserData = (TalkBoxData) selectedItem.getUserData();
            if (null != selectedItemUserData && talkBoxData.getTalkId().equals(selectedItemUserData.getTalkId())) {
                clearRemind(msgRemindLabel);
            } else {
                isRemind(msgRemindLabel, talkType, isRemind);
            }
            return;
        }
        if (idxFirst) {
            talkList.getItems().remove(talkElementPane);
            talkList.getItems().add(0, talkElementPane);
        }
        if (selected) {
            // 设置对话框[√选中]
            talkList.getSelectionModel().select(talkElementPane);
        }
        isRemind(msgRemindLabel, talkType, isRemind);
    }


    /*
     * @author 张慕帆
     * @description: 消息提醒
     * @date 3:59 PM 3/19/2022
     * @param msgRemindLabel     消息面板
     * @param talkType
     * @param isRemind
     **/
    private void isRemind(Label msgRemindLabel, int talkType, Boolean isRemind) {
        if (!isRemind) return;
        msgRemindLabel.setVisible(true);
        // 群组直接展示小红点
        if (1 == talkType) {
            return;
        }
        RemindCount remindCount = (RemindCount) msgRemindLabel.getUserData();
        // 超过10个展示省略号
        if (remindCount.getCount() > 99) {
            msgRemindLabel.setText("···");
            return;
        }
        int count = remindCount.getCount() + 1;
        msgRemindLabel.setUserData(new RemindCount(count));
        msgRemindLabel.setText(String.valueOf(count));
    }

    /*
     * @author 张慕帆
     * @description: 清除提醒
     * @date 4:00 PM 3/19/2022
     * @param msgRemindLabel
     **/
    private void clearRemind(Label msgRemindLabel) {
        msgRemindLabel.setVisible(false);
        msgRemindLabel.setUserData(new RemindCount(0));
    }
}
