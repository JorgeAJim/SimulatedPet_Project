//Attribute.java

import java.io.*;
import java.util.*;

public abstract class Attribute implements Serializable{
  protected int high = 3;
  protected int medium = 2;
  protected int low = 1;
  protected int status = 0;

  public abstract void showStatus();
  public abstract void increaseStatus();
  public abstract void decreaseStatus();


}//end class def
