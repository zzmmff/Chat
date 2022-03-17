package com.mufanz.chat.ui.view.login;

/**
 *  登录窗口实现
 * */
public interface ILoginEvent {

    /*
     * @author 张慕帆
     * @description:
     * @date 21:20 2022/3/16
     * @param userId  用户名
     * @param userPassword 用户密码
     **/
    void doLoginCheck(String userId,String userPassword);
}
