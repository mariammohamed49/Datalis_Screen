@file:OptIn(ExperimentalMaterial3Api::class)

package com.mariam.detailsscreen.githubreposapp.presentation.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mariam.detailsscreen.R
import com.mariam.detailsscreen.ui.theme.lightGray


//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen () {
    Scaffold(
    topBar = {
        TopAppBar(
            title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                        IconButton(onClick = { /*this action*/ }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "to back"
                            )
                        }
                    }
                    Box(modifier = Modifier.weight(6f), contentAlignment = Alignment.Center) {
                        Text(text = "Details")
                    }
                    Box(modifier = Modifier.weight(1f))
                }
            }
        )
    }
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .padding(10.dp)
            .background(color = lightGray)
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Image(
            painter = painterResource(id = R.drawable.google),
            contentDescription = "Google Logo",
            modifier = Modifier.size(150.dp)
            .align(Alignment.CenterHorizontally)
            .clip(RoundedCornerShape(150.dp))
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "language",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold ,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.width(80.dp))
            Text(text = "1400",fontSize = 17.sp)

            Spacer(modifier = Modifier.width(5.dp))
            Image(
                painter = painterResource(id = R.drawable.star),
                contentDescription = " stars",
                modifier = Modifier.size(25.dp)
                    .clip(RoundedCornerShape(30.dp))
            )

            Spacer(modifier = Modifier.width(15.dp))

            Text(text = "Python",fontSize = 17.sp)
            Spacer(modifier = Modifier.width(5.dp))
            Image(
                painter = painterResource(id = R.drawable.circle),
                contentDescription = "language ",
                modifier = Modifier.size(25.dp)
                    .clip(RoundedCornerShape(30.dp))
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "200",fontSize = 17.sp)
            Spacer(modifier = Modifier.width(5.dp))
            Image(
                painter = painterResource(id = R.drawable.forks),
                contentDescription = "language ",
                modifier = Modifier.size(25.dp)
                    .clip(RoundedCornerShape(30.dp))
            )

        }

        Spacer(modifier = Modifier.height(32.dp))

        //  description
        Text(
            text = "Shared repository for open-sourced projects from the Google AI Language team.",
            modifier = Modifier.padding(horizontal = 16.dp),
                    fontSize = 22.sp
        )

        Spacer(modifier = Modifier.weight(1f))
        // Show Issues button
        Button(onClick = { /* Handle button click */ }
            ,modifier = Modifier.align(Alignment.CenterHorizontally),
            shape= RoundedCornerShape(0.dp), // Make the button square
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue))
        {
            Text(text = "Show Issues",fontSize = 20.sp)

        }

    }
}
}



@Preview(showBackground = true)
@Composable
 fun PreviewDetailsScreen() {
    DetailsScreen ()
}
