package com.mariam.detailsscreen.issues_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mariam.detailsscreen.R

@Composable
fun IssuesItem (githubIssuesUiMode:GithubIssuesUiMode,) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .background(
                MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Image(
            painter= painterResource(id = R.drawable.issue_logo),
            contentDescription = "issue logo",
            modifier = Modifier.size(60.dp)
                .clip(RoundedCornerShape(60.dp))
                .padding(start = 2.dp, top=2.dp)

        )

    Column {
            Row(horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .padding(top = 8.dp)) {
                Text(
                    text = githubIssuesUiMode.title,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.weight(1f),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )

                )

                Text(
                    text = githubIssuesUiMode.state,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(horizontal = 10.dp)
                    )
              }
            Text(
                text = githubIssuesUiMode.description,
                color = MaterialTheme.colorScheme.onSurface,
                modifier        = Modifier
                    .padding(horizontal = 10.dp)
                    .padding(top = 7.dp)
            )
            Row {
                Text(
                text = githubIssuesUiMode.createdAt,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .padding(top = 7.dp)
                    .padding(bottom = 5.dp),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,)
            )
                Text(
                    text = githubIssuesUiMode.date,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .padding(top = 7.dp)
                        .padding(bottom = 5.dp),

                )
            }

        }


        }
    }




@Preview
@Composable
private fun PreviewIssuesItem() {
    IssuesItem(
        githubIssuesUiMode = GithubIssuesUiMode(title ="Bump pyarrow from 7 and using three parameter",
         description = "NOEN", createdAt ="Created At : " , state ="Open", date = "2023 -22-9,23:0PM " )
            )

}