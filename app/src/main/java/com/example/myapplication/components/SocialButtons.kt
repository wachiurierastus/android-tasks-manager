package com.example.myapplication.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class SocialButtons {
    @Composable
    fun BasicSocialButton(socialType: Int ) {
        var text = when(socialType)
        {
            0 -> "Google"
            1 -> "Facebook"
            2 -> "Twitter"
            else -> "Google"
        }
        var icon = when(socialType)
        {
            0 -> Icons.Default.AccountCircle
            1 -> Icons.Default.Face
            2 -> Icons.Default.Lock
            else -> Icons.Default.AccountCircle
        }
        Box(modifier = Modifier
            .border(
                BorderStroke(1.dp, MaterialTheme.colorScheme.onSurface),
                shape = RoundedCornerShape(12.dp)
            )
            .size(48.dp)
        ){
            Icon(imageVector = icon,
                contentDescription = text,
                modifier = Modifier
                    .padding(10.dp)
                    //.aspectRatio(1f)
                    .size(35.dp)
                    .clip(shape = CircleShape)

            )
        }

    }
    @Preview(showBackground = true)
    @Composable
    fun BasicSocialButtonPreview() {
        SocialButtons().BasicSocialButton(0)
    }
}