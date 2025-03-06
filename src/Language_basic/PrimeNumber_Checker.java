package Language_basic;

public class PrimeNumber_Checker {
    int number = 7;
    public void tochrckPrimeNumb(){
        for(int i =1 ; i<=number/2; i++){
            if(number % i == 0){
                System.out.println("Given Number is prime");
            }
        }
    }
}
