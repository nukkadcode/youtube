/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		new Codechef().dogStore();
		
	}
	
	public void dogStore() {
	    Dog[] dogs = {new Dog(), new Dog()};
	    purchaseDog(dogs);
	        
	}
	
    public void purchaseDog(Animal[] animal) {
        animal[0] = new Cat();
    }
}

class Animal {}

class Cat extends Animal {
    
}

class Dog extends Animal {
    
}

