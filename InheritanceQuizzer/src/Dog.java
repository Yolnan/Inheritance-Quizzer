
public class Dog extends Animal {
   public Dog(String n) {
	   super(n);
	   name = n;
   }
   public String move() {
	   return name + " enters house";
   }
   public String bark() {
	   return  "woof";
   }
   public String whimp() {
	   return bark();
   }
   public String feed() {
	   return name + " eats bone";
   }
}
