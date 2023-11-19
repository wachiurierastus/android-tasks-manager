package com.example.myapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun BottomNavBar() {
    BottomAppBar(modifier = Modifier.padding(0.dp).clip(shape = RoundedCornerShape(bottomStart = 5.dp, bottomEnd =10.dp )),
    ){
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            //Home IconButton
            IconButton(onClick = { /*TODO*/ },
                modifier= Modifier.size(24.dp),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = MaterialTheme.colorScheme.onSurface,
                    disabledContainerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.32f),
                    containerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.01f),
                    disabledContentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.32f)),
                enabled = true) {
                Icon(imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(24.dp),
                    tint = MaterialTheme.colorScheme.onSurface
                    )
            }
            //Calendar IconButton
            IconButton(onClick = { /*TODO*/ },
//                colors = IconButtonDefaults.iconButtonColors(
//                    contentColor = MaterialTheme.colorScheme.onSurface,
//                    disabledContainerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.32f),
//                    containerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.08f)
//                    ,disabledContentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.32f)),
                enabled = true,
                modifier = Modifier.size(24.dp)
                ) {
                Icon(imageVector = Icons.Default.DateRange,
                    contentDescription = "Calendar",
                    modifier = Modifier.size(24.dp),
                    tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.32f)
                )
            }
            //Profile IconButton
            IconButton(onClick = { /*TODO*/ },
                enabled = true,
                modifier = Modifier.size(24.dp)) {
                Icon(imageVector = Icons.Default.Person,
                    contentDescription = "Profile",
                    modifier = Modifier.size(24.dp),
                    tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.32f)
                )
            }

        }
          }

    }
@Preview(showBackground = true)
@Composable
fun BottomNavBarPreview() {
    BottomNavBar()
}



