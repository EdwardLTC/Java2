package lab7;

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
}
