package com.rudra.perfisystkehometask

import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun SlpitifyHomePage() {
    val spentByList = listOf<Pair<String, String>>(
        Pair("Chirag", "0"),
        Pair("Manoranjan Kumar", "0"),
        Pair("Sandeep", "0"),
        Pair("Hemanth Reddy", "0"),
        Pair("testiser", "0"),
    )
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp )
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.ic_gaming),
                contentDescription = "",
                tint = Color.Unspecified
            )

            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.ic_lines),
                contentDescription = "",
                tint = Color.Unspecified
            )
        }
        Spacer(modifier = Modifier.height(18.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Monthly expenses tracker",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(48.dp))

        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .shadow(
                        elevation = 20.dp,
                        shape = RoundedCornerShape(12.dp),
                        ambientColor = Color.Gray,
                        spotColor = Color.Gray
                    )
                    .width(150.dp)
                    .height(160.dp)
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "This month",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(48.dp))

                Text(
                    text = "0",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                )

            }
            Column(
                modifier = Modifier
                    .shadow(
                        elevation = 20.dp,
                        shape = RoundedCornerShape(12.dp),
                        ambientColor = Color.Gray,
                        spotColor = Color.Gray
                    )
                    .width(150.dp)
                    .height(160.dp)
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Past Prices",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp),
            text = "Spent by: ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(36.dp),
        ) {
            spentByList.forEachIndexed  { index, item ->
                Text(
                    text = "${item.first}: ${item.second}",
                    fontSize = 24.sp,
                    color = Color.Blue,
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .shadow(
                        elevation = 20.dp,
                        shape = RoundedCornerShape(12.dp),
                        ambientColor = Color.Gray,
                        spotColor = Color.Gray
                    )
                    .background(Color.White)
                    .padding(all = 18.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Show Expenses",
                    fontSize = 18.sp,
                )
            }

            FloatingActionButton(
                modifier = Modifier
                    .shadow(
                        elevation = 20.dp,
                        shape = CircleShape,
                        ambientColor = Color.Gray,
                        spotColor = Color.Gray
                    )
                    .size(47.dp),
                containerColor = Color.White,
                shape = CircleShape,
                onClick = {

                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.sharp_add_24),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Box(
            modifier = Modifier
                .padding(horizontal = 34.dp)
                .height(42.dp)
                .fillMaxWidth()
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text("Ads")
        }

        Spacer(modifier = Modifier.height(36.dp))
    }
}