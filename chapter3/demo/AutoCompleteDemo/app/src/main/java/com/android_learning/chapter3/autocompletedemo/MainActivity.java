package com.android_learning.chapter3.autocompletedemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES2);

        AutoCompleteTextView result1 = (AutoCompleteTextView) findViewById(R.id.result1);
        result1.setAdapter(adapter1);

        MultiAutoCompleteTextView result2 = (MultiAutoCompleteTextView) findViewById(R.id.result2);
        result2.setAdapter(adapter2);
        result2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        buildControls();
    };


    private void buildControls() {
    //获取按钮资源
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

       // View.OnClickListener listener = new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
           // }
        //}
    //设置监听

    //btn3.setOnClickListener(listener);
    //btn4.setOnClickListener(listener);

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent();
                i.setClassName("com.android_learning.chapter3.autocompletedemo",
                        "com.android_learning.chapter3.autocompletedemo.Questionnaire");
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent();
                i.setClassName("com.android_learning.chapter3.autocompletedemo",
                        "com.android_learning.chapter3.autocompletedemo.Questionnaire");
                startActivity(i);
          }
        });

    }


static final String[] COUNTRIES1 = new String[] {
            "bashijiandangzuopengyou", "xinsheng-qinianjiushiyibeizi", "renrendounengyongyingyu",
            "tongwangcaifuziyouzhilu", "TOEFLhexin21tiancihuitupo",
    };


static final String[] COUNTRIES2 = new String[] {
            "lixiaolai","zhangyue","xugaoyang","steve li",
            "liyongbin","lianghuifeng","yangbingbing"
    };

}
