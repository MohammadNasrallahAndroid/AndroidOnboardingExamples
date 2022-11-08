package com.example.fooonboarding.fooonboardingexamples.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fooonboarding.R
import kotlinx.android.synthetic.main.fragment_main.*

class OnboardingFragment5Main : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnOnboarding.setOnClickListener {
            //findNavController().navigate(R.id.onboardingFragment)
            OnboardingFragment5().show(childFragmentManager, "foo")
        }
    }
}