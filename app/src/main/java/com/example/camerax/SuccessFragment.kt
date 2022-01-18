package com.example.camerax

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_success.view.fragment_success_text_view_code
import kotlinx.android.synthetic.main.fragment_success.view.fragment_success_button_back_to_scanner

class SuccessFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_success, container, false)

        val safeArgs: SuccessFragmentArgs by navArgs()
        val code = safeArgs.code

        view.fragment_success_text_view_code.text = code

        view.fragment_success_button_back_to_scanner.setOnClickListener {
            findNavController().navigateUp()
        }

        return view
    }
}
