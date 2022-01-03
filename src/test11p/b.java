package test11p;
import java.util.Scanner;
import java.util.ArrayList;
public class b {

	 public static void main(String[] args) {
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    
		    int number1 = (int) (Math.random() * 10);
		    int number2 = (int) (Math.random() * 10);

		    Scanner input = new Scanner(System.in);
		    System.out.print("What is " + number1 + " + " + number2 + "? ");
		    int answer = input.nextInt();
		    list.add(answer);
		      
		    while (number1 + number2 != answer) {
		      System.out.print("Wrong. Try again. What is " + number1 + " + " + number2 + "? ");
		      answer = input.nextInt();
		      
		      if (list.contains(answer)) {
		    	  System.out.println("You already entered " + answer);
		      }
		      else {
		    	  list.add(answer);
		      }
		    }
		    
		    System.out.println("You got it!");
	}

}
