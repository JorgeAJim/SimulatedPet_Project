//Intelligence.java

import java.util.*;
import java.io.*;


public class Intelligence extends Attribute implements Serializable{

  public Intelligence(){
    super.status = 3;
    //System.out.println("Your new pet came very intelligent");
  }//end constructor

  public void increaseStatus(){
    super.status += 1;
    System.out.println("Your pet learned");
  }//end increaseStatus

  public void decreaseStatus(){
    super.status -= 1;
    if(super.status < 0){
      super.status += 1;
      System.out.println("Your pet needs to study");
    } else {
      System.out.println("Your pet didn't learned anything at doggy daycare");
    } //end if
  }//end decreaseStatus

  public void showStatus(){
    if(super.status >= super.high){
      System.out.println("Your pet is at the top of the class");
    } else if(super.status == super.medium){
      System.out.println("Your pet is very smart");
    } else if(super.status == super.low){
      System.out.println("Your pet should be studying");
    } else if(super.status == 0){
      System.out.println("Your pet is at the bottom of the class");
    } else {
      System.out.println("Couldn't find your pet");
    } //end if
  }//end showStatus


}//end class def
