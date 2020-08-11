package com.example.foodrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var dataFragment: DataFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //dataFragment=supportFragmentManager.findFragmentById(R.id.FRinfo) as FoodFragment
        dataFragment=DataFragment.newInstance("HOLA","string")
        //Log.i("test","manzanita")
    }


}