package numberplateCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
	
	private Map<Character, Integer> map = new HashMap<>();
	private List<Character> letters = new ArrayList<>();
	private String numberPlate;
	
	public Calculator(String numberPlate) {
		super();
		this.numberPlate = numberPlate;
	}
	
	public void initialiseList() {
		char a;
		for (a = 'A'; a <= 'Z'; a++) {
			letters.add(a);
			}
	}
	
	public void initialiseMap() {
		initialiseList();
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
	}
	
	public int calculate() {
		initialiseMap();
		int total = 0;
		int value = 0;
		char array[] = this.numberPlate.toCharArray();
		for (Character j : array) {
			if (map.containsKey(j)) {
				total += map.get(j);
			} else {
				total += Character.getNumericValue(j);
			}
		}
		if (total >= 10) {
			String version = Integer.toString(total);
			char number[] = version.toCharArray();
			value = Character.getNumericValue(number[0]) + Character.getNumericValue(number[1]);
		}
		return value;
	}
}
