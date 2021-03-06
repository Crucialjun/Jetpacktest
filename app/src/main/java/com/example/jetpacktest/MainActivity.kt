package com.example.jetpacktest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyMeal()
            val navcontroller = rememberNavController()

            NavHost(navController = navcontroller,
                startDestination = "happy_meal"){

            }
        }
    }
}
@Composable
fun HappyMeal(){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(color = Color(0xFFF2F2F2))
            .fillMaxHeight()
    ) {
        Image(
            modifier = Modifier.height(300.dp),
            painter = painterResource(id = R.drawable.ic__31),
            contentDescription = "Food Image",
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Happy Meal ",
                    style = TextStyle(
                        fontSize = 26.sp
                    )
                )

                Text(
                    text = "$5.99",
                    style = TextStyle(
                        fontSize = 17.sp,
                        color = Color(0xFF85bb65),
                    ),
                    modifier = Modifier.align(Alignment.CenterVertically)


                )
            }

            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "900 Calories")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Button(onClick = { /*TODO*/ },Modifier.align(Alignment.CenterHorizontally)) {
                Text(text = "ORDER NOW")
            }

        }
    }

}

@Composable
fun RecipeList(){
    Column() {
        Text(text = "Recipe list")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyMeal()
}