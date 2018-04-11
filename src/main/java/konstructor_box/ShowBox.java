package konstructor_box;

public class ShowBox {

    public static void main(String[] args) {

        BoxForCat boxForPenny = new BoxForCat(20, 30, 40);
        boxForPenny.printBox();


        System.out.println(boxForPenny.height + boxForPenny.depth);
    }

}

