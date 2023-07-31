package com.example.basic_navigation_jetpackcompose


interface Destinations{
    val route: String
}
object Dashboard: Destinations{
    override val route: String = "Hello"
}
object Details: Destinations{
    override val route: String = "Details"
}
