package com.mufanz.chat.ui.view.chat;

import com.mufanz.chat.ui.view.UIObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @ClassName ChatInit
 * @Description TODO
 * @Author 张慕帆
 * @Date 12:54 PM 3/17/2022
 * @Version 1.0
 **/
public abstract class ChatInit extends UIObject {
    private static String RESOURCE_NAME = "/fxml/chat/chat.fxml";

    ChatInit(){
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        }catch (IOException e){
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image(getClass().getResource("/fxml/chat/img/head/logo.png").toExternalForm()));
        initView();
        initEventDefine();
    }
}
