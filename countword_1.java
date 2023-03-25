import java.util.*;

public class countword_1
{
	public static void main(String[] args) {
		
String sentence = "ITI develope people and ITI develope people and ITI develope people";
String word = "ITI";

int count = 0;
int index = sentence.indexOf(word);
while (index != -1) {
    count++;
    index = sentence.indexOf(word, index + word.length());
}

System.out.println( word + "' in the sentence : " + count);
    }
}