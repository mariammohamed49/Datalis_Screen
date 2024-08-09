package com.mariam.detailsscreen.issues_screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mariam.detailsscreen.R

@ExperimentalMaterial3Api
@Composable
fun IssueScreen() {
    val githubIssue= listOf(

        GithubIssuesUiMode(title ="Bump pyarrow from 7 and using three parameter",
            description = "NOEN", createdAt ="Created At : " , state ="Open", date = "2023 -22-9,23:0PM " )
        ,
        GithubIssuesUiMode(
                    title = "Fix bug in authentication flow",
                    description = "Resolve the issue causing login failures on Android devices.",
                    createdAt = "2024-07-15",
                    state = "Open",
                    date = "2024-07-15 14:30"
                ),
        GithubIssuesUiMode(
            title = "Update documentation",
            description = "Add missing sections on the API usage and best practices.",
            createdAt = "2024-06-22",
            state = "Closed",
            date = "2024-06-22 09:00"
        ),
        GithubIssuesUiMode(
            title = "Refactor codebase",
            description = "Simplify the structure and improve code readability.",
            createdAt = "2024-08-01",
            state = "Open",
            date = "2024-08-01 16:45"
        ),
        GithubIssuesUiMode(
            title = "Implement dark mode",
            description = "Add support for dark mode across the app.",
            createdAt = "2024-05-30",
            state = "Closed",
            date = "2024-05-30 11:20"
        ),
        GithubIssuesUiMode(
            title = "Add new feature: User Profiles",
            description = "Enable users to create and customize their profiles.",
            createdAt = "2024-07-10",
            state = "Open",
            date = "2024-07-10 13:10"
        ),
        GithubIssuesUiMode(
            title = "Improve performance",
            description = "Optimize database queries to reduce loading times.",
            createdAt = "2024-07-25",
            state = "In Progress",
            date = "2024-07-25 10:15"
        ),
        GithubIssuesUiMode(
            title = "Fix UI glitches",
            description = "Resolve layout issues on smaller screen sizes.",
            createdAt = "2024-08-05",
            state = "Open",
            date = "2024-08-05 18:00"
        )
    )


    Column (Modifier.fillMaxSize()
        .background(MaterialTheme.colorScheme.background))
    {
        AppBar(title = stringResource(id = R.string.issue_screen_title),
           showBackArrow = true,
           modifier = Modifier .fillMaxWidth()
            )
        LazyColumn(
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            items(githubIssue){issueItem->
                Log.d("IssueScreen", "Issue: ${issueItem.title}")
                IssuesItem(githubIssuesUiMode = issueItem)
            }
        }

    }

}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewIssueScreen () {
    IssueScreen()
}