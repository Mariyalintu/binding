//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bindingtype.R
import com.example.bindingtype.automation.utils.AutoWiperSensitivityUtil
import android.util.Log

class AutoWiperSensitivityFragment : Fragment() {
    private val TAG = this::class.java.simpleName
    private var util: AutoWiperSensitivityUtil? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, " onCreate")
        val requireContext = requireContext()
        val view = inflater.inflate(R.layout.fragment_autowipersensitivity, container, false)
        util = AutoWiperSensitivityUtil(requireContext, view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}
