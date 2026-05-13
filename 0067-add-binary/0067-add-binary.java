class Solution {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        int startStr = a.length() - 1;
        int lastStr = b.length() - 1;
        int carry = 0;

        while(startStr >= 0 || lastStr >= 0 || carry != 0) {
            int sum = carry;

            if(startStr >= 0) {
                sum += a.charAt(startStr--) - '0';
            }

            if(lastStr >= 0) {
                sum += b.charAt(lastStr--) - '0';
            }

            builder.append(sum % 2);
            carry = sum / 2;
        }

        return builder.reverse().toString();
    }
}

/* 11 + 1 =  100
    1010
    1011
    10101
 */