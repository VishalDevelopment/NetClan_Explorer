package com.example.netclanexplorer.Fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanexplorer.R

class BusinessesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_businesses, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var arrayList :ArrayList<String> = arrayListOf("Aman Traders","Aman Cop. ","Raman Housing","Sharma material","Jha Rental Servies","Engineering stall","Gollgappee walle")

        val rv = getView()?.findViewById<RecyclerView>(R.id.RecyclerView)


        rv?.adapter =  ListAdapter2(arrayList)
        rv?.layoutManager = LinearLayoutManager(requireContext())
    }
}