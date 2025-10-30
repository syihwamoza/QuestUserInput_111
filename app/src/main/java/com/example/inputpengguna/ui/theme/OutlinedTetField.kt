package com.example.inputpengguna.ui.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

annotation class OutlinedTetField(
    val value: Any,
    val singleLine: Boolean,
    val shape: androidx.compose.foundation.shape.CornerBasedShape,
    val modifier: androidx.compose.ui.Modifier,
    val label: () -> Unit,
    val onValueChange: () -> Unit
)
