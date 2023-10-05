package com.apadmi.mockzilla.desktop.ui.scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import java.awt.Cursor

@Composable
internal fun HorizontalDraggableDivider(
    onDrag: (Float) -> Unit,
    onDragStopped: () -> Unit,
) {
    Box(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxHeight()
            .width(3.dp)
            .pointerHoverIcon(PointerIcon(Cursor(Cursor.W_RESIZE_CURSOR)))
            .draggable(
                state = rememberDraggableState { dragAmount ->
                    onDrag(dragAmount)
                },
                orientation = Orientation.Horizontal,
                onDragStopped = { onDragStopped() },
            )
    )
}

@Composable
internal fun VerticalDraggableDivider(
    onDrag: (Float) -> Unit,
    onDragStopped: () -> Unit,
) {
    Box(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxWidth()
            .height(3.dp)
            .pointerHoverIcon(PointerIcon(Cursor(Cursor.N_RESIZE_CURSOR)))
            .draggable(
                state = rememberDraggableState { dragAmount ->
                    onDrag(dragAmount)
                },
                orientation = Orientation.Vertical,
                onDragStopped = { onDragStopped() },
            )
    )
}
