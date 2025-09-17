//NAME : APOTIADE JOSEPH
//MATRIC_NO : IFT/22/9201

import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (char c : freqMap.keySet()) {
            System.out.println("'" + c + "': " + freqMap.get(c));
        }
    }
}
