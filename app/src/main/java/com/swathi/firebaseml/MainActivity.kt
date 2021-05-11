package com.swathi.firebaseml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun textRecognition(view: View){
        startActivity(Intent(this,TextRecognition::class.java))
    }
    fun faceDetection(view: View){
        startActivity(Intent(this,FaceDetection::class.java))
    }
    fun barcodeScanner(view: View){
        startActivity(Intent(this,BarcodeScanner::class.java))
    }
    fun imageLabeling(view: View){
        startActivity(Intent(this,ImageLabeling::class.java))
    }
}