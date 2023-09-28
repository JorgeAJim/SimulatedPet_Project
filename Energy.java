//Energy.java


import java.util.*;
import java.io.*;

public class Energy extends Attribute implements Serializable{

  public Energy(){
    super.status = 2;
  }//end constructor

  public void increaseStatus(){
    super.status = 3;
    System.out.println("Your pet slept");
  }//end increaseStatus

  public void decreaseStatus(){
    super.status -= 1;
    if(super.status < 0){
      super.status += 1;
      System.out.println("Your pet needs to rest");
    } else {
      System.out.println("You played with your pet");
    }//end if
  }//end decreaseStatus

  public void showStatus(){
    if(super.status == super.high){
      System.out.println("Your pet has a lot of energy");
    } else if(super.status == super.medium){
      System.out.println("Your pet could use some more play time");
    } else if(super.status == super.low){
      System.out.println("Your pet is ready for a nap");
    } else if(super.status == 0){
      System.out.println("Your pet won't play until it gets some rest");
    } else {
      System.out.println("Couldn't find your pet");
    } //end if
  }//end showStatus

}//end class def
