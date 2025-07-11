package org.bashkevich.browsernavigationissue.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreen(
    onNavigateUp: ()-> Unit,
    onPopBackStack: ()-> Unit
){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Second Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateUp) {
            Text("Navigate Up")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onPopBackStack) {
            Text("Pop back stack")
        }
    }
}