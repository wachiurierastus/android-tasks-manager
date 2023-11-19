package com.example.myapplication.components

import android.os.Build
import android.view.RoundedCorner
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.shape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

class Buttons {
    @Composable
    fun BasicButton(@StringRes text: Int, modifier: Modifier) {
        Button(
            onClick = {} ,
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(4.dp),
            colors =
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Text(text = stringResource(text), fontSize = 16.sp)
        }
    }

    @Preview(showBackground = false)
    @Composable
    fun BasicButtonPreview() {
        Buttons().BasicButton(R.string.email, Modifier)
    }

}