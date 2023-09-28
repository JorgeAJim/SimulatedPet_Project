//Pet.java

import java.util.*;
import java.io.*;

public abstract class Pet implements Serializable{
  protected String name;
  protected int age;
  protected Happiness happy = new Happiness();
  protected Hunger hunger = new Hunger();
  protected Energy energy = new Energy();
  protected Intelligence smarts = new Intelligence();
 
  public abstract String makeNoise();
  public abstract void increaseAge();
  
  public int getAge(){
    return this.age;
  }//end getAge

  public String getName(){
    return this.name;
  }//end getName

  public void setName(String name){
    this.name = name;
  }//end setName

  public void getIntelligence(){
    this.smarts.showStatus();
  }//end getIntelligence

  public void decreaseIntelligence(){
    this.smarts.decreaseStatus();
  }//end decreaseIntelligence

  public void increaseIntelligence(){
    this.smarts.increaseStatus();
  }//end increaseIntelligence

  public void getHappiness(){
    this.happy.showStatus();
  }//end getHappiness

  public void decreaseHappiness(){
    this.happy.decreaseStatus();
  }//end decreaseHappiness

  public void increaseHappiness(){
    this.happy.increaseStatus();
  }//end increaseHappiness

  public void getHunger(){
    this.hunger.showStatus();
  }//end getHunger

  public void decreaseHunger(){
    this.hunger.decreaseStatus();
  }//end decreaseHunger

  public void increaseHunger(){
    this.hunger.increaseStatus();
  }//end increaseHunger

  public void getEnergy(){
    this.energy.showStatus();
  }//get Energy

  public void decreaseEnergy(){
    this.energy.decreaseStatus();
  }//end decreaseEnergy

  public void increaseEnergy(){
    this.energy.increaseStatus();
  }//end increaseEnergy

}//end class def
