package dms_Lops;

import java.util.Scanner;

public class VowelOrConsonant {
  char charactor;

  public VowelOrConsonant(char leatter){
      this.charactor=leatter;
  }

  public void toVowelorConsonant(){
      if (charactor =='a' || charactor =='A'||charactor =='e' || charactor =='E'||
              charactor =='i' || charactor =='I'||charactor =='o' || charactor =='O'||
              charactor =='u' || charactor =='U' ){
          System.out.println("Charactor is Consonant");

          System.out.println("Charactor is Vowel");
      }else {
      }
  }

}
