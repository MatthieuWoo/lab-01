package com.example.petshop

class Happy(mood: String, date: String): Mood(mood, date) {
    override fun getMood(): String {
        return "HAPPY! YAY!"
    }
}