/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/
//Take care of string with trailing space

class LastWordLength {
    public int lengthOfLastWord(String s) {
        int slen = s.length();
        char[] schars = s.toCharArray();
        int maxWlen=0;
        boolean wordbreak=false;
        for(int i = slen-1; i>=0; i--){
            if(wordbreak && schars[i] == ' '){
                break;
            }
            if(schars[i] != ' '){
                wordbreak=true;
            }
            if(wordbreak){
                maxWlen++;
            }
        }
        return maxWlen;
    }
}
