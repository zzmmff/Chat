package com.mufanz.chat.ui.util;

import com.mufanz.chat.ui.view.chat.element.group_bar_chat.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName CacheUtil
 * @Description TODO
 * @Author 张慕帆
 * @Date 3:57 PM 3/18/2022
 * @Version 1.0
 **/
public class CacheUtil {
    // 对话框组
    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<String, ElementTalk>(16);

}
