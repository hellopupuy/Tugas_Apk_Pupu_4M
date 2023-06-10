package com.example.tugas_apk_pupu_4m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_apk_pupu_4m.databinding.ActivityMain1Binding


class MainActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityMain1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain1Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}