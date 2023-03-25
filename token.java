import java.util.*;

public class token
{
	public static void main(String[] args) {
		
String sentence = "ITI develope people and ITI develope people and ITI develope people";
String word = "ITI";

StringTokenizer tokenizer = new StringTokenizer(sentence, word);
int count = tokenizer.countTokens() - 1;

System.out.println( word + "' in the sentence: " + count);
    }
}
