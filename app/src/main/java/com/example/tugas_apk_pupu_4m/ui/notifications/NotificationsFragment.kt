package com.example.tugas_apk_pupu_4m.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tugas_apk_pupu_4m.MainActivity
import com.example.tugas_apk_pupu_4m.MainActivity1
import com.example.tugas_apk_pupu_4m.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)

        binding.buttonMain1.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity1::class.java)
            startActivity(intent)

        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}