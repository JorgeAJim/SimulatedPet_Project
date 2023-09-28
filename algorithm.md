Jorge Jimenez
CSCI24000 - Andrew Harris
3/39/2022
Project A8 - The Perfect Pet

Goal: Use abstraction to create an abstract attribute and abstract pet class. These classes should be used to create specific attributes and a specific pet thatthe user will be allowed to interact with. All current pet attibute values must also be saved with serialization, so that they remain the same when the pet is reloaded.

Input: The user will have different inputs on how they will interact with the specific pet, by using several menus.

Ouputs: The attribute of the pets should change dependign on how the user interacts with the pet.

Steps:

  Abstract Attribute Class:
    Goal: To hold the abstract methods that the more "specific attributes" will flesh out. This abstract class will hold the prejudice that all attribute classes will have a high, medium, and low attributes that will update
          the overall status of the attributes. All attributes (high, medium, low, and status) should be integers.
    
    Abstract Methods:
      increaseStatus = not all increases in status will be the same
      decreaseStatus = not all decreases in status will be the same
      showStatus = the status level will not mean the same thing for each different attribute


  Happiness Class:
    Goal: To inherit the Abstract Attribute Class, and have it so that the overall status value will fall into a specific range which will result in high, medium, or low overall happiness. And, getting the status value for
          this attribute should print its own custome message relating to pet happiness.
    Input: the user will be allowed to user methods to increase or decrease the "status" value in relation to the high, medium, and low settings.
    Output: the program will return the corresponding value of "status" and what it means for the specific attribute.

    increaseStatus method:
      Goal: to take the "status" integer attribute and then increase it by one.
      Input: not user input
      Output: the "status" attribute will be increased and a personalize message on how the animal got happier will be displayed onto the command lin.
    
    decreaseStatus method:
      Goal: to decrease "status" by one. However, "status" can not fall below zero.
      Input: no user input
      Output: the "status" attribute will decrease by one and a personalize message on how your pet lost happiness will be given

    showStatus method:
      Goal: to decide what level the "status" attribute and deliver a personalize message.
      Input: no user input
      Output: "status" will be compared to the high, medium, and low attributes and then an appropiate message relating to the status of the pet happiness


  Energy Class: 
    Goal: to allow the user to alter the "status" attribute that was inherited from the abstract Attribute class by using methods.
    
    increaseStatus method:
      Goal: to set the energy of the pet to high after a long nap
      Input: no user input
      Output: "status" will be updated to the same value as the high attribute

    decreaseStatus method:
      Goal: to decrease the energy of the pet, but also prevent it from ever going below zero.
      Input: no user input
      Output: "status" will be updated with a personal message

    showStatus method:
      All showStatus methods are the same


  Intelligence Class:
    Goal: to alter the inherited "status" attribute using methods.
    
    All methods work the same as in the Happiness class.

  Hunger Class:
    Goal: to alter the inherited "status" attribute using mehtods.
    
    All methods work the smae as the Energy class, but with messages relating to how the pet lost and gained energy.


  Abstract Pet Class:
    Goal: To hold the abstract methods that the more "specific pets" will flesh out. Also, to hold instances of all "specific attributes" and how the user will increase and decrease the overall status value of those attributes. This class will also have hold a name and age attribute all "specific pets" can inherit and alter in their own ways.

    getHappiness method:
      Call the showStatus method from the Happiness instance
    increaseHappiness method:
      Call the increaseStatus method from the Happiness instance
    decreaseHappiness method:
      Call the decreaseStatus method from teh Happiness instance

    getEnergy/increaseEnergy/decreaseEnergy = all call the corresponding methods from the Energy instance
    getIntelligence/increaseIntelligence/decreaseIntelligence = all call the corresponding methods from the Intelligence instance
    getHunger/increaseHunger/decreaseHunger = all call the corresponding methods.

    getName method:
      will return the current value of the name attribute

    getAge method:
      will return the current value of the age attribute

    setName:
      Input: user will input a string name that will be given to the pet

    Abstract methods:
      makeNoise = not all animals make the same noise
      increaseAge = not all animals age the same

  Cat Class:
    Goal: to inherit the abstract Pet class and flesh out the abstract methods

    makeNoise method:
      Return a "meow"

    increaseAge method:
      Cats are very weirdly. The first year is worth 15 human years, the second year is equal to 9 human years, and every year pass year 3 is about 4 human years.
      A currentAge counter will be needed, better if it is made an attribute of the entire Cat class since it can not be defined within the increaseAge method. 
      In the increaseAge method, the currentAge attribute will be increased by one. Depending on what the currentAge is then the age attribute inherited from the Pet class will be added the appropitate aproximation to human years. So if currentAge is 1, then 15 years is added to the age attribute. All Cat instances will have to start with an age of zero.

  
  Main Class:
    Goal: to create a Cat instance that the user can interact with by using a menu that list all the options the user can do.
    Input: the user will select from the menu
    Output: the appropriate Cat instance methods will be called to fulfil all possible interactions with the cat

    Steps:
      At the start of the file, a null Cat instance will be made. This null Cat instance will be given the values from inside the pet.txt file where the object and all its attributes are stored.
         If there is not Cat instance inside the pet.txt file, then the null Cat instance will use the Cat constructor to create a full Cat instance.
      The choice made by user in the menu will be delivered to the main program and it will be read by an if-else statement to decide which choice was selected.
         This will occur withing a while keepGoing loop that will allow to user to continuously interact with the pet.
      When the user decides to stop interacting with the Cat, then the Cat instance is saved to the pet.txt file where all the changes made will be saved and loaded next time the program runs.
