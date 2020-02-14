package com.bird_brown.intentapp01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //送信ボタンのオブジェクトの取得とイベントリスナ登録
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //送信ボタンでなければ何も処理しない
        if (view.getId() !=R.id.button1) {
            return;
        }

        //テキストボックスに入力された文字列を取得
        EditText e = (EditText)findViewById(R.id.editText1);
        String s = e.getText().toString();

        //インデントのオブジェクトを生成（ハガキを設定　宛先はNextActivityクラス）
        Intent intent = new Intent(this, NextActivity.class);

        //入力した文字列をインテントに設定（ハガキに何らかの文字を書く）
        intent.putExtra("MOJI", s);

        //インテントの実行（画面切替）
        startActivity(intent);
    }
}
