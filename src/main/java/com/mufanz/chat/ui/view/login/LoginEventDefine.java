package com.mufanz.chat.ui.view.login;

/**
 * @ClassName LoginEventDefine
 * @Description 窗口事件定义
 * @Author 张慕帆
 * @Date 21:17 2022/3/16
 * @Version 1.0
 **/
public class LoginEventDefine {
    private LoginInit loginInit;
    private ILoginEvent loginEvent;
    private ILoginMethod loginMethod;

    public LoginEventDefine(LoginInit loginInit, ILoginEvent loginEvent, ILoginMethod loginMethod) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
        this.loginMethod = loginMethod;

        loginInit.move();
        min();
        quit();
        doEventLogin();
    }

    /*
     * @author 张慕帆
     * @description: 最小化
     * @date 9:31 2022/3/17
     **/
    private void min(){
        loginInit.login_min.setOnAction(event -> {
            System.out.println("最小化");
            loginInit.setIconified(true);
        });
    }

    /*
     * @author 张慕帆
     * @description: 退出
     * @date 9:32 2022/3/17
     **/
    private void quit(){
        loginInit.login_close.setOnAction(event -> {
            System.out.println("退出");
            loginInit.close();
            System.exit(0);
        });
    }

    /*
     * @author 张慕帆
     * @description: 登录事件
     * @date 9:33 2022/3/17
     **/
    protected void doEventLogin(){
        loginInit.login_button.setOnAction(event -> {
            loginEvent.doLoginCheck(loginInit.userId.getText(),loginInit.userPassword.getText());
        });
    }
}
