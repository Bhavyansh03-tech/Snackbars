package com.example.snackbars

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.launch

@Composable
fun ScreenA(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    viewModel: ScreenAViewModel = viewModel()
) {
    val scope = rememberCoroutineScope()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            scope.launch {
                SnackBarController.sendEvent(
                    event = SnackBarEvent(
                        message = "Show SnackBar!"
                    )
                )
            }
        }) {
            Text(text = "Show SnackBar")
        }

        Button(onClick = {
            viewModel.showSnackBar()
        }) {
            Text(text = "Show SnackBar with action bar")
        }

        Button(onClick = onClick) {
            Text(text = "Navigate to Screen B")
        }
    }
}