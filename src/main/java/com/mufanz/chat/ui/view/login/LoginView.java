package com.mufanz.chat.ui.view.login;

/**
 * @ClassName LoginView
 * @Description TODO
 * @Author 张慕帆
 * @Date 21:18 2022/3/16
 * @Version 1.0
 **/
public class LoginView {
    private LoginInit loginInit;
    private ILoginEvent loginEvent;

    public LoginView(LoginInit loginInit, ILoginEvent loginEvent) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
    }
}
