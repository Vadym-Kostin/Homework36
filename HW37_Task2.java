class Task2 // Class declaration
{
	public static void main (String[] args) throws java.lang.Exception // Method declaration
	{
	double n = 8.5; // Assigning a value
        double m = 11.45; // Assigning a value
        int x = 10; // Assigning a value
        double y = Math.abs(x - n); // 1.5
        double z = Math.abs(x - m); // 1.45
        if (y==z){ // setting a condition
            System.out.println("n and m are equidistant from x"); // line output
        }
        if(y>z){ // setting a condition
            System.out.println("number m is closer to x"); // line output
        }
        if (y<z) { // setting a condition
            System.out.println("number n is closer to x"); // line output
        }
	} // end of the method Main
} // end of the class "Task2"