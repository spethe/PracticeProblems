class StrStr {
    public int strStr(String haystack, String needle) {
        int needlen = needle.length();
        int haylen = haystack.length();
        if(needlen == 0) return 0;
        int needlepoint=-1;
        for(int i=0; i<haylen; i++ ){
            int j=0;
            int k=i;
            while(j<needlen && k < haylen && (needle.charAt(j) == haystack.charAt(k))){
                k++;
                j++;
            }
            if(j>=needlen){
                needlepoint = k-needlen;
                break;
            }
        }
        return needlepoint;          
    }
}
