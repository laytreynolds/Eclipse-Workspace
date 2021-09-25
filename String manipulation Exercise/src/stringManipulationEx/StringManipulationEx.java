package stringManipulationEx;

public class StringManipulationEx {

	public static void main(String[] args) {

//		 concatenate and upper case string
		
		String str3 = "today it is sunny";
		String str4 = "yesterday it was raining";
		String concat = (str3.toUpperCase() + ", " + str4.toUpperCase());

		System.out.println(concat);
		
//		Substring to replace last word of string
		
		 String str1 = "yesterday it was raining";
		 String str2 = "today it is sunny";

		 String subString1 = str2.substring(0, 11);
		 String SubString2 = str1.substring(16, 24);
		 System.out.println(subString1 + SubString2);

		
		
//		Print out each word in a string on new line
		
		String word = "How are you doing";
		
		System.out.println(word.substring(0, 3));
		System.out.println(word.substring(4, 7));
		System.out.println(word.substring(8, 11));
		System.out.println(word.substring(12, 17));
		
		secondMethod("Hello my name is Layton");
		fourthMethod("hey how are you", "you");
		
	}
	
//	Print out each word in a string on new line

	public static void secondMethod(String input) {

		int space = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.substring(i, i + 1).contentEquals(" ") || i == (input.length() - 1)) {
				System.out.println(input.substring(space, i + 1));
				space = i + 1;
			}

		}
	}
		public static boolean fourthMethod(String message, String find) {

		boolean myBool = false;
		int range = message.length()-find.length();

		for (int j = 0; j < range; j++) {

			if (message.substring(j+1, j + find.length()+1).equals(find) ||
					message.substring(j, j + find.length()).equals(find)) {
				myBool = true;
			}

		}

		System.out.println("Substring present? " + myBool);
		return myBool;

	}
	
	

}
