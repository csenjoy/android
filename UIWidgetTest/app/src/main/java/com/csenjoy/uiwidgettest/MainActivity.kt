package com.csenjoy.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*button.setOnClickListener {
            //利用Java单抽象方法接口的特性，从而可以使用函数式API的写法来监听按钮的点击事件
           Log.d("MainActivity", this.javaClass.simpleName)
        }*/
        val listener = { v: View -> {
            val textString = "textString"
            Log.d("MainActivity", this.javaClass.simpleName + textString)
        }}
        //call lambda
        listener(button)
        val list = listOf("1", "2", "3", "4", "5")
        val result = list.maxByOrNull { it.length }

        //Anonymous Class in Kotlin
        val objListener = View.OnClickListener() {
            Log.d("MainActivity", this.javaClass.simpleName)
        }
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button-> {
               //Inherit OnClickListener
                Log.d("MainActivity", "onClick button")
                if (this.clickCount % 2 == 1) {
                    imageView.setImageResource(R.drawable.img2)
                }
                else {
                    imageView.setImageResource(R.drawable.img1)
                }
                clickCount++
                val inputText = editText.text.toString()
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            }
        }

    }
}