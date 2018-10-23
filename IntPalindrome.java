/* Check whether a given integer is a palindrome or not
An integer is a palindrome when it reads the same backward as forward.
'E'
Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it reads 121-

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

class IntPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int[]digits= new int[10];
        int dig=x;
        int i=0;
        while(x >= 10){
            dig=x%10;
            digits[i++]=dig;
            x=x/10;
        }
        digits[i]=x;
        int j=0;
        boolean isPal=true;
        while(j < i)
        {
            if(digits[j++] == digits[i--])
                continue;
            else
            {
                isPal=false;
                break;
            }
        }
        return isPal;
    }
}