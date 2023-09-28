//Cat.java

import java.util.*;
import java.io.*;

public class Cat extends Pet implements Serializable{

  protected int currentAge = 0;
  protected int catNumber;

  public Cat(int catNumber){
    super.name = "Anonymous";
    super.age = 0;
    this.catNumber = catNumber;
  }//end null constructor

  public String makeNoise(){
    String noise = "Meow";
    return noise;
  }//end makeNoise

  public void increaseAge(){
    currentAge += 1;
    if(currentAge == 1){
      super.age = 15;
    } else if(currentAge == 2){
      super.age = super.age + 9;
    } else if(currentAge >= 3){
      super.age += 4;
    } else {
      System.out.println("Something went wrong");
    }//end if
  }//end setAge

}//end class def
