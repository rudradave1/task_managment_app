package com.rudra.perfisystkehometask

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import java.util.Collections.list

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MarghHomePage(paddingValues: PaddingValues = PaddingValues()) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .background(
                Color(0xFFDCF1F5)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp, top = 24.dp)
        ) {
            Text(
                text = "Take a break, it's a midday.",
                fontSize = 18.sp,
                color = Color(0xFF01012B),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(18.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(Color(0xFF11113A))
                        .padding(all = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Random quotes",
                        fontSize = 16.sp,
                        color = Color.White,
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(20.dp))
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = "",
                        tint = Color.Unspecified,
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_mic),
                        contentDescription = "",
                        tint = Color.Unspecified,
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        val state = rememberPagerState { 10 }

        val colors = listOf(
            Color.Cyan,
            Color.Gray,
            Color.Blue,
            Color.DarkGray
        )
        VerticalPager(state) {
            Box(
                contentAlignment = Alignment.BottomCenter
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colors.random()),
                )
                Row(
                    modifier = Modifier
                        .shadow(
                            elevation = 20.dp,
                            shape = RoundedCornerShape(12.dp),
                            ambientColor = Color.Gray,
                            spotColor = Color.Gray
                        )
                        .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
                        .fillMaxWidth()
                        .height(55.dp)
                        .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.width(24.dp))

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            imageVector = Icons.Outlined.Favorite,
                            contentDescription = "",
                            tint = Color.Unspecified,
                        )

                        Text(
                            "Save"
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = R.drawable.ic_download),
                            contentDescription = "",
                            tint = Color.Unspecified,
                        )
                        Text(
                            "Download"
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Icon(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = R.drawable.ic_share),
                            contentDescription = "",
                            tint = Color.Unspecified,
                        )
                        Text(
                            "Share"
                        )
                    }

                    Spacer(modifier = Modifier.width(24.dp))
                }
            }
        }
    }
}