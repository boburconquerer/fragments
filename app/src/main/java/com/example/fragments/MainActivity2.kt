package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.example.fragments.Adapters.Adapter
import com.example.fragments.Fragments.BlankFragment
import com.google.android.material.tabs.TabLayout


class MainActivity2 : AppCompatActivity() {

    lateinit var adapter: Adapter
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initViews()

    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewPager_id)
        tabLayout = findViewById(R.id.tabLayout_id)

        adapter = Adapter(supportFragmentManager)
        adapter.addFragment(BlankFragment(),"Top News")
        adapter.addFragment(BlankFragment2(),"Global")
        adapter.addFragment(BlankFragment3(),"Local")
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)

    }


//    override fun onStart() {
//        super.onStart()
//        Log.d("MainActivity2", "onStart: Working")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("MainActivity2", "onResume: Working")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("MainActivity2","onPause: Working")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d("MainActivity2","onStop: Working")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("MainActivity2","onStop: Working")
//    }
}