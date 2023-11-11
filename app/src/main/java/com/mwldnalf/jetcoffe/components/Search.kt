package com.mwldnalf.jetcoffe.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.material.search.SearchBar
import com.mwldnalf.jetcoffe.R
import com.mwldnalf.jetcoffe.ui.theme.JetCoffeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier = Modifier) {
//    SearchBar(
//        query = "",
//        onQueryChange = {},
//        onSearch = {},
//        active = false,
//        onActiveChange = {},
//        leadingIcon = {
//            Icon(
//                imageVector = Icons.Default.Search,
//                contentDescription = null,
//                tint = MaterialTheme.colorScheme.onSurfaceVariant
//            )
//        },
//        placeholder = {
//            Text(stringResource(R.string.placeholder_search))
//        },
//        shape = MaterialTheme.shapes.large,
//        colors = SearchBarDefaults.colors(
//            containerColor = MaterialTheme.colorScheme.background
//        ),
//        modifier = modifier
//            .padding(16.dp)
//            .fillMaxWidth()
//            .heightIn(min = 48.dp)
//    ) {
//    }
}

@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    JetCoffeTheme {
        Search()
    }
}
