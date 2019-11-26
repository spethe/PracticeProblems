class Solution {
    public boolean isValid(String s) {
        //If length is odd or 0
        if(s.length() % 2 != 0){
            return false;
        }
        if(s.length() == 0)
            return true;
        Stack<Character> cstack = new Stack<Character>();
        HashMap<Character, Character> openClose = new HashMap<>();
        openClose.put('(',')');
        openClose.put('{','}');
        openClose.put('[',']');
        for(int i=0; i<s.length(); i++){
            Character curr = s.charAt(i);
            if(openClose.containsKey(curr)){
                cstack.push(curr);
            }else{
                if(cstack.size() == 0) return false;
                if(curr == openClose.get(cstack.peek())){
                    cstack.pop();
                }else{
                    break;
                }
            }
        }
        if(cstack.size() == 0) return true;
        else return false;      
    }
}
