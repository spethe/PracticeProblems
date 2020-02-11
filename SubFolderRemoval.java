/*
Given a list of folders, remove all sub-folders in those folders and return in any order the folders after removing.

If a folder[i] is located within another folder[j], it is called a sub-folder of it.

The format of a path is one or more concatenated strings of the form: / followed by one or more lowercase English letters. For example, /leetcode and /leetcode/problems are valid paths while an empty string and / are not.

 

Example 1:

Input: folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
Output: ["/a","/c/d","/c/f"]
Explanation: Folders "/a/b/" is a subfolder of "/a" and "/c/d/e" is inside of folder "/c/d" in our filesystem.
Example 2:

Input: folder = ["/a","/a/b/c","/a/b/d"]
Output: ["/a"]
Explanation: Folders "/a/b/c" and "/a/b/d/" will be removed because they are subfolders of "/a".
Example 3:

Input: folder = ["/a/b/c","/a/b/ca","/a/b/d"]
Output: ["/a/b/c","/a/b/ca","/a/b/d"]
 

Constraints:

1 <= folder.length <= 4 * 10^4
2 <= folder[i].length <= 100
folder[i] contains only lowercase letters and '/'
folder[i] always starts with character '/'
Each folder name is unique.
*/

class SubFolderRemoval {
    public List<String> removeSubfolders(String[] folder) {
        //Sort the array of folders alphabetically <nlogn>
        Arrays.sort(folder);
        Stack<String> stk = new Stack<String>();
        stk.push(folder[0]);
        //Only push folders for which the already available stack items are not substrings.
        for (int i=1;i<folder.length;i++){
            String stkpk = stk.peek() + "/";
            if(folder[i].indexOf(stkpk) != 0)
                stk.push(folder[i]);
        }
        return new ArrayList(stk);
    }
}
