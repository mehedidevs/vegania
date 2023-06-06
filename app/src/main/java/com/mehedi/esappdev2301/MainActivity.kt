package com.mehedi.esappdev2301

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.mehedi.esappdev2301.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    var isOpen = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.showDetailsBtn.setOnClickListener {


            visibilityHandle(binding.detailsText, binding.showDetailsBtn)

        }

        binding.showDetailsBtn2.setOnClickListener {


            visibilityHandle(binding.detailsText2, binding.showDetailsBtn2)


        }


    }

    private fun visibilityHandle(
        detailsTv: TextView,
        showDetailsBtn: Button
    ) {

        if (!isOpen) {
            detailsTv.visibility = View.VISIBLE
            showDetailsBtn.text = "Show Less"

        } else {
            detailsTv.visibility = View.GONE
            showDetailsBtn.text = "Show Details"

        }
        isOpen = !isOpen

    }


}