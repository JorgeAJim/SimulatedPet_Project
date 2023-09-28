//Happiness.java

import java.util.*;
import java.io.*;

public class Happiness extends Attribute implements Serializable{
  
  public Happiness(){
    super.status = 3;
  }//end constructor

  public void increaseStatus(){
    super.status += 1;
    System.out.println("You played with your pet for an hour");
  }//end increaseStatus

  public void decreaseStatus(){
    super.status -= 1;
    if(super.status < 0){
      super.status += 1;
      System.out.println("Your being to cruel to your pet");
    } else {
      System.out.println("You didn't play with your pet at all");
    }//end if
  }//end decreaseStatus

  public void showStatus(){
    if(super.status >= super.high){
      System.out.println("Your pet is very happy");
    } else if(super.status == super.medium){
      System.out.println("Your pet is satisfied with your love");
    } else if(super.status == super.low){
      System.out.println("You need to play with your pet, it's sad without you");
    } else if(super.status == 0){
      System.out.println("You haven't played with your pet at all. It's very sad");
    } else {
      System.out.println("You don't have a pet");
    }//end if
  }//end showStatus

}//end class def
