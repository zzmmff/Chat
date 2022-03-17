package com.mufanz.chat.ui.view;

import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.HttpRetryException;

/**
 * @ClassName UIObject
 * @Description 抽象公用方法和事件
 * @Author 张慕帆
 * @Date 21:19 2022/3/16
 * @Version 1.0
 **/
public abstract class UIObject extends Stage {
    protected Parent root;
    private double xOffset;
    private double yOffset;

    public  <T> T $(String id ,Class<T> clazz){
        return (T) root.lookup("#"+id);
    }

    public void clearViewListSelectedAll(ListView<Pane>... listViews){
        for (ListView<Pane> listView:listViews){
            listView.getSelectionModel().clearSelection();
        }
    }

    /*
     * @author 张慕帆
     * @description: 移动窗口
     * @date 21:33 2022/3/16
     **/
    public void move(){
        root.setOnMousePressed(event ->{
            xOffset = getX() - event.getScreenX();
            yOffset = getY() - event.getScreenY();
            root.setCursor(Cursor.CLOSED_HAND);
        });

        root.setOnMouseDragged(event->{
            System.out.println("移动窗体");
            setX(event.getScreenX() + xOffset);
            setY(event.getScreenY() + yOffset);
        });

        root.setOnMouseReleased(event ->{
            root.setCursor(Cursor.DEFAULT);
        });
    }

    /*
     * @author 张慕帆
     * @description: 初始化页面
     * @date 21:36 2022/3/16
     **/
    public abstract void initView();

    /*
     * @author 张慕帆
     * @description: 初始化事件定义
     * @date 21:36 2022/3/16
     **/
    public abstract void initEventDefine();
}
