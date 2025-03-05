package Language_basic;

public class Division {
    int a = 150;
    int b = 3;
    int qua, rem ;

    Division(int n1 ,int n2){
        this.a=n1;
        this.b=n2;
    }

    public void todivisor (){
        qua= a/ b;
        rem=a%b;
        System.out.println("Quotient is :" +qua+  "Reminder is"+ rem);
    }

}
