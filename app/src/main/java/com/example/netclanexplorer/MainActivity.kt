package com.example.netclanexplorer

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import com.example.netclanexplorer.Fragements.BusinessesFragment
import com.example.netclanexplorer.Fragements.FragmentAdapter
import com.example.netclanexplorer.Fragements.PersonalFragment
import com.example.netclanexplorer.Fragements.ServicesFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(PersonalFragment(),"Personal")
        fragmentAdapter.addFragment(BusinessesFragment(),"Business")
        fragmentAdapter.addFragment(ServicesFragment(),"Services")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        findViewById<LinearLayout>(R.id.Refine).setOnClickListener {
            var intent = Intent(this,RefineActivity::class.java)
            startActivity(intent)
        }
    }
}