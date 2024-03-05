package br.com.alura.aluvery.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alura.aluvery.R
import br.com.alura.aluvery.model.Product
import br.com.alura.aluvery.sampledata.sampleProducts
import br.com.alura.aluvery.sampledata.sampleSections
import br.com.alura.aluvery.ui.components.CardProductItem
import br.com.alura.aluvery.ui.components.ProductsSection
import br.com.alura.aluvery.ui.components.SearcTextField
import br.com.alura.aluvery.ui.theme.AluveryTheme
import br.com.alura.aluvery.ui.theme.Indigo400

//@Composable
//fun HomeScreen() {
//    Scaffold(
//        topBar = { ScaffoldTopBar() },
//    ) {
//        Box(
//            Modifier.padding(it)
//        ) {
//            ScaffoldImage()
//        }
//    }
//}

@Composable
fun ScaffoldImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = null
    )
}

@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>,
    searchText: String = ""
) {
    Column {
        var text by remember{
            mutableStateOf(searchText)
        }

        SearcTextField(searchText = searchText, onSearchTextChange = {
            text = it
        } )

        val searchedProducts = remember(text) {
            if(text.isNotBlank()) {
                sampleProducts.filter { product ->
                    product.name.contains(
                        text,
                        ignoreCase = true,
                    ) ||
                            product.description?.contains(
                                text,
                                ignoreCase = true,
                            ) ?: false
                }
            } else emptyList()
        }
        LazyColumn(
            Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {

            if (text.isBlank()) {
                for (section in sections) {
                    val title = section.key
                    val products = section.value
                    item {
                        ProductsSection(
                            title = title,
                            products = products
                        )
                    }
                }
            } else {
                items(searchedProducts) { p ->
                    CardProductItem(product = p, Modifier.padding(16.dp))
                }
            }
        }
    }
}

@Composable
fun ScaffoldTopBar() {
    Row(modifier = Modifier
        .background(Indigo400)
        .padding(12.dp)
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {

        Icon(Icons.Rounded.Home,
            contentDescription = null,
            tint = Color.White)

        Text(text = "Codegenius",
            color = Color.Yellow,
            textAlign = TextAlign.Center,
            fontSize = 22.sp
        )

        Icon(Icons.Rounded.ExitToApp,
            contentDescription = null,
            tint = Color.White)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections)
//            HomeScreen()
        }
    }
}