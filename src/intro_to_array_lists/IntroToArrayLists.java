package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> things = new ArrayList<String>();
		//2. Add five Strings to your list
		things.add("person");
		things.add("place");
		things.add("thing");
		things.add("idea");
		things.add("More Things");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < things.size(); i++) {
			System.out.println(things.get(i));
			if (i % 2 == 0) {
				System.out.println(things.get(i));
			}
			if (things.get(i).contains("e")) {
				System.out.println(things.get(i));
			}
		}
		//4. Print all the Strings using a for-each loop
		for (String s: things) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		//6. Print all the Strings in reverse order.
		for (int i = things.size() - 1; i > -1; i--) {
			System.out.println(things.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
