package edu.miu.composerowdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import edu.miu.composerowdemo.ui.theme.ComposeRowDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeRowDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Row(
                        modifier = Modifier.fillMaxSize()
                            .padding(innerPadding)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.Top
                    ) {
                        MyText(
                            text = "Fairfield",
                            modifier = Modifier
                                .padding(innerPadding)
                                .background(Color(0xFF89C984))
                        )
                        MyText(
                            text = "Iowa",
                            modifier = Modifier
                                .padding(innerPadding)
                                .background(Color(0xFF03A9F4))
                        )
                        MyText(
                            text = "USA",
                            modifier = Modifier
                                .padding(innerPadding)
                                .background(Color(0xFFF2F3F5))
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MyText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
    )
}

@Preview(showBackground = false)
@Composable
fun MyTextPreview() {
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(50.dp)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        horizontalArrangement = Arrangement.SpaceAround,
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        horizontalArrangement = Arrangement.Start,
//        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.Top,
//        verticalAlignment = Alignment.Bottom,
//        verticalAlignment = Alignment.CenterVertically,
    ) {
        MyText(
            text = "Fairfield",
            modifier = Modifier
                .background(Color(0xFF89C984))
        )
        MyText(
            text = "Iowa",
            modifier = Modifier
                .background(Color(0xFF03A9F4))
        )
        MyText(
            text = "USA",
            modifier = Modifier
                .background(Color(0xFFF6F6F7))
        )
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ComposeRowDemoTheme {
//        Greeting("Android")
//    }
//}