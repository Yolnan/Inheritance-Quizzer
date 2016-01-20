
public class Cat extends Animal {
   public Cat(String n) {
	   super(n);
	   name = n;
   }
   public String move() {
	   return name + " jumps onto the table";
   }
   public String meow() {
	   return "meow";
   }
   public void pur() {
	   super.begForFood();
	   //"purr";
   }
   public String feed() {
	   return name + " drinks milk";
   }
}
