class Solution {
    public void reverseString(char[] s) {
      
       int r = s.length-1;
       
       for(int i=0; i<r ; i++,r--){
          char temp = s[i];
           s[i] = s[r];
           s[r] = temp;
          
       }
    }
}