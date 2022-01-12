public class BoutiqueBagDemo {

    public static void main(String[] args) {
        // initialize abstract array including objects
        BagInterface<ClothingArticle> adtBag = new ClothingBag<>();
        ClothingArticle[] Garments = new ClothingArticle[10];
        Garments[0] = new ClothingArticle("Red Paisley Button down", 84.99);
        Garments[1] = new ClothingArticle("Denim Vest", 27.99);
        Garments[2] = new ClothingArticle("Yellow Summer Dress", 38.99);
        Garments[3] = new ClothingArticle("Stone Washed Orange Jeans", 84.99);
        Garments[4] = new ClothingArticle("White Graphic Tee", 19.99);
        Garments[5] = new ClothingArticle("Turquoise Romper", 29.99);
        Garments[6] = new ClothingArticle("American FLag Jeans", 62.99);
        Garments[7] = new ClothingArticle("Purple Loafers", 49.99);
        Garments[8] = new ClothingArticle("Silver Button down", 19.99);
        Garments[9] = new ClothingArticle("Green Graphic Tee", 14.99);
        testAdd(adtBag, Garments);
    }

    private static void testAdd(BagInterface<ClothingArticle> adtBag,
                                ClothingArticle[] item)
            
    {
        System.out.println("");
        System.out.println("Adding These " + item.length +
                " Items: ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        for (ClothingArticle item1 : item) {
            if (adtBag.add(item1)) {
                System.out.println(item1 + " ");
            } else {
                System.out.print("\nCannot add " + item1 + " to bag.");
            }
        }
        System.out.println();
        displayBag(adtBag);
    } // end

    // Testing toArray method while also displaying bag.
    private static void displayBag(BagInterface<ClothingArticle> adtBag)
    {
        System.out.println("*-*-*-*-*-*-*-*-*");
        System.out.println("Shopping Cart:");
        System.out.println("*-*-*-*-*-*-*-*-*");
        Object[] bagArray = adtBag.toArray();
        for (Object bagArray1 : bagArray) {
            System.out.println(bagArray1 + " ");
        } 
        System.out.println();
    } // end

}