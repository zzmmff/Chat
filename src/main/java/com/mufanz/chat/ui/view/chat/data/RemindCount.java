package com.mufanz.chat.ui.view.chat.data;

/**
 * @ClassName RemindCount
 * @Description 消息提醒
 * @Author 张慕帆
 * @Date 3:37 PM 3/18/2022
 * @Version 1.0
 **/
public class RemindCount {
    private int count = 0;  // 消息提醒条数

    public RemindCount() {
    }

    public RemindCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
