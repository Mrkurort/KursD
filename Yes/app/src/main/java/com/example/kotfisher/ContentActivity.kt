package com.example.kotfisher

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView

class ContentActivity: AppCompatActivity() {

    //lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)

        val textTitle = findViewById<TextView>(R.id.textTitle)
        val TVContent = findViewById<TextView>(R.id.TVContent)
        val imageViewBus = findViewById<ImageView>(R.id.imageViewBus)
        //val mv = findViewById<MapView>(R.id.mapview)

        /*MapKitFactory.setApiKey("75519b06-d27f-46b5-b603-c49a7a8126c3")
        MapKitFactory.initialize(this)
        mv.map.move(CameraPosition(Point(57.870866, 61.712209), 11.0f, 0.0f, 0.0f),
            Animation(Animation.Type.SMOOTH, 300f), null)*/
        textTitle.text = intent.getStringExtra("title")
        TVContent.text = intent.getStringExtra("content")
        imageViewBus.setImageResource(intent.getIntExtra("image", R.drawable.marsh))
    }

    /*override fun onStop() {

        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()

    }

    override fun onStart() {

        mapView.onStart()
        MapKitFactory.getInstance().onStart()
        super.onStart()

    }*/
}