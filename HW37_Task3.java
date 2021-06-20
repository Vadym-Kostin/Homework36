class Task3
{
	public static void main (String[] args) throws java.lang.Exception // Method declaration
	{
    int n = (int)(Math.random()*900+100),a,b,c; // Method random, assigning values
    a = n/100;
    b = (n%100)/10;
    c = n%10;
    if(a>=b&&a>=c) { // setting a condition
      System.out.println("in number n the largest digit a"); // line output
    } else if(b>=a&&b>=c) { // setting a condition
      System.out.println("in number n the largest digit b"); // line output
    } else { // setting a condition
      System.out.println("in number n the largest digit c"); // line output
    		}
	} // end of the method Main
} // end of the class "Task3"