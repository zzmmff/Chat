package com.mufanz.chat.ui.view.chat;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * @ClassName ChatEventDefine
 * @Description 定义聊天窗口行为
 * @Author 张慕帆
 * @Date 12:54 PM 3/17/2022
 * @Version 1.0
 **/
public class ChatEventDefine {
    private ChatInit chatInit;
    public ChatEventDefine(ChatInit chatInit){
        this.chatInit = chatInit;

        chatInit.move();
        this.barChat();
        this.barFriend();
    }

    /*
     * @author 张慕帆
     * @description:  聊天界面  初始化
     * @date 1:12 PM 3/17/2022
     **/
    private void barChat(){
        Button bar_chat = chatInit.$("bar_chat", Button.class);
        Pane group_bar_chat = chatInit.$("group_bar_chat", Pane.class);
        bar_chat.setOnAction(event -> {
            switchBarChat(bar_chat, group_bar_chat, true);
            switchBarFriend(chatInit.$("bar_friend", Button.class), chatInit.$("group_bar_friend", Pane.class), false);
        });
        bar_chat.setOnMouseEntered(event -> {
            boolean visible = group_bar_chat.isVisible();
            if (visible) return;
            System.out.println(getClass().getResource("/fxml/chat/img/system/chat_1.png").toExternalForm());
            bar_chat.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/chat_1.png").toExternalForm()+"')");
        });
        bar_chat.setOnMouseExited(event -> {
            boolean visible = group_bar_chat.isVisible();
            if (visible) return;
            //bar_chat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_0.png')");
            bar_chat.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/chat_0.png").toExternalForm()+"')");
        });
    }


    /*
     * @author 张慕帆
     * @description: 好友按钮
     * @date 1:13 PM 3/17/2022
     **/
    private void barFriend(){
        Button bar_friend = chatInit.$("bar_friend", Button.class);
        Pane group_bar_friend = chatInit.$("group_bar_friend", Pane.class);
        bar_friend.setOnAction(event -> {
            switchBarChat(chatInit.$("bar_chat", Button.class), chatInit.$("group_bar_chat", Pane.class), false);
            switchBarFriend(bar_friend, group_bar_friend, true);
        });
        bar_friend.setOnMouseEntered(event -> {
            boolean visible = group_bar_friend.isVisible();
            if (visible) return;
           // bar_friend.setStyle("-fx-background-image: url('/fxml/chat/img/system/friend_1.png')");
            bar_friend.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/friend_1.png").toExternalForm()+"')");
        });
        bar_friend.setOnMouseExited(event -> {
            boolean visible = group_bar_friend.isVisible();
            if (visible) return;
            bar_friend.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/friend_0.png").toExternalForm()+"')");
        });
    }

    /*
     * @author 张慕帆
     * @description:  切换bar_chat
     * @date 1:21 PM 3/17/2022
     * @param bar_chat
     * @param group_bar_chat
     **/
    private void switchBarChat(Button bar_chat,Pane group_bar_chat,boolean toggle){
        if (toggle) {
            //bar_chat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_2.png')");
            bar_chat.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/chat_2.png").toExternalForm()+"')");
            group_bar_chat.setVisible(true);
        } else {
            //bar_chat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_0.png')");
            bar_chat.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/chat_0.png").toExternalForm()+"')");
            group_bar_chat.setVisible(false);
        }
    }

    /*
     * @author 张慕帆
     * @description: 切换bar_friend
     * @date 1:22 PM 3/17/2022
     * @param bar_friend
     * @param group_bar_chat
     **/
    private void switchBarFriend(Button bar_friend,Pane group_bar_friend,boolean toggle){
        if (toggle) {
            bar_friend.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/friend_2.png").toExternalForm()+"')");
            group_bar_friend.setVisible(true);
        } else {
            bar_friend.setStyle("-fx-background-image: url('"+getClass().getResource("/fxml/chat/img/system/friend_0.png").toExternalForm()+"')");
            group_bar_friend.setVisible(false);
        }
    }

}
