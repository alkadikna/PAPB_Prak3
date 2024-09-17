package com.example.praktikum_3

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum_3.ui.theme.Praktikum_3Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum_3Theme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
                Surface(color = MaterialTheme.colorScheme.background) {
                    LoginPage(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun LoginPage(modifier: Modifier){
    Column (
        modifier
            .fillMaxSize()
            .background(color = Color(0xFF81248A))
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        val context = LocalContext.current

        Image(
            painter = painterResource(id = R.drawable.guruji),
            contentDescription = null,
            modifier
                .width(200.dp)
                .height(150.dp)
        )

        Spacer(modifier = modifier.size(30.dp))

        Text(
            text = "Learn Graphic and UI/UX designing in Hindi for free with live projects",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 45.dp)
        )

        Spacer(modifier = modifier.size(50.dp))

        var textEmail by remember { mutableStateOf("") }

        TextField(
            value = textEmail,
            onValueChange = { textEmail = it },
            label = { Text("Email Address", color = Color(0xFF767676)) },
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 45.dp),
            shape = RoundedCornerShape(100.dp),
            singleLine = true,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.mail),
                    contentDescription = null,
                    modifier = Modifier
                        .size(45.dp)
                        .padding(end = 20.dp)
                )
            },
        )


        Spacer(modifier = modifier.size(30.dp))

        var textPass by remember { mutableStateOf("") }

        TextField(
            value = textPass,
            onValueChange = { textPass = it },
            label = { Text("Password", color = Color(0xFF767676)) },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 45.dp),
            shape = RoundedCornerShape(100.dp),
            singleLine = true,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.lock),
                    contentDescription = null,
                    modifier = Modifier
                        .size(45.dp)
                        .padding(end = 20.dp)
                )
            },
        )

        Spacer(modifier = modifier.size(30.dp))

        Button(onClick = { Toast.makeText(context, "Login button clicked!", Toast.LENGTH_SHORT).show() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFD8C00),
            ),
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 45.dp)
                .height(50.dp)
        ) {
            Text(
                text = "LOGIN",
                color = Color.White,
                fontSize = 15.sp,
            )
        }

        Spacer(modifier = modifier.size(15.dp))

        TextButton(onClick = { Toast.makeText(context, "Forgot Password Button Clicked !", Toast.LENGTH_SHORT).show() }, modifier = modifier
            .align(Alignment.End)
            .padding(end = 35.dp)) {
            Text(text = "Forgot Password?", color = Color(0xFFFD8C00))
        }

        Spacer(modifier = modifier.size(30.dp))

        Column (verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = "or login with", color = Color.White)
            Row (horizontalArrangement = Arrangement.spacedBy(20.dp)) {
                Box {
                    Button(
                        onClick = { /* TODO */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        shape = CircleShape,
                        modifier = Modifier.size(50.dp)
                    ) {

                    }
                    Icon(
                        painter = painterResource(id = R.drawable.g),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(25.dp).align(Alignment.Center)
                    )
                }
                Box {
                    Button(
                        onClick = { /* TODO */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        shape = CircleShape,
                        modifier = Modifier.size(50.dp)
                    ) {

                    }
                    Icon(
                        painter = painterResource(id = R.drawable.f),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(25.dp).align(Alignment.Center)
                    )
                }
                Box {
                    Button(
                        onClick = { /* TODO */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        shape = CircleShape,
                        modifier = Modifier.size(50.dp)
                    ) {

                    }
                    Icon(
                        painter = painterResource(id = R.drawable.t),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(25.dp).align(Alignment.Center)
                    )
                }
            }
            val annotatedText = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.White)){
                    append("Don't have an account? ")
                }

                pushStringAnnotation(tag = "REGISTER", annotation = "register")
                withStyle(style = SpanStyle(color = Color(0xFFFD8C00), textDecoration = TextDecoration.Underline, fontSize = 16.sp)) {
                    append("Register now")
                }
                pop()
            }



            ClickableText(
                text = annotatedText,
                onClick = { offset ->

                    annotatedText.getStringAnnotations(
                        tag = "REGISTER",
                        start = offset,
                        end = offset
                    )
                        .firstOrNull()?.let {
                            Toast.makeText(context, "Register button clicked!", Toast.LENGTH_SHORT).show()
                        }
                }
            )
        }

        Spacer(modifier = modifier.size(60.dp))

        val annotatedText = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.White, fontSize = 12.sp)){
                append("By signing up, you are agree with our ")
            }

            pushStringAnnotation(tag = "TC", annotation = "tc")
            withStyle(style = SpanStyle(color = Color(0xFFFD8C00), textDecoration = TextDecoration.Underline, fontSize = 12.sp)) {
                append("Terms & Conditions")
            }
            pop()
        }

        ClickableText(
            text = annotatedText,
            onClick = { offset ->

                annotatedText.getStringAnnotations(
                    tag = "TC",
                    start = offset,
                    end = offset
                )
                    .firstOrNull()?.let {
                        Toast.makeText(context, "T&C button clicked!", Toast.LENGTH_SHORT).show()
                    }
            }
        )





    }
}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview(){
    LoginPage(modifier = Modifier)
}
