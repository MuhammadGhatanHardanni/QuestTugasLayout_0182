package com.example.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLayout2(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(25.dp))

        MahasiswaCard(
            backgroundColor = R.color.card_gray,
            leftImage = R.drawable.logoumy,
            rightImage = R.drawable.logoumy,
            nameText = R.string.nama_ghatan,
            nimText = R.string.nim_ghatan,
            addressText = R.string.alamat_ghatan,
            nameColor = R.color.text_white,
            nimColor = R.color.text_white,
            addressColor = R.color.text_yellow,
            isCursive = true
        )

        MahasiswaCard(
            backgroundColor = R.color.card_purple,
            leftImage = R.drawable.logoumy,
            rightImage = R.drawable.logoumy,
            nameText = R.string.nama_arya,
            nimText = R.string.nim_arya,
            addressText = R.string.alamat_arya,
            nameColor = R.color.text_white,
            nimColor = R.color.text_cyan,
            addressColor = R.color.text_yellow
        )

        MahasiswaCard(
            backgroundColor = R.color.card_blue,
            leftImage = R.drawable.logoumy,
            rightImage = R.drawable.logoumy,
            nameText = R.string.nama_dzaky,
            nimText = R.string.nim_dzaky,
            addressText = R.string.alamat_dzaky,
            nameColor = R.color.text_white,
            nimColor = R.color.text_cyan,
            addressColor = R.color.text_white
        )

        MahasiswaCard(
            backgroundColor = R.color.card_green,
            leftImage = R.drawable.logoumy,
            rightImage = R.drawable.logoumy,
            nameText = R.string.nama_jehan,
            nimText = R.string.nim_jehan,
            addressText = R.string.alamat_jehan,
            nameColor = R.color.text_white,
            nimColor = R.color.text_cyan,
            addressColor = R.color.text_white
        )

        Spacer(modifier = Modifier.weight(1f, fill = false))
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = stringResource(R.string.copy),
            fontSize = 14.sp
        )
    }
}