package Language_basic;

public class SquareandCudeCalculator {
    int a ,b;

    SquareandCudeCalculator(int number){
        this.a=number;
    }

    public  void square(){
        System.out.println( "Square of number "+ a*a);
    }
    public void  cude(){
        System.out.println( "Cube of number "+ a*a*a);
    }
}
