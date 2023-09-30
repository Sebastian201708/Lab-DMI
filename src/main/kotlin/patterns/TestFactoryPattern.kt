package patterns

import edu.utvt.beans.FashionStyles
import edu.utvt.beans.Outfit
import edu.utvt.beans.OutfitFactory

fun main() {
    val sportyOutfit = OutfitFactory.getOutfit(FashionStyles.SPORTY)
    val defaultOutfit = OutfitFactory.getDefaultOutfit()

    println("Sporty Outfit:")
    printOutfit(sportyOutfit)

    println("\nDefault Outfit:")
    printOutfit(defaultOutfit)
}

fun printOutfit(outfit: Outfit) {
    println("Shirt: ${outfit.shirt.color}, Color: ${outfit.shirt.color}")
    println("Pants: ${outfit.pants.color}, Color: ${outfit.pants.color}")
    println("Shoes: ${outfit.shoes.color}, Color: ${outfit.shoes.color}")
}


