package com.al3xmm14.android_master

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.al3xmm14.android_master.firstApp.FirstAppActivity
import com.al3xmm14.android_master.imCalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_saludar = findViewById<Button>(R.id.btn_Saludar)
        val btn_imc = findViewById<Button>(R.id.btn_IMCApp)
        btn_saludar.setOnClickListener{ navigateSalusar() }
        btn_imc.setOnClickListener{ navigateImcApp() }

    }

    private fun navigateImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateSalusar(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}