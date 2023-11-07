package Leetcode;

public class RomanToInt {
	public int romanToInt (String s) {
		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char currentChar = s.charAt(i);
			int currentVal = getValue(currentChar);

			if (currentVal < prevValue) {
				result -= currentVal;
			} else {
				result += currentVal;
			}

			prevValue = currentVal;
		}

		return result;
	}

	private int getValue(char romanChar) {
		switch (romanChar) {
			case 'I' : return 1;
			case 'V' : return 5;
			case 'X' : return 10;
			case 'L' : return 50;
			case 'C' : return 100;
			case 'D' : return 500;
			case 'M' : return 1000;
			default: return 0;
		}
	}

	public static void main(String[] args) {
		RomanToInt romanToInt = new RomanToInt();
		int num = romanToInt.romanToInt("LXXVI");
		System.out.println(num);
	}
}
