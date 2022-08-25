package com.csenjoy.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        //Use Toast in main activity
        //button1?.setOnClickListener {
        //    Toast.makeText(this, "You clicked Button 1", Toast.LENGTH_SHORT).show()
        //}
        button1.setOnClickListener {
           //Toast.makeText(this, "You clicked Button 1", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            //Pass data
            val data = "Hello SecondActivity"
            intent.putExtra("extra_data", data)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent("com.csenjoy.activitytest.ACTION_START")
            intent.addCategory("com.csenjoy.activitytest.MY_CATEGORY")
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show()
        }
        return  true;
    }
    //Add a function to test commit in different place.
    fun testGitCommit() {}
}