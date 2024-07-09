package com.example.netclanexplorer

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.netclanexplorer.databinding.ActivityRefineBinding

class RefineActivity : AppCompatActivity() {
    lateinit var binding: ActivityRefineBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) 
        enableEdgeToEdge()
        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val options = arrayOf("Available | Hey Let Us Connect","Away | Stay Discrete And Watch"  ,"Busy | Do Not Distrub ")

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,options)
        binding.Selector.adapter = arrayAdapter

        binding.Selector.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }



         optionButton()
        charcount()


        findViewById<ImageView>(R.id.backbtn).setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun charcount() {

        binding.StatusText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var length = p0!!.length
                binding.count.text =  "$length/250"
            }

            override fun afterTextChanged(p0: Editable?) {}

        })

    }

    private fun optionButton() {

        var businessClick = false
        var coffeClick = false
        binding.coffee.setOnClickListener {
            if (coffeClick==false){
                binding.coffee.setTextColor(Color.WHITE)
                binding.coffee.setBackgroundResource(R.drawable.btnbg2)
                coffeClick = true
            }

            else{
                binding.coffee.setTextColor(Color.parseColor("#000D66"))
                binding.coffee.setBackgroundResource(R.drawable.btnbg)
                coffeClick=false
            }

        }
        binding.business.setOnClickListener {
            if (businessClick==false){
                binding.business.setTextColor(Color.WHITE)
                binding.business.setBackgroundResource(R.drawable.btnbg2)
                businessClick = true
            }

            else{
                binding.business.setTextColor(Color.parseColor("#000D66"))
                binding.business.setBackgroundResource(R.drawable.btnbg)
                businessClick=false
            }

        }
        var hobbieeClick = false
        binding.hobbiee.setOnClickListener {
            if (hobbieeClick==false){
                binding.hobbiee.setTextColor(Color.WHITE)
                binding.hobbiee.setBackgroundResource(R.drawable.btnbg2)
                hobbieeClick= true
            }

            else{
                binding.hobbiee.setTextColor(Color.parseColor("#000D66"))
                binding.hobbiee.setBackgroundResource(R.drawable.btnbg)
                hobbieeClick=false
            }

        }
        var friendship = false
        binding.frienship.setOnClickListener {
            if (friendship ==false){
                binding.frienship.setTextColor(Color.WHITE)
                binding.frienship.setBackgroundResource(R.drawable.btnbg2)
                friendship = true
            }

            else{
                binding.frienship.setTextColor(Color.parseColor("#000D66"))
                binding.frienship.setBackgroundResource(R.drawable.btnbg)
                friendship =false
            }

        }
        var movie = false
        binding.movies.setOnClickListener {
            if (movie ==false){
                binding.movies.setTextColor(Color.WHITE)
                binding.movies.setBackgroundResource(R.drawable.btnbg2)
                movie = true
            }

            else{
                binding.movies.setTextColor(Color.parseColor("#000D66"))
                binding.movies.setBackgroundResource(R.drawable.btnbg)
                movie =false
            }

        }

        var dinning = false
        binding.dinning.setOnClickListener {
            if (dinning ==false){
                binding.dinning.setTextColor(Color.WHITE)
                binding.dinning.setBackgroundResource(R.drawable.btnbg2)
                dinning = true
            }

            else{
                binding.dinning.setTextColor(Color.parseColor("#000D66"))
                binding.dinning.setBackgroundResource(R.drawable.btnbg)
                dinning =false
            }

        }

        var dating = false
        binding.dating.setOnClickListener {
            if ( dating ==false){
                binding.dating.setTextColor(Color.WHITE)
                binding.dating.setBackgroundResource(R.drawable.btnbg2)
                dating = true
            }

            else{
                binding.dating.setTextColor(Color.parseColor("#000D66"))
                binding.dating.setBackgroundResource(R.drawable.btnbg)
                dating  =false
            }

        }

        var matrimony = false
        binding.matrimony.setOnClickListener {
            if ( matrimony ==false){
                binding.matrimony.setTextColor(Color.WHITE)
                binding.matrimony.setBackgroundResource(R.drawable.btnbg2)
                matrimony = true
            }

            else{
                binding.matrimony.setTextColor(Color.parseColor("#000D66"))
                binding.matrimony.setBackgroundResource(R.drawable.btnbg)
                matrimony =false
            }

        }

    }
}