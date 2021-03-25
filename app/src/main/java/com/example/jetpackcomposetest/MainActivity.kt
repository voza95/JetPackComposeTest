package com.example.jetpackcomposetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewTreeLifecycleOwner


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewTreeLifecycleOwner.set(window.decorView, this)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, RecipeListFragment())
            .commit()
        /*setContent {
            *//*Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Hey Some text")
                Spacer(modifier = Modifier.padding(10.dp))
                Button(onClick = {}) {
                    Text(text = "BUTTON")
                }
            }*//*
            //SimpleColumnComposable()
            //SimpleRowComposable()
        }*/
    }

    /*@Preview
    @Composable
    fun SimpleColumnComposable() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF2F2F2))
                .verticalScroll(reverseScrolling = true , state = ScrollState(0))
        ) {
            Image(
                painter = painterResource(R.drawable.happy_meal),
                contentDescription = "",
                modifier = Modifier.height(300.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Happy Meal",
                    style = TextStyle(
                        fontSize = 26.sp
                    )
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = "800 Calories",
                    style = TextStyle(
                        fontSize = 17.sp
                    )
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = "$5.99",
                    style = TextStyle(
                        color = Color(0xFF85BB65),
                        fontSize = 17.sp
                    )
                )
            }
        }
    }*/

    /**
     * In Column you can align Modifier.align(Alignment.CenterHorizontally).
     * In Row you can align Modifier.align(Alignment.CenterVertically).
     * **/

   /* @Preview
    @Composable
    fun SimpleRowComposable(){
        //Center Item In the Screen using Row
        *//*Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Hello",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }*//*

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF2F2F2))
                .verticalScroll(reverseScrolling = true , state = ScrollState(0))
        ) {
            Image(
                painter = painterResource(R.drawable.happy_meal),
                contentDescription = "",
                modifier = Modifier.height(300.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Happy Meal",
                        modifier = Modifier.align(Alignment.CenterVertically),
                        style = TextStyle(
                            fontSize = 26.sp
                        )
                    )

                    Text(
                        text = "$5.99",
                        modifier = Modifier.align(Alignment.CenterVertically),
                        style = TextStyle(
                            color = Color(0xFF85BB65),
                            fontSize = 17.sp
                        )
                    )
                }
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = "800 Calories",
                    style = TextStyle(
                        fontSize = 17.sp
                    )
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Button(
                    onClick = {  },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Order Now")
                }
            }
        }

    }*/
}