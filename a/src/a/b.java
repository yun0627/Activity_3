package a;
import java.util.Scanner;
public class b {

	public static void main(String[] args) {
		
		String input;
		int output;
while (true) {		
System.out.println("Type in a message and press enter: ");

Scanner userinput = new Scanner(System.in);

input = userinput.nextLine();


System.out.println("\nOutput types:"
		+"\n\t0: As is"
		+"\n\t1: Trimmed"
		+"\n\t2: lower case"
		+"\n\t3: UPPER CASE"
		+"\n\t4: v_w_ls r_pl_c_d"
		+"\n\t5: Without first and last character"
		+"\nEnter your choice: ");

output = userinput.nextInt();
output++;

switch (output) {
case 1: 
	System.out.println(input);
	break;
case 2:
	input = input.trim();
	System.out.println(input);
	break;
case 3:
	input = input.toLowerCase();
	System.out.println(input);
	break;
case 4:
	input = input.toUpperCase();
	System.out.println(input);
	break;
case 5:
	input = input.replace('a', '_');
	input = input.replace('e', '_');
	input = input.replace('i', '_');
	input = input.replace('o', '_');
	input = input.replace('u', '_');
	System.out.println(input);
	break;
case 6:
	input = input.substring(1, input.length()-1);
	
	System.out.println(input);
	break;
default: 
	System.out.println("Error: Invalid choice input.");
break; 

}
}
}
}