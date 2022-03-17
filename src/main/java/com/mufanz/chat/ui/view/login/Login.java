package com.mufanz.chat.ui.view.login;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName Login
 * @Description TODO
 * @Author 张慕帆
 * @Date 15:38 2022/3/15
 * @Version 1.0
 **/
public class Login extends Stage {
    private static final String RESOURCE_NAME = "/fxml/login/login.fxml";

    private Parent root;

    public Login(){
        try{
            root = FXMLLoader.load(getClass().getResource((RESOURCE_NAME)));
        }catch (IOException e){
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        File file = new File("/fxml/login/img/system/logo.png");
        if (file.exists())
            System.out.println("!!");
        this.getIcons().add(new Image(getClass().getResource("/fxml/login/img/system/logo.png").toExternalForm()));
    }
}
