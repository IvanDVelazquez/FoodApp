package com.example.foodrecipe

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val TITLE_VAL = "Manzanita"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DataFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DataFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var title: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString(TITLE_VAL)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var fragment = inflater.inflate(R.layout.data_fragment, container, false)
        initialize(fragment)

        return fragment

    }

    private fun initialize(fragment: View){
        var titleTV: TextView= fragment.findViewById(R.id.TVfoodTitle)
        titleTV.text=title
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DataFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(title: String, param2: String) =
            DataFragment().apply {
                arguments = Bundle().apply {
                    putString(TITLE_VAL, title)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}