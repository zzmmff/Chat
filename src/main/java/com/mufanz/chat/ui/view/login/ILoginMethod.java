package com.mufanz.chat.ui.view.login;
/**
 * 窗口方法
 * */
public interface ILoginMethod {

    /**
     * 打开登录窗口
     * */
    void doShow();

    /*
     * @author 张慕帆
     * @description: 登录失败
     * @date 21:23 2022/3/16
     **/
    void doLoginError();

    /*
     * @author 张慕帆
     * @description: 登录成功，跳转窗口
     * @date 21:23 2022/3/16
     **/
    void doLoginSuccess();
}
