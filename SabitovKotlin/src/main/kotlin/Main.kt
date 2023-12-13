package org.example

import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.io.*
import org.jetbrains.kotlinx.dataframe.api.*

fun main() {
    var df = DataFrame.read("movies.csv")
    df.print()
    println(df.columnNames())
    println(df.count())
    df = df.sortBy("title")
    df = df.filter { "genres"<String>().contains("Comedy") }
    df.print()
    df.writeCSV("movies-by-title.csv")

}