import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		Quiz.addNum();
		Quiz.askQuestions();
//		ArrayList<Integer> quiz = new ArrayList<Integer>();
//		Scanner input = new Scanner(System.in);
//		int score = 0;
//	    Animal a = new Animal("animal");
//	    Animal b = new Dog("alpha");
//	    Dog d = new Dog("dog");
//	    Cat c = new Cat("cat");
//	    
//	    
//	    //1
//	    System.out.println("What will a.move() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. animal walks across the house");
//	    System.out.println("	c. animal enters house");
//	    System.out.println("	d. animal jumps onto the table");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct + Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //2
//	    System.out.println("What will b.move() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. alpha walks across the house");
//	    System.out.println("	c. alpha enters house");
//	    System.out.println("	d. alpha jumps onto the table");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //3
//	    System.out.println("What will d.move() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. dog walks across the house");
//	    System.out.println("	c. dog enters house");
//	    System.out.println("	d. dog jumps onto the table");
//	    if(input.nextLine().equals("c")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: c. Score: " + score);
//	    }
//	    
//	    //4
//	    System.out.println("What will c.move() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. cat walks across the house");
//	    System.out.println("	c. cat enters house");
//	    System.out.println("	d. cat jumps onto the table");
//	    if(input.nextLine().equals("d")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: d. Score: " + score);
//	    }
//	    
//	    //5
//	    System.out.println("What will a.feed() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. animal eats food");
//	    System.out.println("	c. animal eats bone");
//	    System.out.println("	d. animal drinks milk");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //6
//	    System.out.println("What will b.feed() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. alpha eats food");
//	    System.out.println("	c. alpha eats bone");
//	    System.out.println("	d. alpha drinks milk");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    //7 
//	    System.out.println("What will d.feed() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. dog eats food");
//	    System.out.println("	c. dog eats bone");
//	    System.out.println("	d. dog drinks milk");
//	    if(input.nextLine().equals("c")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: c. Score: " + score);
//	    }
//	    
//	    //8
//	    System.out.println("What will c.feed() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. cat eats food");
//	    System.out.println("	c. cat eats bone");
//	    System.out.println("	d. cat drinks milk");
//	    if(input.nextLine().equals("d")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: d. Score: " + score);
//	    }
//	    
//	    //9 
//	    System.out.println("What will a.begForFood() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. animal begs for food");
//	    System.out.println("	c. animal eats bone");
//	    System.out.println("	d. animal drinks milk");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //10
//	    System.out.println("What will b.begForFood() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. alpha begs for food");
//	    System.out.println("	c. alpha eats bone");
//	    System.out.println("	d. alpha drinks milk");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //11
//	    System.out.println("What will d.begForFood() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. dog begs for food");
//	    System.out.println("	c. dog eats bone");
//	    System.out.println("	d. dog drinks milk");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //12
//	    System.out.println("What will c.begForFood() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. cat begs for food");
//	    System.out.println("	c. cat eats bone");
//	    System.out.println("	d. cat drinks milk");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //13
//	    System.out.println("What will a.bark() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. animal begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. animal eats bone");
//	    if(input.nextLine().equals("a")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: a. Score: " + score);
//	    }
//	    
//	    //14
//	    System.out.println("What will ((Dog)b).bark() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. alpha begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. alpha eats bone");
//	    if(input.nextLine().equals("c")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: c. Score: " + score);
//	    }
//	    
//	    //15
//	    System.out.println("What will d.bark() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. dog begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. dog eats bone");
//	    if(input.nextLine().equals("c")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: c. Score: " + score);
//	    }
//	    
//	    //16
//	    System.out.println("What will c.bark() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. cat begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. cat eats bone");
//	    if(input.nextLine().equals("a")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: a. Score: " + score);
//	    }
//	    
//	    //17
//	    System.out.println("What will d.whimp() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. dog begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. dog whines");
//	    if(input.nextLine().equals("c")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: c. Score: " + score);
//	    }
//	    
//	    //18
//	    System.out.println("What will c.meow() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. cat begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. meow");
//	    if(input.nextLine().equals("d")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: d. Score: " + score);
//	    }
//	    
//	    //19
//	    System.out.println("What will c.purr() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. cat begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. meow");
//	    if(input.nextLine().equals("b")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: b. Score: " + score);
//	    }
//	    
//	    //20
//	    System.out.println("What will a.purr() return?");
//	    System.out.println("	a. Will not run");
//	    System.out.println("	b. animal begs for food");
//	    System.out.println("	c. woof");
//	    System.out.println("	d. meow");
//	    if(input.nextLine().equals("a")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: a. Score: " + score);
//	    }
//	    
//	    //21
//	    System.out.println("\n((Dog)c.bark();");
//	    System.out.println("Will this run?	enter 't' for true & 'f' for false");
//	    if(input.nextLine().equals("f")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: false. Score: " + score);
//	    }
//	    
//	    //22
//	    System.out.println("\nCat c = new Animal();");
//	    System.out.println("Will this run?	enter 't' for true & 'f' for false");
//	    if(input.nextLine().equals("f")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: false. Score: " + score);
//	    }
//	    
//	    //23
//	    System.out.println("\nDog d = new Cat();");
//	    System.out.println("Will this run?	enter 't' for true & 'f' for false");
//	    if(input.nextLine().equals("f")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: false. Score: " + score);
//	    }
//	    
//	    //24
//	    System.out.println("\nAnimal j = new Cat(\"Jaguar\");");
//	    System.out.println("After j is casted into type Cat, what methods does j have access to?");
//	    System.out.println("	a. animal methods only");
//	    System.out.println("	b. cat methods only");
//	    System.out.println("	c. animal and cat methods");
//	    System.out.println("	d. j cannot be casted as type Cat");
//	    if(input.nextLine().equals("c")) {
//	    	score++;
////	    	input.next();
//	    	System.out.println("Correct.   Score: " + score);
//	    } else {
//	    	System.out.println("Incorrect.   Correct Ans: c. Score: " + score);
//	    }
	}
	

}
