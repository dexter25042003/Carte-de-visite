package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCard()
        }
    }
}

@Composable
fun BussinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2B2B2B))
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.images),
            contentDescription = "mon logo",
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "DJAMA JOEL ALEX MARIE ALPHONSE ",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Développeur junior java",
            color = Color(0xFF3DDC84),
            fontSize = 18.sp,

            )

        Spacer(modifier = Modifier.height(50.dp))

        ContactInfo(icon = Icons.Filled.Phone, contactText = "+225 05 45 36 73 09 ")
        Spacer(modifier = Modifier.height(8.dp))
        ContactInfo(icon = Icons.Filled.Email, contactText = "djamajoel2003@gmail.com")
    }
}

@Composable
fun ContactInfo(icon: ImageVector, contactText: String) {
    Row(verticalAlignment = Alignment.CenterVertically,

        ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3DDC84),
            modifier = Modifier.size(24.dp),

            )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = contactText,color = Color(0xFFCCCCCC), fontSize = 16.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BussinessCard()
}