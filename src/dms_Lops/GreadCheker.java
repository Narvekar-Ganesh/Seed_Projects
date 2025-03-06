package dms_Lops;

import java.util.Scanner;

public class GreadCheker {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        switch (marks/10){
            case  9: {
                System.out.println("A Grade");
                break;
            }
            case 8  : {
                System.out.println("B grade");

                break;
            }

            case 7  : {
                System.out.println("C grade");
                break;
            }
            case 6  : {
                System.out.println("D grade");
                break;
            }
            default:{
                System.out.println("Fail");
            }
        }

    }
}
