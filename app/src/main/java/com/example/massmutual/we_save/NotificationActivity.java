package com.example.massmutual.we_save;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
/**
 * Created by massmutual on 8/5/2015.
 */

public class NotificationActivity extends Activity {

    private HashMap<String, List<String>> notificationCategories;
    private List<String> notificationTypesList;
    private ExpandableListView expList;
    private NotificationsAdapter notificationsAdapter;
    private String name = null;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        runOnUiThread(new Runnable() {
            public void run() {
                setContentView(R.layout.activity_notification);
                expList = (ExpandableListView) findViewById(R.id.expList);
                notificationCategories = NotificationDataProvider.getNotificationInfo();
                notificationTypesList = new ArrayList<String>(notificationCategories.keySet());
                notificationsAdapter= new NotificationsAdapter(getBaseContext(), notificationCategories, notificationTypesList);
                expList.setAdapter(notificationsAdapter);
            }
        });


        expList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String itemInCategory = notificationCategories.get(notificationTypesList.get(groupPosition)).get(childPosition);
                String category = notificationTypesList.get(groupPosition);


                if (category.equals("Notifications"))
                {
                    name = itemInCategory;
                }

                if(name.equals("Jack Barnes"))
                {
                    Intent intent = new Intent(NotificationActivity.this, Criminal1.class);
                    startActivity(intent);
                }
                else if(name.equals("Jeffrey Lionel"))
                {
                    Intent intent = new Intent(NotificationActivity.this, Criminal2.class);
                    startActivity(intent);
                }
                else if (name.equals("Karla Davis"))
                {
                    Intent intent = new Intent(NotificationActivity.this, Criminal3.class);
                    startActivity(intent);
                }
                return false;
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_log, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    public void goToHomeScreen(View view)
//    {
//        runOnUiThread(new Runnable() {
//            public void run() {
//                Intent intent = new Intent(NotificationActivity.this, HomeActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
}