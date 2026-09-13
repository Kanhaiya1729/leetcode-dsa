class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>ans=new ArrayList<>();  
        backtrack(s,0,new StringBuilder(),ans);
        return ans;

    }
    public void backtrack(String s,int idx,StringBuilder curr, List<String>ans){
        if(idx==s.length()){
            ans.add(curr.toString());
            return ;
        }
       char ch=s.charAt(idx);
       if(Character.isDigit(ch)){
        curr.append(ch);
         backtrack(s,idx+1,curr,ans);
         curr.deleteCharAt(curr.length()-1);
        
       }else{
         curr.append(Character.toLowerCase(ch));
          backtrack(s,idx+1,curr,ans);
          curr.deleteCharAt(curr.length()-1);


           curr.append(Character.toUpperCase(ch));
            backtrack(s,idx+1,curr,ans);
           curr.deleteCharAt(curr.length()-1);

    }
}
}