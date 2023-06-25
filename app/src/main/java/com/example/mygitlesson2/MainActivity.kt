package com.example.mygitlesson2

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.mygitlesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        with(binding) {
            val message = editTxMessage.text.toString()
            btnSave.setOnClickListener {
                textView.text = getString(R.string.message_is_saved)
            }
        }
    }
}