package com.example.ktx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doBeforeTextChanged
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.lifecycleScope

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)


        // lifecycleScope.coroutineContext

        editText.doAfterTextChanged { editable ->
            Log.d("KTX", "onCreate: ${editable.toString()}")
        }

        editText.doBeforeTextChanged { text, start, count, after ->

        }

        editText.doOnTextChanged { text, start, before, count ->

        }

        editText.isVisible = true
        editText.isGone = false


    }
}