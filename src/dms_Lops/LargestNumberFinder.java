package dms_Lops;

public class LargestNumberFinder {
    int a ,b,c;LargestNumberFinder(int n1 , int n2,int n3){
        this.a=n1;
        this.b=n2;
        this.c=n3;
    }

    public void largestNumber(){
        if (a >b && a>c){
            System.out.println(" First number is largest");
        } else if (b > a && b >c) {
            System.out.println(" Second  number is largest");
        }else {
            System.out.println(" Third  number is largest");
        }
    }
}
