package com.dotinstall.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //親クラスの処理を呼んでいる
        setContentView(R.layout.activity_main)
        //レイアウト中のactivity_mainをContentViewにセットしている。
    }
    fun changeTextView(view:View){
        messageTextView.text="Hello there!!　Again!"
    }
}
