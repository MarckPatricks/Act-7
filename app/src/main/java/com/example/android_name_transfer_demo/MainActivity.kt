package com.example.android_name_transfer_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// Find the EditText with ID "edtName" in the layout
		val edtName = findViewById<EditText>(R.id.edtName)

		// Find the Button with ID "btnSend" in the layout
		val btnSend = findViewById<Button>(R.id.btnSend)

		// Set a click listener for the "btnSend" Button
		btnSend.setOnClickListener {
			// Create an intent to navigate to MainActivity2
			val sendText = Intent(this, MainActivity2::class.java)

			// Put the text from the "edtName" EditText as an extra with key "Name"
			sendText.putExtra("Name", edtName.text.toString())

			// Start MainActivity2 using the intent
			startActivity(sendText)
		}
	}
}
