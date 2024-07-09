package com.example.netclanexplorer.Fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanexplorer.R

class PersonalFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var arrayList :ArrayList<String> = arrayListOf("Vishal Goswami","Aman Parjapati","Raman Bhardawaj","Suresh Sharma","Mukesh Jha","Roshan Kharwar","Heera Yadav ")

        val rv = getView()?.findViewById<RecyclerView>(R.id.rvView)


        rv?.adapter = com.example.netclanexplorer.ListAdapter(arrayList)
        rv?.layoutManager = LinearLayoutManager(requireContext())
    }
}