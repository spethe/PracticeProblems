/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/
//Very Easy


class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        if(J==null || J.isEmpty()){
            return 0;
        }
        char[] schars = S.toCharArray();
        int num=0;
        for(char schar : schars){
            if(J.contains(String.valueOf(schar))){
                num++;
            }
        }
        return num;
    }
}
