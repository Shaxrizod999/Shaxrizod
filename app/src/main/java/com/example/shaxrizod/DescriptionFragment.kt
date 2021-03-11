package com.example.shaxrizod

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import com.example.shaxrizod.databinding.FragmentDescriptionBinding
import com.example.shaxrizod.models.Place
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class DescriptionFragment : Fragment(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    private lateinit var binding: FragmentDescriptionBinding

    @SuppressLint("ResourceType")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentDescriptionBinding.inflate(inflater,container,false)
        val place = arguments?.getSerializable("place") as Place

        binding.nomi.text = place.name
        place.image?.let { binding.joyRasmi.setImageResource(it) }
        binding.manzil.text = place.location
        binding.telefonNomer.text = place.phoneAdress
        binding.webLink.text = place.webLink
        binding.izoh.text = place.description
        val toolbar: Toolbar = activity?.findViewById(R.id.toolbar)!!
        toolbar.title=place.name
        val mapFragment = childFragmentManager.findFragmentById(R.id.mapss) as SupportMapFragment

        mapFragment.getMapAsync(this)

        return binding.root
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        if (googleMap != null) {
            mMap = googleMap
        }
        val serializable = arguments?.getSerializable("place") as Place

        // Add a marker in Sydney and move the camera
        val sydney = serializable.lat?.let { serializable.long?.let { it1 -> LatLng(it, it1) } }
        mMap.addMarker(sydney?.let { MarkerOptions().position(it).title(serializable.name) })
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15f))
        //mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
    }

}