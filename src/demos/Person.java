package demos;
/** A class to store information about a Person
 *  Used in module 4 of the UC San Diego MOOC Object Oriented Programming in Java
 *
 * @author Ali AbdelAziz
 * Date: Nov. 8, 2021
 */
public class Person 
{
	private String name; 
	
	public Person(String name)  
	{ 
		this.name = name; 
	}
	
	public boolean isAsleep(int hr)  
	{ 
		return 22 < hr || 7 > hr; 
	}
	  
	public String toString()      
	{ 
		return name; 
	}

	public void status( int hr )
	{
		if ( this.isAsleep( hr ) )
			System.out.println( "Now offline: " + this );
	    else
	    	System.out.println( "Now online: " + this );
	 }
	
}
