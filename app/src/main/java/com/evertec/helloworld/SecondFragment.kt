package com.evertec.helloworld

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    private lateinit var myView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i("LifeCycle", "Fragment:onCreateView")
        myView = inflater.inflate(R.layout.fragment_second, container, false)
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LifeCycle", "Fragment:onViewCreated")
        setListeners()
    }

    private fun setListeners() {
        view?.findViewById<Button>(R.id.button_dialog_action)?.setOnClickListener {
            val alertDialog = AlertDialog
                .Builder(requireContext())
                .setMessage(getString(R.string.message))
                .create()
            alertDialog.show()
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.i("LifeCycle", "Fragment:onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "Fragment:onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "Fragment:onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "Fragment:onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "Fragment:onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("LifeCycle", "Fragment:onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LifeCycle", "Fragment:onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycle", "Fragment:onDestroy")
    }

}