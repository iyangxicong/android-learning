package com.android_learning.chapter3.RemoteControl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10,bn11, bn12, bn13, bn14, bn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remotecontrol);
          Log.i(TAG, "Info:       onCreate");
          Log.d(TAG, "Debug:      onCreate");
          Log.w(TAG, "Warning:    onCreate");
          Log.e(TAG, "Error:      onCreate");
          Log.v(TAG, "Verbose:    onCreate");

        bn1 = (Button) findViewById(R.id.bn1);
        bn2 = (Button) findViewById(R.id.bn2);
        bn3 = (Button) findViewById(R.id.bn3);
        bn4 = (Button) findViewById(R.id.bn4);
        bn5 = (Button) findViewById(R.id.bn5);
        bn6 = (Button) findViewById(R.id.bn6);
        bn7 = (Button) findViewById(R.id.bn7);
        bn8 = (Button) findViewById(R.id.bn8);
        bn9 = (Button) findViewById(R.id.bn9);
        bn10 = (Button) findViewById(R.id.bn10);
        bn11 = (Button) findViewById(R.id.bn11);
        bn12 = (Button) findViewById(R.id.bn12);
        bn13 = (Button) findViewById(R.id.bn13);
        bn14 = (Button) findViewById(R.id.bn14);
        bn15 = (Button) findViewById(R.id.bn15);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberClicked(v);
            }
        };

        bn1.setOnClickListener(listener);
        bn2.setOnClickListener(listener);
        bn3.setOnClickListener(listener);
        bn4.setOnClickListener(listener);
        bn5.setOnClickListener(listener);
        bn6.setOnClickListener(listener);
        bn7.setOnClickListener(listener);
        bn8.setOnClickListener(listener);
        bn9.setOnClickListener(listener);
        bn10.setOnClickListener(listener);

        bn11.setOnClickListener(listener);
        bn12.setOnClickListener(listener);
        bn13.setOnClickListener(listener);
        bn14.setOnClickListener(listener);
        bn15.setOnClickListener(listener);

        final TextView tv11 = (TextView) findViewById(R.id.t11);
        SeekBar seekBar = (SeekBar) findViewById(R.id.sb);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.d(TAG, "onProgressChanged");
                tv11.setText(i);
            }
        });

         final TextView tv10 = (TextView) findViewById(R.id.t10);

         Switch switch = (Switch) findViewById(R.id.sw);
         switch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {

        })
    private void OnCheckedChanged(CompoundButton button,boolean isChecked) {
          Toast.makeText(this,button.getTag() + "is" + (isChecked ? "on" : "off"),
                Toast.LENGTH_SHORT).Show();
        }
    private void onSwitchClicked(View view) {

        }
    }


}

        //bn1 = (Button) findViewById(R.id.bn1);
       // bn1.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View view) {
          //     x++;
           //     Log.d(TAG, "现在X的值是：" + x);
           // }
        //});





