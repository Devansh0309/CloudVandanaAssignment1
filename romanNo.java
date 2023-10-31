import java.util.HashMap;
import java.util.Scanner;

public class romanNo {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
		String s=myObj.nextLine(); 
        int integerEquivalent = romanToInt(s);
        System.out.println(s + " = " + integerEquivalent);
    }
}
