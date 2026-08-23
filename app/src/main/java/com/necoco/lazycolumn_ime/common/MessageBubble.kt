package com.necoco.lazycolumn_ime.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MessageBubble(text: String){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(
            Modifier
                .padding(PaddingValues(start = 8.dp, top = 8.dp, end = 48.dp, bottom = 8.dp)) // 外側：吹き出し同士の間隔
                .background(Color(0xFFDCF8C6), RoundedCornerShape(12.dp)) //Color(0xFFE0E0E0)
                .padding(12.dp) // 内側：吹き出しの中の余白
        ) {
            Text(text, color = Color.Black)
        }
    }
}