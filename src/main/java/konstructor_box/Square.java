package konstructor_box;

public class Square {

    public int a;

    public Square (int a){
        this.a = a;
    }
    int Perimeter (){

        return 4*a;
    }
    int Area (){
        return a*a;
    }

    public void Display(){
        System.out.println("Perimeter = " + Perimeter());
        System.out.println("Area = " + Area());
    }

}
