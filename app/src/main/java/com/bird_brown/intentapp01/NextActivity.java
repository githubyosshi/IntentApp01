package com.bird_brown.intentapp01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //インテントの取得（ハガキや荷物を受け取る）
        Intent intent = getIntent();

        //Bundleの取得（受け取った荷物の箱を開ける）
        Bundle bundle =  intent.getExtras();

        //文字列の取得（箱から荷物を取り出す）
        String s = bundle.getString("MOJI");

        //取得した文字列をTextViewに表示する
        TextView t = (TextView)findViewById(R.id.textView3);
        t.setText(s);
    }
}
