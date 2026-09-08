class Solution {
    public String removeDuplicates(String s) {
            Stack<Character>st=new Stack<>();
             st.push(s.charAt(0));
            for(int i=1;i<s.length();i++){
                if(!st.isEmpty() && st.peek()== s.charAt(i)){
                    st.pop(); 
                }else{
                    st.push(s.charAt(i));
                }
            }
            String ans="";
            while(!st.isEmpty()){
                char ch=st.pop();
                ans=ch+ans;
            }
            return ans;
        

    }
}