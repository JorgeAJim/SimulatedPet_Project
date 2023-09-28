//main.java

import java.util.*;
import java.io.*;

public class Main{


  public static void main(String[] args){
    new Main();
  }//end main

  public Main(){
    Scanner input = new Scanner(System.in);

    Cat kitty = null;
    try{
      FileInputStream fIn = new FileInputStream("pet.txt");
      ObjectInputStream obIn = new ObjectInputStream(fIn);
      kitty = (Cat)obIn.readObject();
      fIn.close();
      obIn.close();
    } catch (IOException i){
      System.out.println(i.getMessage());
      //System.out.println("First write");
      kitty = new Cat(1);
      try{
        FileOutputStream fOut = new FileOutputStream("pet.txt");
        ObjectOutputStream obOut = new ObjectOutputStream(fOut);
        obOut.writeObject(kitty);
        fOut.close();
        obOut.close();
      } catch (Exception e){
        System.out.println(e.getMessage());
	System.out.println("Couldn't write");
      }//end try
    } catch(ClassNotFoundException c){
      System.out.println(c.getMessage());
      //System.out.println("Second write");
      kitty = new Cat(1);
      try{
        FileOutputStream fileOut = new FileOutputStream("pet.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(kitty);
        fileOut.close();
        objectOut.close();
      } catch(Exception e){
        System.out.println(e.getMessage());
      }//end try
    } catch(Exception e){
      System.out.println(e.getMessage());
    }//end try

    boolean keepGoing = true;
    while(keepGoing){
      String choice = menu();
      if(choice.equals("1")){
        //this may require some exception handeling
        System.out.println("Your cat's old name was: " + kitty.getName());
        System.out.println("Cat's new name: ");
        String name = input.nextLine();
        kitty.setName(name);
        System.out.println("Your cat's name now is " + kitty.getName());
      } else if(choice.equals("2")){
        System.out.println("Another year has passed ... ");
        kitty.increaseAge();
        System.out.println("Your cat is " + kitty.getAge() + " in human years");
      } else if(choice.equals("3")){
        kitty.getIntelligence();
      } else if(choice.equals("4")){
        kitty.increaseIntelligence();
      } else if(choice.equals("5")){
        kitty.decreaseIntelligence();
      } else if(choice.equals("6")){
        kitty.getHappiness();
      } else if(choice.equals("7")){
        kitty.increaseHappiness();
      } else if(choice.equals("8")){
        kitty.decreaseHappiness();
      } else if(choice.equals("9")){
        kitty.getHunger();
      } else if(choice.equals("10")){
        kitty.increaseHunger();
      } else if(choice.equals("11")){
        kitty.decreaseHunger();
      } else if(choice.equals("12")){
        kitty.getEnergy();
      } else if(choice.equals("13")){
        kitty.increaseEnergy();
      } else if(choice.equals("14")){
        kitty.decreaseEnergy();
      } else if(choice.equals("15")){ 
        System.out.println("Wow! " + kitty.getName() + " said " + kitty.makeNoise());
      } else if(choice.equals("0")){
        System.out.println("Goodbye");
        keepGoing = false;

        try{
          FileOutputStream fOut = new FileOutputStream("pet.txt");
          ObjectOutputStream obOut = new ObjectOutputStream(fOut);
          obOut.writeObject(kitty);
          fOut.close();
          obOut.close();
        } catch (Exception e){
          System.out.println(e.getMessage());
        }//end try
      } else {
        System.out.println("Please choose an available option");
      }//end if
    }//end while

  }//end construtor

  public String menu(){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Select and option");
    System.out.println("0) Quit");
    System.out.println("1) Remane cat");
    System.out.println("2) Increase the age of the cat");
    System.out.println("3) Show the Intelligence level of the cat");
    System.out.println("4) Increase the Intelligence level of the cat");
    System.out.println("5) Decrease the Intelligence level of the cat");
    System.out.println("6) Show the Happiness level of the cat");
    System.out.println("7) Increase the Happiness level of the cat");
    System.out.println("8) Decrease the Happiness level of the cat");
    System.out.println("9) Show the Hunger level of the cat");
    System.out.println("10) Increase the Hunger level of the cat");
    System.out.println("11) Decrease the Hunger level of the cat");
    System.out.println("12) Show the Energy level of the cat");
    System.out.println("13) Increase the Energy level of the cat");
    System.out.println("14) Decrease the Energy level of the cat");
    System.out.println("15) Talk to Cat");

    String response = input.nextLine();
    return response;
  }//end menu



}//end class def
