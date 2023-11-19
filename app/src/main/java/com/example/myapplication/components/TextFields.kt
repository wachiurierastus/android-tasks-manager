package com.example.myapplication.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@OptIn(ExperimentalMaterial3Api::class)
class TextFields {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun BasicTextField(
        @StringRes text: Int,
        value: String,
        onNewValue: (String) -> Unit,
        modifier: Modifier = Modifier
    ) {
      OutlinedTextField(
        singleLine = true,
        modifier = modifier,
        value = value,
        onValueChange = { onNewValue(it) },
        placeholder = { Text(stringResource(text)) }
      )
    }
    @Composable
    fun TextFieldWithLeadingIcon(fieldType: Int)
    {
        val text = when(fieldType)
        {
            0 -> "Email"
            1 -> "Password"
            2 -> "Username"
            else -> "Email"
        }
        val icon = when(fieldType)
        {
            0 -> Icons.Default.Email
            1 -> Icons.Default.Lock
            2 -> Icons.Default.AccountCircle
            else -> Icons.Default.Email
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.Blue
            )
            Spacer(modifier = Modifier.width(16.dp))
            TextField(
                value = TextFieldValue(""),
                onValueChange = { },
                label = { Text(text) },
                modifier = Modifier.fillMaxWidth()
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldWithLeadingIconPreview()
{
    TextFields().TextFieldWithLeadingIcon(0)
}

//@Preview(showBackground = false)
//@Composable
//fun BasicTextField()
//{
//    TextFields().BasicTextField(R.string.email, "Email", { })
//}