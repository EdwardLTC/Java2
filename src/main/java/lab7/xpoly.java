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

    public static boolean isCardNumberUsingHasMap(String number) {
        
        String[] s = number.split("");
        List<String> myList = Arrays.asList(s);
        
        Map<String, Long> output = myList.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        int tong = 0;
        boolean check;
        for (Map.Entry<String, Long> entry : output.entrySet()) {
            String key = entry.getKey();
            long value = entry.getValue();
            if(key.isBlank())
                continue;
            tong += Integer.parseInt(key) * value;   
        }
        System.out.println(tong);

        check = tong % 2 == 0;
        return check;
    }

}
