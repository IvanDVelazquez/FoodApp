package com.example.foodrecipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FoodFragment: Fragment() {

    private lateinit var TVfoodTitle : TextView
    private lateinit var IVfood : ImageView
    private lateinit var TVKCAL : TextView
    private lateinit var TVFAT : TextView
    private lateinit var TVCHOCDF : TextView
    private lateinit var TVPROCNT : TextView
    private lateinit var TVFIBTG : TextView
    private lateinit var TVcategory : TextView
    private  var title:String?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments!=null){
            title = arguments?.getString("MANZANITA", "no encontrado")

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val foodFragment = inflater.inflate(R.layout.data_fragment,container,false)
        TVfoodTitle=foodFragment.findViewById(R.id.TVfoodTitle) as TextView
        TVfoodTitle.text=title.toString()

        return foodFragment

    }
    companion object{
        fun newInstance(Manzanita:String):FoodFragment{
            val fragment = FoodFragment()
            val args= Bundle()
            args.putString("MANZANITA",Manzanita)
            fragment.arguments=args
            return fragment
        }
    }

}