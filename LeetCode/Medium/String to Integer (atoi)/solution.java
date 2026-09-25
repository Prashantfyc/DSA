class Solution {
    public int myAtoi(String s) {

        int i = 0;

        // 1. Skip spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Sign
        int sign = 1;

        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } 
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        // 3. Build number
        int num = 0;

        while (i < s.length() &&
               s.charAt(i) >= '0' &&
               s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            // 4. Overflow check
            if (num > (Integer.MAX_VALUE - digit) / 10) {

                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }

            num = num * 10 + digit;

            i++;
        }

        return num * sign;
    }
}