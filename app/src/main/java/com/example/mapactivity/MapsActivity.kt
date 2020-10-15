package com.example.mapactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_maps.*

class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
//        implementing Actionbar back button
        getActionBar()?.setDisplayHomeAsUpEnabled(true);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)



    }



    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        var intentObject: Intent = intent

        if (intentObject != null) {
            if (intentObject.getStringExtra("keyone") == ("tajmahal")) {
                val tajmal = LatLng(27.175015, 78.042155)
                mMap.addMarker(
                    MarkerOptions().position(tajmal).title("Taj Mahal, India")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                )
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tajmal, 16F))

            } else if (intentObject.getStringExtra("keytwo") == ("colosseum")) {
                val colosseum = LatLng(41.890251, 12.492373)
                mMap.addMarker(
                    MarkerOptions().position(colosseum).title("Colosseum, Italy")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                )
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colosseum, 16F))

            } else if (intentObject.getStringExtra("keythree") == ("pyramid")) {
                val pyramid = LatLng(29.976480, 31.131302)
                mMap.addMarker(
                    MarkerOptions().position(pyramid).title("Pyramids, Egypt")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                )
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pyramid, 16F))

            } else if (intentObject.getStringExtra("keyfour") == ("machupicchu")) {
                val machupicchu = LatLng(-13.163068, -72.545128)
                mMap.addMarker(
                    MarkerOptions().position(machupicchu).title("Machu Picchu, Peru")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                )
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(machupicchu, 16F))

            } else if (intentObject.getStringExtra("keyfive") == ("redeemer")) {
                val redeemer = LatLng(29.943031, -95.629941)
                mMap.addMarker(
                    MarkerOptions().position(redeemer).title("Christ the Redeemer, Brazil")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                )
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(redeemer, 16F))

            } else if (intentObject.getStringExtra("keysix") == ("petra")) {
                val petra = LatLng(30.328960, 35.444832)
                mMap.addMarker(
                    MarkerOptions().position(petra).title("Petra, Jordan")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                )
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(petra, 16F))

            } else if (intentObject.getStringExtra("keyseven") == ("greatwall")) {
                val china = LatLng(40.4319077, 116.5681862)
                mMap.addMarker(
                    MarkerOptions().position(china).title("Great Wall of China, China")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
                )
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(china, 16F))
            }

        }


    }

// It creates a menu  for our app

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.normal -> mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL)

            R.id.satellite -> mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE)

            R.id.terrain -> mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN)

            R.id.hybrid -> mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID)

        }
        return super.onOptionsItemSelected(item)
    }
}
