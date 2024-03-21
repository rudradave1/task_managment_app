package com.rudra.perfisystkehometask

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun SlpitifyHistoryPage() {
    val spentByList = listOf<ExpenseData>(
        ExpenseData(
            id = 0,
            name = "abc",
            amount = 855.0,
            date = "21-03-2024 12:00"
        ),
        ExpenseData(
            id = 1,
            name = "xyz",
            amount = 855.0,
            date = "21-03-2024 12:03"
        ),
        ExpenseData(
            id = 2,
            name = "abc",
            amount = 855.0,
            date = "21-03-2024 12:05"
        ),
    )
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .shadow(
                    elevation = 20.dp,
                    shape = RoundedCornerShape(12.dp),
                    ambientColor = Color.Gray,
                    spotColor = Color.Gray
                )
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .height(120.dp)
                .width(170.dp)
                .align(Alignment.CenterHorizontally),
        ) {
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                modifier = Modifier
                    .padding(top = 18.dp)
                    .align(Alignment.Top),
                text = "Rs.",
                fontSize = 12.sp,
                color = Color.Gray,
            )

            Spacer(modifier = Modifier.width(24.dp))

            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text =  10269.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(4.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "March 2024",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(12.dp))

        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
        ) {
            spentByList.forEachIndexed { index, item ->
                Row(
                    modifier = Modifier
                        .shadow(
                            elevation = 20.dp,
                            shape = RoundedCornerShape(12.dp),
                            ambientColor = Color.Gray,
                            spotColor = Color.Gray
                        )
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.White)
                        .padding(top = 18.dp, start = 16.dp, end = 8.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = item.name,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )

                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    SpanStyle(
                                        fontSize = 18.sp,
                                        color = Color.Gray,
                                    )
                                ) {
                                    append("Rs")
                                }

                                append("  ")

                                withStyle(
                                    SpanStyle(
                                        fontSize = 24.sp,
                                        color = Color.Blue,
                                        fontWeight = FontWeight.Bold
                                    )
                                ) {
                                    append(item.amount.toInt().toString())
                                }
                            },
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = item.date,
                            fontSize = 16.sp,
                            color = Color.Gray,
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

            }
        }
    }
}