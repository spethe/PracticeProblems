/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

class FirstUniqChar {
    public int firstUniqChar(String s) {
        //Using LHM for insertion order 
        LinkedHashMap<Character,Integer> uniqueCharsOnly = new LinkedHashMap<>();
        int first = -1;
        if(s.length() == 1) return 0;
        for(int i=0 ; i<s.length(); i++){
            Character iChar = (Character) s.charAt(i);
            if(uniqueCharsOnly.containsKey(iChar)){
                //Marking that char as duplicate.
                uniqueCharsOnly.put(iChar, -1);
            }else{
                //Entering letter and index.
                uniqueCharsOnly.put(iChar,i);
            }
        }
        //Get first occurrence of letter which does not have negative index.
        for(Character k:uniqueCharsOnly.keySet()){
            Integer val = uniqueCharsOnly.get(k);
            if( val != -1){
                first =  val;
                break;
            }       
        }
        return first;
    }    
}
