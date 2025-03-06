package dms_Lops;

public class Factorial {

    int number , factorial=1  ;

    Factorial(int fac){
        this.number= fac;
    }

    public void calculatfact(){
         if(number<0){
             System.out.println("Enter Non-Negative number");
         }else
         {
             for(int i = 1 ; i<=number;i++){
                    factorial= factorial*i;
             }
         }
        System.out.println("Factorial of number : "+factorial);
    }
}
