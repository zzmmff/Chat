package com.mufanz.chat.ui.view.login;

/**
 * @ClassName LoginController
 * @Description 登录窗口控制
 * @Author 张慕帆
 * @Date 21:17 2022/3/16
 * @Version 1.0
 **/
public class LoginController extends LoginInit implements ILoginMethod {


    private LoginView loginView;
    private LoginEventDefine loginEventDefine;

    public LoginController(ILoginEvent loginEvent) {
        super(loginEvent);
    }

    @Override
    public void initView() {
        loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        loginEventDefine = new LoginEventDefine(this, loginEvent, this);
    }

    @Override
    public void doShow() {
        super.show();
    }

    @Override
    public void doLoginError() {
        System.out.println("登陆失败");
    }

    @Override
    public void doLoginSuccess() {
        System.out.println("登录成功");
        close();
    }


}
