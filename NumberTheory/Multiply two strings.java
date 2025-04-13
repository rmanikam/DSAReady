package NumberTheory;

class Solution
{
   public String multiplyStrings(String s1, String s2) {
    // Handle sign separately
    int sign = 1;
    if (s1.charAt(0) == '-' && s2.charAt(0) != '-')
        sign = -1;
    else if (s1.charAt(0) != '-' && s2.charAt(0) == '-')
        sign = -1;

    // Remove negative signs for simplicity in further calculations
    if (s1.charAt(0) == '-')
        s1 = s1.substring(1);
    if (s2.charAt(0) == '-')
        s2 = s2.substring(1);

    int n = s1.length(), m = s2.length();

    int[] res = new int[n + m]; // Result array to hold intermediate sums
    StringBuilder result = new StringBuilder();

    // Perform multiplication digit by digit
    for (int i = n - 1; i >= 0; i--) {
        int n1 = s1.charAt(i) - '0'; // Extract digit from s1
        int carry = 0;

        for (int j = m - 1; j >= 0; j--) {
            int n2 = s2.charAt(j) - '0'; // Extract digit from s2
            int sum = n1 * n2 + res[i + j + 1] + carry; // Multiply and add existing carry and result

            res[i + j + 1] = sum % 10; // Update result at the current position
            carry = sum / 10; // Calculate carry
        }
        res[i] += carry; // Add remaining carry
    }

    // Skip leading zeros in the result array
    int i = 0;
    while (i < res.length && res[i] == 0)
        i++;

    // Build the result string
    if (sign == -1 && i < res.length) {
        result.append('-');
    }
    for (; i < res.length; i++) {
        result.append(res[i]);
    }

    // Handle the case where the result is 0
    return result.length() == 0 ? "0" : result.toString();
}

}