package Language_basic;

public class AvarageCalculator {

    float a ,b,c,result;

    AvarageCalculator(float n1 ,float n2,float n3){
        this.a=n1;
        this.b=n2;
        this.c=n3;
    }

    public void avarage(){
        result = ((a+b+c)/3);
        System.out.println("Average of three number is "+result);
    }


}
