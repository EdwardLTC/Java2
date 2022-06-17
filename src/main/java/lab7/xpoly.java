package lab7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class xpoly {
    public static boolean isCardNumber(String number) {
        String[] n = number.split(" ");
        int tong = 0;
        boolean check;

        for (String n1 : n) {
            if (!n1.isBlank()) {
                tong += Integer.parseInt(n1);
            }
        }

        check = tong % 2 == 0;
        return check;
    }

    public static boolean isCardNumberUsingHasMap(String number1, String number2) {
        List<String> myList1 = new ArrayList<String>(Arrays.asList(number1.split("")));
        List<String> myList2 = new ArrayList<String>(Arrays.asList(number2.split("")));
        List<String> myList3 = new ArrayList<String>();
        // Map<String, Long> output = myList.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        
        BigInteger num = new BigInteger(Long.toString(number1)).add(new BigInteger((Long.toString(number2))));
        System.err.println(num);
        
        return true;
    }

    public static void main(String[] args) {
        String n1 = "12345678";
        String n2 = "12345678";

        isCardNumberUsingHasMap(n1,n2);
    }

}
