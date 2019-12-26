/* Problem Description:: 

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Try out case for 999
*/

class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int[] fin = new int[digits.length + 1]; 
        while(i>-1){
            digits[i] = digits[i] + 1;
            fin[i] = digits[i];
            if(digits[i] == 10){
                if(i!=0){
                    digits[i] = 0;
                    fin[i] = 0;
                    i--;
                }else{
                    fin[i] = 1;
                    return fin;    
                }
            }
            else{
                break;
            }
        }
        
        return digits;
    }
}
