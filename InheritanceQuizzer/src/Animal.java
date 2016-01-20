
public class Animal implements Pet {
    protected String name;
	public Animal (String n) {
	   name = n;
    }
    public String move() {
    	return name + " walks across house";
    }
    public String begForFood() {
    	return name + " begs for Food";
    }
    public String feed() {
    	return name + " eats food";
    }
}
