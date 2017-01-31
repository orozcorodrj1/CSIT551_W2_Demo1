package com.example.joluorro.csit551_w2_demo1;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.joluorro.csit551_w2_demo1.utils.Utils.APP_TAG;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.tv_1_act1);
        textView2 = (TextView) findViewById(R.id.tv_2_act1);

       findViewById(R.id.btn1_act1).setOnClickListener(new MyLsnr());;
       findViewById(R.id.btn2_act1).setOnClickListener(new MyLsnr());;

        Log.i(APP_TAG, "use the >> onCreate >> method");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(APP_TAG, "use the >> onStart >> method");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(APP_TAG, "use the >> onResume >> method");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(APP_TAG, "use the >> onPause >> method");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(APP_TAG, "use the >> onStop >> method");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(APP_TAG, "use the >> onDestroy >> method");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(APP_TAG, "use the >> onRestart >> method");

    }

    class MyLsnr implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btn1_act1) {
                textView1.setText("First TextView Changed");
                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
            else if(view.getId() == R.id.btn2_act1)
                textView2.setText("Second TextView Changed");

        }
    }

}




