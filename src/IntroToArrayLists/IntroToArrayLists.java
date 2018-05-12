package IntroToArrayLists;
import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList <String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("word");
		strings.add("term");
		strings.add("expression");
		strings.add("name");
		strings.add("number");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
			
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for (String e : strings) {
			System.out.println(e);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i+=2) {
			System.out.println(strings.get(i));
		} 
		System.out.println();
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			System.out.println(strings.get(i));
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (String e : strings) {
			if (e.contains("e")) {
				System.out.println(e);
			}
		}
	}
}
