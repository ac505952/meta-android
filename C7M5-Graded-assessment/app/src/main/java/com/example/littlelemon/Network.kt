package com.example.littlelemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    val id: Int,
    val title: String,
    val price: String
)

@Serializable
data class MenuItemNetwork(
    val menu: MenuNetwork
) {
    fun toMenuItemRoom() = MenuItemRoom(
        menu.id,
        menu.title,
        menu.price.toDouble()
    )
}
