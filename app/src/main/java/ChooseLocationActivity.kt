package com.example.project_uas

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.project_uas.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {

    private val binding : ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val locationList = arrayOf("Jaipur","odisa","rajasthan","sikkim")

        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,locationList)

        val autoCompleteTextView = binding.listoflocation
        autoCompleteTextView.setAdapter(adapter)
    }
}