import java.util.Arrays;

public class AnagramCheck {

	public void anagram(String str1, String str2) {
		if(str1.length()!=str2.length())
		{
			System.out.println("Anagram check is NOT a match");
		}
		else
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean match = false;
			match = Arrays.equals(ch1, ch2);

			if(match) 
				System.out.println("Anagram check IS a match");

			else
				System.out.println("Anagram check is NOT a match");


		}

	}

	public static void main(String[] args) {

		AnagramCheck obj = new AnagramCheck();

		obj.anagram("caty","act");

	}

}
