package com.automacorp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.automacorp.model.RoomDto // Ensure this import is correct

class RoomViewModel : ViewModel() {
    var room by mutableStateOf<RoomDto?>(null)
}
