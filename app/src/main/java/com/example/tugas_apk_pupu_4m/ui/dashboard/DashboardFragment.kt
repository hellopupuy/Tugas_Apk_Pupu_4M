package com.example.tugas_apk_pupu_4m.ui.dashboard

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tugas_apk_pupu_4m.R
import com.example.tugas_apk_pupu_4m.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            messageAnimation()
        }
        return binding.root
    }

    private fun messageAnimation() {
        val dialog = Dialog(requireContext())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.animation_dialog)

        val btnIya = dialog.findViewById<Button>(R.id.btn_logout_yes)
        val btnTidak = dialog.findViewById<Button>(R.id.btn_logout_no)
        btnIya.setOnClickListener { dialog.dismiss() }
        btnTidak.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}