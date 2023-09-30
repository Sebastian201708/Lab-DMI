package patterns

import edu.utvt.beans.Antivirus
import edu.utvt.beans.Shoes
import edu.utvt.beans.ShoppingCart

fun main () : Unit{
    val shoes = Shoes("Estrella del sur");
    var shopping:ShoppingCart = ShoppingCart;
    var shopping2:ShoppingCart = ShoppingCart;
    var antivirus = Antivirus("Estampita del tutor");

    shopping2.addItem(antivirus);
    shopping.addItem(shoes);

    println(shoes);
    println("=============");

    println(antivirus);



}