package com.mufanz.chat.ui.view.chat;

/**
 * @ClassName ChatView
 * @Description TODO
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
}
