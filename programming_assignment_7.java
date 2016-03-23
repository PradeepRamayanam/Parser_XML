import java.util.Scanner;

public class programming_assignment_7
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(programming_assignment_7.class.getResourceAsStream("Data_input"));
      //String fileContents = " ";
		
	while(input.hasNextLine())
		{
		String line = input.nextLine();
		//String s = input.nextLine();
		
		if(line.contains("<"))
		{
			line = line.replaceAll("<", "");
			line = line.replaceAll(">", "->");
			 String[] run = line.split("/");
			 
			 line= run[0];
		}
	
	//	String s1 = input.nextLine();
		
		
		System.out.println(line);
		}
	}
}
