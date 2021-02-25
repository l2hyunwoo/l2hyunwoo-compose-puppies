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
package com.example.androiddevchallenge.model

import android.os.Parcelable
import com.example.androiddevchallenge.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dog(
    val name: String,
    val kind: String,
    val image: Int,
    val description: String
) : Parcelable

val dogList = listOf(
    Dog(
        name = "Gizmo",
        kind = "Siberian Husky",
        image = R.drawable.ic_siberian_husky,
        description = "The only thing better than one adorable husky is an entire sled team of 'em. Just be prepared for their outsized energy."
    ),
    Dog(
        name = "Rex",
        kind = "Husky",
        image = R.drawable.ic_husky,
        description = "Huskies are clever, happy, and responsive. They're friendly by nature but also very stubborn. This high-energy dog prefers to spend lots of time outdoors.\n" +
            "\n"
    ),
    Dog(
        name = "Hank",
        kind = "Poodle",
        image = R.drawable.ic_poodle,
        description = "Even though all poodles are considered one (extremely intelligent) breed, they come in three sizes: standard, miniature, and toy. The miniature variety typical weighs in at a manageable 15 to 17 pounds. As for that fancy haircut, the \"poodle clip\" is designed to protect the joints and organs in cold water."
    ),
    Dog(
        name = "Gus",
        kind = "Welsh Corgi",
        image = R.drawable.ic_welsh_corgi,
        description = "Trust the Queen of England to have an excellent taste in dogs. Elizabeth II's love for corgis goes unmatched — she's had over 30 of them in her lifetime!"
    ),
    Dog(
        name = "Rocco",
        kind = "Sheperd",
        image = R.drawable.ic_shepherd,
        description = "Beauty and brains, Aussies have got it all. These intelligent pups like having a job to do, so the people-pleasers pick up new tricks right away."
    ),
    Dog(
        name = "Boxter",
        kind = "Beagle",
        image = R.drawable.ic_beagle,
        description = "Snoopy may be the world's most popular beagle, but the three-dimensional ones are just as charming. The lovable hounds like to follow their noses, occasionally right into trouble.\n" +
            "\n"

    ),
    Dog(
        name = "Sammy",
        kind = "Bulldog",
        image = R.drawable.ic_bulldog,
        description = "It's no surprise city dwellers spot Frenchies on almost every block. The low-energy, big-eared pups are probably the cutest roommates you could have. Plus, they never leave dishes in the sink."
    ),
    Dog(
        name = "Rufus",
        kind = "Dacshund",
        image = R.drawable.ic_dacshund,
        description = "Smooth, wirehaired or longhaired, there's a type of dachshund for everybody. They even come in two different sizes: standard and miniature."
    ),
    Dog(
        name = "Teddy",
        kind = "Golden Retreiver",
        image = R.drawable.ic_retriever,
        description = "They're one of the most popular dogs in the country for a reason. Goldens look photo-ready no matter what."
    ),
    Dog(
        name = "Joey",
        kind = "SheepDog",
        image = R.drawable.ic_sheepdog,
        description = "Shelties love kids and cuddles. And with that face, what more could you need?"
    ),
    Dog(
        name = "Champ",
        kind = "American Staffordshire Terrier",
        image = R.drawable.ic_terrier,
        description = "Am Staffs are just one of the breeds popularly called pit bulls, but don't let stereotypes fool you. These good-natured and smart pups love being a part of the family."
    ),
)
