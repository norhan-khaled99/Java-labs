import java.util.*;

public class countword_2
{
	public static void main(String[] args) {
		String sentence = "ITI develope people and ITI develope people and ITI develope people";
String word = "ITI";

int count = (sentence.length() - sentence.replaceAll(word, "").length()) / word.length();

System.out.println(word + "' in the sentence: " + count);
    }
}    