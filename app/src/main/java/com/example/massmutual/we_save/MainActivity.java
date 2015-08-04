package com.example.massmutual.we_save;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
new GoogleApiClient.Builder(conext)
        .addApi(LocationServices.API)
        .addConnecionCallbacks(this)
        .addOnConnectionFailedListner(this)
        .build()
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        <activity andriod:theme="@style/Theme.AppCompat.Light">
        <menu xmlns:android="http://schemas.android.com/apk/res/android" >
        <item android:id="@+id/action_search"
        android:icon="@drawable/ic_action_search"
        android:title="@string/action_search"/>
        <item android:id="@+id/action_compose"
        android:icon="@drawable/ic_action_compose"
        android:title="@string/action_compose" />
        </menu>
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu items for use in the action bar
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_activity_actions, menu);
            return super.onCreateOptionsMenu(menu);
        }
        <menu xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:yourapp="http://schemas.android.com/apk/res-auto" >
        <item android:id="@+id/action_search"
        android:icon="@drawable/ic_action_search"
        android:title="@string/action_search"
        yourapp:showAsAction="ifRoom"  />
        ...
        </menu>
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_details);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
            ...
            <application ... >
            ...
            <!-- The main/home activity (has no parent activity) -->
            <activity
            android:name="com.example.myfirstapp.MainActivity" ...>
            ...
            </activity>
            <!-- A child of the main activity -->
            <activity
            android:name="com.example.myfirstapp.DisplayMessageActivity"
            android:label="@string/title_activity_display_message"
            android:parentActivityName="com.example.myfirstapp.MainActivity" >
            <!-- Parent activity meta-data to support API level 7+ -->
            <meta-data
            android:name="android.support.PARENT_ACTIVITY"
            android:value="com.example.myfirstapp.MainActivity" />
            </activity>
            </application>
        }
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

}
