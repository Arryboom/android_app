package com.test.uihijack;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;  //����Toast
import android.content.Context; //����context

public class MainActivity extends ActionBarActivity {
	private Context context;//����context
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;//context��ֵΪ��ǰ����
        setContentView(R.layout.activity_main);
        //Toast
        final Toast t = Toast.makeText(context,"����ٳֲ���",  Toast.LENGTH_SHORT);// ms
        //Toast t = Toast.makeText(context,"happy new year", Toast.LENGTH_LONG);
        //����һ����ʮһ��ʮ���� 16:44:21
        //t.setGravity(Gravity.CENTER,0,0);
        t.show();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                t.cancel();
//            }
//        },600000);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
