package cse360assignment02;

public class AddingMachine {
	  private int total;
	  private String history;
	  
	  /**This is a constructor used to create an instance of AddingMachine*/
	  public AddingMachine () {
	    total = 0; 
	    history = "" + total;// not needed - included for clarity
	  }
	  
	  /**This method returns the value of the private variable total*/
	  public int getTotal () {
	    return total;
	  }
	  
	  /**This method adds a value to the total*/
	  public void add (int value) {
		  total += value;
		  history = history + " + " + value;
	  }

	  /**This method subtracts a value to the total*/
	  public void subtract (int value) {
		  total -= value;
		  history = history + " - " + value;
	  }

	  /**This toString method will be called when an instance of 
	     adding machine is printed, returns history*/
	  public String toString () {
	    return history;
	  }

	  /**This clears the total and the history*/
	  public void clear() {
		  total = 0;
		  history = "" + total;
	  }
}