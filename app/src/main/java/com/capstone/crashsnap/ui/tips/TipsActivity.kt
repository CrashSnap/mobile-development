package com.capstone.crashsnap.ui.tips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.crashsnap.databinding.ActivityTipsBinding

class TipsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.topAppBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}