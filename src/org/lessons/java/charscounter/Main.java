package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una parola");
		String word = in.nextLine().toLowerCase();
		
		in.close();
		
		Map<Character, Integer> letterCount = new HashMap<>();
		
		for(char c: word.toCharArray()) {
			letterCount.put(c, letterCount.getOrDefault(c, 0) +1);
		}
		
		
		System.out.println("Conteggio dei caratteri:");
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " volte");
        }
	}

}
