package com.example.ieq13desetembro

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.example.ieq13desetembro.fragments.TeatroFragment
import com.example.ieq13desetembro.fragments.LiderancaFragment
import com.example.ieq13desetembro.fragments.AdultosFragment
import com.example.ieq13desetembro.fragments.MissoesFragment
import com.example.ieq13desetembro.fragments.DiaconatoFragment
import com.example.ieq13desetembro.fragments.MidiaFragment
import com.example.ieq13desetembro.fragments.LouvorFragment

class telainicio : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicio)
        setSupportActionBar(findViewById(R.id.toolbar))

        drawerLayout = findViewById(R.id.drawer_layout)


        actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            R.string.nav_open,
            R.string.nav_close
        )

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        setupNavigationMenu()
    }

    private fun setupNavigationMenu() {
        // Use o findViewById diretamente aqui
        val navigationView = findViewById<NavigationView>(R.id.nav_view)

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container,TeatroFragment())
                        .addToBackStack(null)
                        .commit()
                    supportActionBar?.title = "Teatro" // Use função temporária
                }
                R.id.item2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, LiderancaFragment())
                        .addToBackStack(null)
                        .commit()
                    supportActionBar?.title = "Liderança"
                }
                R.id.item3 -> {
                    showTestFragment("Louvor")
                }
                R.id.item4 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, AdultosFragment())
                        .addToBackStack(null)
                        .commit()
                    supportActionBar?.title = "Adultos"
                }
                R.id.item5 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, MissoesFragment())
                        .addToBackStack(null)
                        .commit()
                    supportActionBar?.title = "Missões"
                }
                R.id.item6 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, MidiaFragment())
                        .addToBackStack(null)
                        .commit()
                    supportActionBar?.title = "Mídia"
                }
                R.id.item7 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, DiaconatoFragment())
                        .addToBackStack(null)
                        .commit()
                    supportActionBar?.title = "Diaconato"
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }


    private fun showTestFragment(titulo: String) {

        supportActionBar?.title = titulo


        val fragment = androidx.fragment.app.Fragment()
        val args = Bundle()
        args.putString("titulo", titulo)
        fragment.arguments = args

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
}