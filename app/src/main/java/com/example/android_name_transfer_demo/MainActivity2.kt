package com.example.android_name_transfer_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main2)

		// Retrieve the extras (data) from the intent
		val bundle = intent.extras

		// Extract the "Name" string from the extras (if it exists)
		val data = bundle?.getString("Name")

		// Find the TextView with ID "txtvName" in the layout
		val txtvName = findViewById<TextView>(R.id.txtvName)

		// Set the text of the TextView to the extracted data
		txtvName.text = "Mi nombre es: $data"

		// Find the Button with ID "btnBack" in the layout
		val btnBack = findViewById<Button>(R.id.btnBack)

		// Set a click listener for the "btnBack" Button
		btnBack.setOnClickListener {
			// Create an intent to navigate back to MainActivity
			val intentBack = Intent(this, MainActivity::class.java)

			// Start the MainActivity using the intent
			startActivity(intentBack)
		}
	}
}
