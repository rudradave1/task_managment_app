package com.rudra.perfisystkehometask

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

//initializing the data class with default parameters
data class BottomNavigationItem(
    val label : String = "",
    val icon : ImageVector = Icons.Filled.Home,
    val route : String = ""
) {

  //function to get the list of bottomNavigationItems
    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = "Home",
                icon = Icons.Filled.Home,
                route = "margh_home"
            ),
            BottomNavigationItem(
                label = "Search",
                icon = Icons.Outlined.Favorite,
                route = "margh_saved"
            ),
            BottomNavigationItem(
                label = "Profile",
                icon = Icons.Outlined.Person,
                route = "margh_profile"
            ),
        )
    }
}