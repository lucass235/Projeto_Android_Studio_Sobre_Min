package com.example.telalucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telalucas.databinding.ActivityMainBinding
import com.example.telalucas.databinding.ModalAboutMeBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowAboutMe.setOnClickListener{showModal()}

    }

    private fun showModal() {
        val dialog = BottomSheetDialog(this)

        val modalAboutMe: ModalAboutMeBinding =
            ModalAboutMeBinding.inflate(layoutInflater, null, false)

        dialog.setContentView(modalAboutMe.root)
        dialog.show()
    }
}