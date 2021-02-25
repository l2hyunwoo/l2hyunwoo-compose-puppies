/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Dog

@Composable
fun DogDetail(
    dog: Dog,
    upPress: () -> Unit
) {
    val name = remember(dog) { dog.name }
    val kind = remember(dog) { dog.kind }
    val image = remember(dog) { dog.image }
    val description = remember(dog) { dog.description }

    Row(
        Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            .fillMaxWidth()
    ) {
        Image(
            painterResource(R.drawable.ic_arrow),
            contentDescription = "back",
            Modifier.clickable { upPress() }
        )
    }

    Column(
        Modifier.padding(16.dp)
    ) {
        Spacer(Modifier.height(20.dp))
        Text(
            name,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Image(
            painter = painterResource(image),
            contentDescription = "dog",
            modifier = Modifier
                .height(160.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(Modifier.height(16.dp))
        Column {
            Text(
                text = buildAnnotatedString {
                    withStyle(SpanStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)) { append("Kind: ") }
                    withStyle(SpanStyle(fontSize = 20.sp)) { append(kind) }
                }
            )
            Text(description, fontSize = 16.sp)
        }
    }
}
