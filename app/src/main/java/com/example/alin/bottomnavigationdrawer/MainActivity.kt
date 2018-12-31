package com.example.alin.bottomnavigationdrawer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener(navListener)

    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->

            var frag: Fragment = FragHome()
            when (menuItem.itemId) {

                R.id.nav_home -> frag = FragHome()

                R.id.nav_fav -> frag = FragFav()

                R.id.nav_search -> frag = FragSearch()
            }

            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, frag).commit()
            true
        }

}
