package algorithms;

import java.util.Map;
import java.util.Scanner;

public class StringUtil {

    /*
    find the most frequent character and the number of times it appears in a string
     */
    public static void main(String args[]){
        //1. Get the string
        System.out.println("Enter a string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        //2. Create a HashMap to store the frequency of each character
        Map<Character,Integer> count = new java.util.HashMap<>();
        char mostFrequentCharacter = ' ';
        int maxFrequency = 0;
        //3. Count the frequency of each character in the string
        for(char ch : input.toCharArray()){
            count.put(ch, count.getOrDefault(ch,0)+1);
        }
        //4. find the most frequent character and the number of times it appears
        for(char ch : count.keySet()){
            if(count.get(ch) > maxFrequency){
                mostFrequentCharacter = ch;
                maxFrequency = count.get(ch);
            }
        }
        System.out.println("The most frequent character is " + mostFrequentCharacter + " and it appears " + maxFrequency + " times.");
    }
}
