package fixcode1;
/**
 * A simple model for a person with a name.
 * 
 * @author Theeruth Borisuth
 */
//TODO Complete the missing Javadoc.
//TODO Fix bad Javadoc tags and poorly written Javadoc.
//TODO Make sure methods have @param and @return tags (if they return something)
//TODO Remove all the "TODO" comments after you do them.
//TODO Fix coding errors.
public class Person {
	/** the person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object.
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/*
	 * Get the person's name.
	 */
	public String getName() {
		return name;
	}
	/*
	 * Set or change the person's name.
	 */
	public void setname(String newname) {
		this.name = newname;
	}
	
	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object object) {
		//TODO After running the test program (Main), fix this method.
		//TODO Use the 4-step template for equals in the Fundamental Methods handout.
		if (object == null) return false ;
		if(this == object) return true ;
		if(this.getClass()!= object.getClass()) return false;
		Person other = (Person) object;
		return name.equals( other.getName() );
	}
	
	/**
	 * Get a string representation of this Person.
	 */
	public String getname()
	{
		return name ;
	}
	public String toString() {
		return "Person " + name;
	}
}
