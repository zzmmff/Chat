package com.mufanz.chat.ui;

import com.mufanz.chat.ui.view.login.ILoginMethod;
import com.mufanz.chat.ui.view.login.Login;
import com.mufanz.chat.ui.view.login.LoginController;
import javafx.stage.Stage;

/**
 * @ClassName Application
 * @Description TODO
 * @Author 张慕帆
 * @Date 15:40 2022/3/15
 * @Version 1.0
 **/
public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws Exception {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            System.out.println("登陆 userId：" + userId + " userPassword：" + userPassword);
        });

        login.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
