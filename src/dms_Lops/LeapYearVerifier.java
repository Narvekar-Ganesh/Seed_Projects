package dms_Lops;

public class LeapYearVerifier {
    int number ;
    LeapYearVerifier(int number){
        this.number=number;
    }
    public void  leapVerifier(){
        if(number % 4 == 0){
            System.out.println("Leap Year");
        }
        System.out.println("Not a Leap  year");
    }


}
