class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length()==1 || s.length()==2 ){
            return "";
        }
        int depth=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '('){
                if(depth>0){
                ans.append(s.charAt(i)); 
                }
                depth++;
            }
             
            if(s.charAt(i)== ')' ){
                 depth--;
                 if(depth>0){
               ans.append(s.charAt(i)); 
                 }
               
            }

            
        }
        return ans.toString();

        
    }
}