package com.ycx.nuwademo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMain;
        tvMain = (TextView) findViewById(R.id.tvMain);
        BugClass bugClass = new BugClass();
        tvMain.setText(bugClass.bug());
    }
}
