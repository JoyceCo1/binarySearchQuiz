import java.io.*;
import java.util.*;


public class Quizzer
	{
	static int fill;
	public Quizzer(int f)
		{
		f = fill;
		}
	public static int getInsert()
		{
		return fill;
		}

	public static void setInsert(int insert)
		{
		Quizzer.fill = insert;
		}
	
	public static void main(String[] args) throws IOException
	{
	boolean again = true;
	while(again == true)
		{
	boolean over = false;
	int quizCounter = 0;
	int questionCounter = 0;
	ArrayList quiz = new ArrayList();
	System.out.println("You will now create an array list, to end at any time enter -1");
	boolean end = false;
	while(end == false)
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 20, inclusive.");
		if(input.hasNextInt())
			{
		int fill = input.nextInt();
			if(fill == -1)
				{
				end = true;
				System.out.println("Thank you, this is the finished, sorted Array List");
				Collections.sort(quiz);
				System.out.println(quiz.toString());
				}
			else if((fill >= 1) && (fill <= 20))
				{
				quiz.add(fill);
				}
			else if(fill > 20)
				{
				System.out.println("Only enter numbers between 1 and 20 inclusive");
				}
			}
			
			else
				{
				System.out.println("Only enter ints from 1 to 20 inclusive");
				}
			
	}

	
	Scanner quizInput = new Scanner(System.in);
	int left = 0;
	int right = quiz.size()-1;
	over = false;
	System.out.println("I will randomly select a target number from the array");
	int target = (int) quiz.get((int) (Math.random()*(quiz.size()-1)));
	System.out.println(target);
	while((left<=right) && (over == false))
		{
		int middle = (left + right)/2;
		System.out.println("Please enter the left bound index");
		questionCounter++;
		int leftBound = quizInput.nextInt();
		if(leftBound == left)
			{
			quizCounter++;
			System.out.println("Correct");
			}
		System.out.println("Please enter the right bound index");
		questionCounter++;
		int rightBound = quizInput.nextInt();
		if(rightBound == right)
			{
			quizCounter++;
			System.out.println("Correct");
			}
		System.out.println("Please enter the middle index");
		questionCounter++;
		int middleIndex = quizInput.nextInt();
		if(middleIndex == middle)
			{
			quizCounter++;
			System.out.println("Correct");
			}
		System.out.println("Please enter the middle value");
		questionCounter++;
		int middleValue = quizInput.nextInt();
		if(middleValue == (int)quiz.get(middle))
			{
			quizCounter++;
			System.out.println("Correct");
			}
		if((int)target < (int)quiz.get(middle));
			{
			right = middle-1;
			}
		if((int) target > (int)quiz.get(middle))
			{
			left = middle + 1;	
			}
		
		if((int) target == (int)quiz.get(middle)) 
			{
			over = true;
			System.out.println("The program has finished finding the target of " + target);
			System.out.println("You scored a " + quizCounter + " out of " + questionCounter);
			System.out.println("Would you like to go again? Y or N");
			String againString = quizInput.next();
			if(againString.equals("Y"));
				{
				quizCounter = 0;
				questionCounter = 0;
				}
			if(againString.equals("N"))
				{
				System.out.println("Goodbye");
				again = false;
				}
			}
			}
		}
	}
}

	

