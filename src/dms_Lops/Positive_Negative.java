package dms_Lops;

public class Positive_Negative {

    int number = 25 ;
    public void toCheck(){

        if (number < 0){
            System.out.println("Number is Negative"+number);
        } else if (number > 0) {
            System.out.println("Number is Positive"+number);
        }else{
            System.out.println("Number is Zero"+number);
        }
    }

}
