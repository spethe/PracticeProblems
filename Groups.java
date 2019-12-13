/*There are n people whose IDs go from 0 to n - 1 and each person belongs exactly to one group. Given the array groupSizes of length n telling the group size each person belongs to, return the groups there are and the people's IDs each group includes.

You can return any solution in any order and the same applies for IDs. Also, it is guaranteed that there exists at least one solution. 

 

Example 1:

Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation: 
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].*/

class Groups {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Integer,List<Integer>> mapping = new HashMap<Integer,List<Integer>>();
        for(int i=0;i<groupSizes.length;i++){
            Integer grp= new Integer(groupSizes[i]);
            if(mapping.containsKey(grp)){
                mapping.get(grp).add(i);
            }else{
                List<Integer> li = new ArrayList<Integer>();
                li.add(i);
                mapping.put(grp,li);
            }
        }
        for(Integer grp : mapping.keySet()){
            List<Integer> valueLi = mapping.get(grp);
            int liSize=valueLi.size();
            int quo = liSize / grp;
            int rem = liSize % grp;
            if(rem>0){quo++;}
            int i=0;
            int start=0;
            int end = i+grp;
            while(i<quo){
                result.add(valueLi.subList(start,end));
                start = end;
                end = start+grp;
                i++;
            }      
        }
        return result;
    }
}
