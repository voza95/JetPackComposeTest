package com.example.jetpackcomposetest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment

class RecipeListFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipe_list,container,false)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {
            dummyView()
        }
        /*val view = ComposeView(context = requireActivity()).apply {
            setContent {
                Text(text = "Hello world.")
            }
        }*/
        return view
    }

    @Preview
    @Composable
    fun dummyView(){
        Column(
            modifier = Modifier
                .border(border = BorderStroke(1.dp, Color.Black))
                .padding(16.dp)
        ) {
            Text(text = "This is COMPOSABLE INSIDE THE FRAGMENT")
            Spacer(modifier = Modifier.padding(10.dp))
            CircularProgressIndicator()
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "NEAT")
            Spacer(modifier = Modifier.padding(10.dp))

            val demo = Text(text = "OK")

        }
    }

}