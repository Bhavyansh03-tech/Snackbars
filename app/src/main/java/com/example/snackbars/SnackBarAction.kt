package com.example.snackbars

data class SnackBarAction(
    val name: String,
    val action: suspend () -> Unit
)

data class SnackBarEvent(
    val message: String,
    val action: SnackBarAction? = null
)