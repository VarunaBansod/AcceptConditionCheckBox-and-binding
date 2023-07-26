package com.example.viewbindinncheckbox

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbindinncheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    


    lateinit var bindingVar : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindingVar = ActivityMainBinding.inflate(layoutInflater)
        setContentView((bindingVar.root))

        bindingVar.button.setOnClickListener {
            if(bindingVar.checkBox.isChecked)
            {
                //open a new screen
            }else{
                bindingVar.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Please accept the T &amp C" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}