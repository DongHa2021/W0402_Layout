package kr.ac.kumoh.s20180134.w0402_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.s20180134.w0402_layout.ui.theme.W0402_LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    W0402_LayoutTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            //Greeting("Android")
            MyLinearLayout()
        }
    }
}

@Composable
fun MyLinearLayout() {
    Column{
        Row{
            Text(text = "안녕하세요 ~",
                modifier = Modifier.background(Color.LightGray).padding(8.dp),
            )
            Text(text = "저는 김동하 입니다",
                modifier = Modifier.background(Color.Cyan).padding(8.dp),
                color = Color.Red
            )
        }
        Text(text = "어디서 본 것 같은 예제",
            modifier = Modifier.background(Color.Magenta).padding(8.dp),
            color = Color.White
        )
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name 안녕하세요!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp() // 마이앱
}