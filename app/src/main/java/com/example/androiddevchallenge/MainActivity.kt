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
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        // Text(text = "Ready... Set... GO!")
        Greeting()
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}

@Composable
fun Greeting() {
    DogColumn(initDogList())
}

@Composable
fun DogColumn(dogs: List<Dog>) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 0.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(dogs) { DogCard(it) }
    }
}

@Composable
fun DogCard(dog: Dog) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
    ) {
        Image(
            painter = painterResource(id = dog.image),
            contentDescription = "dog",
            modifier = Modifier
                .height(80.dp)
                .width(80.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(dog.name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(dog.kind, fontSize = 12.sp)
        }
    }
}

private fun initDogList() = listOf(
    Dog(
        name = "Gizmo",
        kind = "Siberian Husky",
        image = R.drawable.ic_siberian_husky
    ),
    Dog(
        name = "Rex",
        kind = "Husky",
        image = R.drawable.ic_husky
    ),
    Dog(
        name = "Hank",
        kind = "Poodle",
        image = R.drawable.ic_poodle
    ),
    Dog(
        name = "Gus",
        kind = "Welsh Corgi",
        image = R.drawable.ic_welsh_corgi
    ),
    Dog(
        name = "Rocco",
        kind = "Sheperd",
        image = R.drawable.ic_shepherd
    )
)
