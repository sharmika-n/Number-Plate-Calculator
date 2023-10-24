package numberplateCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Random {

	public static void main(String[] args) {
	   List<Character> letters = new ArrayList<Character>();
	   char a;
	   for (a = 'A'; a <= 'Z'; a++) {
		   letters.add(a);
	   }
	   System.out.println(letters);
	   
	   Map<Character, Integer> map = new HashMap<>();
		for (Character i : letters) {	
			if (i == 'A' || i == 'I' || i == 'J' || i == 'Q' || i == 'Y') {
				map.put(i, 1);
			} else if(i == 'B' || i == 'K' || i == 'R') {
				map.put(i, 2);
			} else if(i == 'C' || i == 'G' || i == 'L' || i == 'S') {
				map.put(i, 3);
			} else if(i == 'D' || i == 'M' || i == 'T') {
				map.put(i, 4);
			} else if(i == 'E' || i == 'H' || i == 'N' || i == 'X') {
				map.put(i, 5);
			} else if(i == 'U' || i == 'V' || i == 'W') {
				map.put(i, 6);
			} else if(i == 'O' || i == 'Z') {
				map.put(i, 7);
			} else if(i == 'F' || i == 'P') {
				map.put(i, 8);
			}
		}
		
		for (Character i : map.keySet()) {
			  System.out.println("key: " + i + " value: " + map.get(i));
			}
		
		int total = 0;
		String check = "Y418AOF";
		char array[] = check.toCharArray();
		for (Character j : array) {
			if (map.containsKey(j)) {
				total += map.get(j);
			} else {
				total += Character.getNumericValue(j);
			}
		}
		System.out.println(total);
		
		int value = 0;
		if (total >= 10) {
			String version = Integer.toString(total);
			char number[] = version.toCharArray();
			value = Character.getNumericValue(number[0]) + Character.getNumericValue(number[1]);
		}
		System.out.println(value);
	  }

	
}
