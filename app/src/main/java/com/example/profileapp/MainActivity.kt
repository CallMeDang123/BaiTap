package com.example.profileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileapp.ui.theme.ProfileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ProfileScreen()
                }
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Box(modifier = Modifier.fillMaxSize()) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = { /* TODO: Xử lý nút Back */ },
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
                    .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp))
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }

            IconButton(
                onClick = { /* TODO: Xử lý nút Menu */ },
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
                    .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp))
            ) {
                Icon(
                    imageVector = Icons.Filled.Edit,
                    contentDescription = "Menu"
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Avatar",
                modifier = Modifier
                    .size(180.dp)
                    .clip(CircleShape)
                    .border(4.dp, Color.LightGray, CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(36.dp))

            Text(
                text = "Bui Nhat",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Go Vap, HCM",
                fontSize = 20.sp,
                color = Color.Gray
            )
        }
    }
}
