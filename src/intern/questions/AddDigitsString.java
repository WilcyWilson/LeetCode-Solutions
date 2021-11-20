// 123hell4wq 52
// Output: 
// 6
// 4
// 7
//Adding digits in a string


package intern.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddDigitsString {

    //Do not edit the main function 
    public static void main(String[] args) {
        
        String input;
        int output[];

        try (//Get the input
		Scanner scanner = new Scanner(System.in)) {
			input = scanner.nextLine();
		}
        //Print output returned from the logic function
        output = logic(input);
        for (int i = 0; i < output.length; i++)
        {
            System.out.println(output[i]);
        }
    }


    //The function accepts String as parameter.
    //The function returns int array.
    public static int[] logic(String input){
        //Write your code here
        //You can create other functions and call from here
        //Don't print anything. Just return the intended output
        //In order for the program to work properly you'll have to assign the output array to the output parameter.
        int add = 0;
		List<Integer> list = new ArrayList<Integer>();
		char ch[] = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			while (Character.isDigit(ch[i])) {
				add += Character.getNumericValue(ch[i]);
				if(ch.length == i+1) {
					list.add(add);
					break;
				}
				if (!Character.isDigit(ch[i + 1])) {
					list.add(add);
					add = 0;
					break;
				}
				i += 1;
			}
			if (!Character.isDigit(ch[i])) {
				continue;
			}
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			arr[i] = list.get(i);
		return arr;
    }
}