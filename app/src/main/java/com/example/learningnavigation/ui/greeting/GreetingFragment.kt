package com.example.learningnavigation.ui.greeting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learningnavigation.databinding.FragmentGreetingBinding

class GreetingFragment : Fragment() {
    private val binding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGreetingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var userInput = binding.editTextFragmentGreetingUsernameInput.text

        binding.buttonFragmentGreetingSubmitButton.text = "Enter"
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}