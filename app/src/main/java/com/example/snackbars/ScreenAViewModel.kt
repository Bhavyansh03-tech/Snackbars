package com.example.snackbars

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.launch

class ScreenAViewModel: ViewModel(){

    fun showSnackBar() {
        viewModelScope.launch {
            SnackBarController.sendEvent(
                event = SnackBarEvent(
                    message = "SnackBar with action bar!",
                    action = SnackBarAction(
                        name = "Undo",
                        action = {
                            // do something
                            SnackBarController.sendEvent(
                                event = SnackBarEvent(
                                    message = "Action Pressed!"
                                )
                            )
                        }
                    )
                )
            )
        }
    }
}