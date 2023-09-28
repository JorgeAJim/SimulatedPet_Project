//Hunger.java

import java.util.*;
import java.io.*;

public class Hunger extends Attribute implements Serializable{
 
  public Hunger(){
    super.status = 3;
  }//end contructor

  public void increaseStatus(){
    super.status = 3;
    System.out.println("You didn't feed your pet");
  }//end increaseStatus

  public void decreaseStatus(){
    super.status -= 1;
    if(super.status < 0){
      System.out.println("You can't overfeed your pet");
    } else {
      System.out.println("You feed your pet");
    }//end if
  }//end decreaseStatus

  public void showStatus(){
    if(super.status == super.high){
      System.out.println("Your pet is starving");
    } else if(super.status == super.medium){
      System.out.println("Your pet could use some more food");
    } else if(super.status == super.low){
      System.out.println("Your pet is full");
    } else if(super.status == 0){
      System.out.println("Your pet can't eat anymore");
    } else {
      System.out.println("Couldn't find your pet");
    } //end if
  }//end showStatus

}//end class def
