package com.example.telalucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telalucas.databinding.ActivityMainBinding
import com.example.telalucas.databinding.ModalAboutMeBinding
import com.example.telalucas.databinding.ModalCareerBinding
import com.example.telalucas.databinding.ModalTechnologiesBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowAboutMe.setOnClickListener{showModalAbout()}

        binding.btnShowCoreer.setOnClickListener{showModalCoreer()}

        binding.btnShowTechnologie.setOnClickListener{showModalTechnologie()}

    }

    private fun showModalAbout() {
        val dialog = BottomSheetDialog(this)

        val modalAboutMe: ModalAboutMeBinding =
            ModalAboutMeBinding.inflate(layoutInflater, null, false)

        dialog.setContentView(modalAboutMe.root)
        dialog.show()
    }

    private fun showModalCoreer() {
        val dialog = BottomSheetDialog(this)

        val modalCorrer: ModalCareerBinding =
            ModalCareerBinding.inflate(layoutInflater, null, false)

        dialog.setContentView(modalCorrer.root)
        dialog.show()
    }

    private fun showModalTechnologie() {
        val dialog = BottomSheetDialog(this)

        val modalTechnologie: ModalTechnologiesBinding =
            ModalTechnologiesBinding.inflate(layoutInflater, null, false)

        dialog.setContentView(modalTechnologie.root)
        dialog.show()
    }

}