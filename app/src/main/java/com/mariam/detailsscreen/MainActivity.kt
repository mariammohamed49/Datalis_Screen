package com.mariam.detailsscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.mariam.detailsscreen.githubreposapp.presentation.screens.DetailsScreen
import com.mariam.detailsscreen.issues_screen.AppBar
import com.mariam.detailsscreen.issues_screen.IssueScreen

class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IssueScreen()
        }
    }
}


