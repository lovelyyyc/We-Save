package com.example.massmutual.we_save;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by massmutual on 8/5/2015.
 */
public class NotificationDataProvider
{

    public static HashMap <String, List<String>> getNotificationInfo()
    {
        HashMap<String, List<String>> notifications = new HashMap <String, List<String>>();
        List<String> alerts = new ArrayList<String>();
        alerts.add("name1");
        alerts.add("name2");
        alerts.add("name3");
        notifications.put("Notifications", alerts);
        return notifications;
    }

}


