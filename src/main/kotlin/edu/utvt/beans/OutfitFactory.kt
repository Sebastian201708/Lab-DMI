package edu.utvt.beans

import interfaces.Fashion

object OutfitFactory: Fashion {
    override fun getOutfit(fashionStyles: FashionStyles): Outfit {
        val outfit: Outfit = when (fashionStyles) {
            FashionStyles.SPORTY -> getSportyOutfit()
            else -> getSportyOutfit()
        }
        return outfit;
    }

    override fun getSportyOutfit() = Outfit(
        Shirt("T-Shirt", Color.WHITE),
        Pants("Jogger", Color.GREEN),
        Shoes("Tennis", Color.YELLOW)

    );
    override fun getDefaultOutfit() = Outfit(
        Shirt("T-Shirt", Color.WHITE),
        Pants("Jogger", Color.GREEN),
        Shoes("Tennis", Color.YELLOW)

    );


}

