package com.rudra.perfisystkehometask

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MarghProfilePage(paddingValues: PaddingValues = PaddingValues()) {
    Box(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "Profile",
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(34.dp))
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, color = Color.Black, shape = CircleShape)
            )
            Spacer(modifier = Modifier.height(34.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
                    .shadow(
                        elevation = 20.dp,
                        shape = RoundedCornerShape(8.dp),
                        ambientColor = Color.Gray,
                        spotColor = Color.Gray
                    )
                    .height(55.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Name",
                    fontSize = 24.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier
                        .shadow(
                            elevation = 20.dp,
                            shape = RoundedCornerShape(8.dp),
                            ambientColor = Color.Gray,
                            spotColor = Color.Gray
                        )
                        .height(70.dp)
                        .width(140.dp)
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Share",
                        fontSize = 16.sp,
                    )
                }


                Box(
                    modifier = Modifier
                        .shadow(
                            elevation = 20.dp,
                            shape = RoundedCornerShape(8.dp),
                            ambientColor = Color.Gray,
                            spotColor = Color.Gray
                        )
                        .height(70.dp)
                        .width(140.dp)
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Contact us",
                        fontSize = 16.sp,
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
                    .shadow(
                        elevation = 20.dp,
                        shape = RoundedCornerShape(8.dp),
                        ambientColor = Color.Gray,
                        spotColor = Color.Gray
                    )
                    .height(55.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "About us",
                    fontSize = 16.sp,
                )
            }

            Spacer(modifier = Modifier.height(48.dp))

            Button(
                onClick = {

                },
                shape = RectangleShape,
            ) {
                Text("LOGOUT")
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 8.dp)
                .shadow(
                    elevation = 20.dp,
                    shape = RoundedCornerShape(8.dp),
                    ambientColor = Color.Gray,
                    spotColor = Color.Gray
                )
                .align(Alignment.TopEnd)
                .background(Color.White)
                .padding(vertical = 12.dp, horizontal = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Upload your quotes")
        }
    }
}