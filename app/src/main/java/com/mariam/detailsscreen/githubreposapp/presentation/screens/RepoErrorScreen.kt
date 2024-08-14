package com.mariam.detailsscreen.githubreposapp.presentation.screens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mariam.detailsscreen.R
import com.mariam.detailsscreen.issues_screen.AppBar


@ExperimentalMaterial3Api
@Composable
fun RepoErrorScreen (onClickRetry: () -> Unit) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            AppBar(
                title =stringResource(id = R.string.repository_screen_title),
                showBackArrow = false

            )
        }
    ){paddingValues ->
//        Divider(
//            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
//            thickness = 10.dp,
//            modifier = Modifier
//                .fillMaxWidth())
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues ),
            horizontalAlignment = Alignment.CenterHorizontally,

            )
        {
            Image(painter =painterResource( R.drawable.repo_error),
                contentDescription = stringResource(R.string.repository_screen_error_image_description),
                modifier = Modifier
                    .size(300.dp)
                    .padding(start = 55.dp, end = 55.dp))
            Text(
                text = stringResource(id = R.string.cause_of_error),
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),

                modifier = Modifier
                    .padding(start = 40.dp, end = 40.dp, bottom = 5.dp)
            )
            Text(
                text = stringResource(id = R.string.details_cause_of_error),
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .padding(start = 80.dp, end = 80.dp, bottom =70.dp)
            )
            Button(
                onClick = onClickRetry,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.secondary),
                shape = RectangleShape,
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally)

            ) {
                Text(
                    text = stringResource(R.string.retry_please),
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = MaterialTheme.colorScheme.secondary
                    ).copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(
                        horizontal = 85.dp
                    )
                )
            }



        }


    }


}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewRepoErrorScreen() {
    RepoErrorScreen(onClickRetry = {})
}

