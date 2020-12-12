package ru.agk13145.learning.task.leetcode;

public class AddBinary {
    /**
     * sum two binary strings
     * @param a first binary string
     * @param b second binary string
     * @return sum a and b as binary string
     */
    public String addBinary(String a, String b) {

        int n = a.length() - b.length();

        char[] ca;
        char[] cb;

        if (n >= 0) {
            ca = a.toCharArray();
            cb = b.toCharArray();
        } else {
            cb = a.toCharArray();
            ca = b.toCharArray();
            n = 0 - n;
        }

        StringBuffer s = new StringBuffer();
        char mind = '0';

        for (int i = cb.length - 1; i >= 0 ; i--) {
            switch(ca[i + n] + cb[i]+ mind){
                case 144: // 0 0 0
                    s.append("0");
                    mind = '0';
                    break;
                case 145: // 0 0 1
                    s.append("1");
                    mind = '0';
                    break;
                case 146: // 0 1 1
                    s.append("0");
                    mind = '1';
                    break;
                case 147: // 1 1 1
                    s.append("1");
                    mind = '1';
                    break;
            }
        }

        for (int i = ca.length - cb.length - 1; i >= 0; i--) {
            switch(ca[i] + mind) {
                case 96: // 0 0
                    s.append("0");
                    mind = '0';
                    break;
                case 97: // 0 1
                    s.append("1");
                    mind = '0';
                    break;
                case 98: // 1 1
                    s.append("0");
                    mind = '1';
                    break;
            }
        }

        if (mind == 49) {
            s.append(mind);
        }

        return s.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("100", "110010")); // 110110
        System.out.println(addBinary.addBinary("1101001", "100101")); // 10001110
    }
}
