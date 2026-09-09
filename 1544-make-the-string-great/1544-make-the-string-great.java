class Solution {
    public String makeGood(String s){
        if(s.length()==1){
            return s;
        }
        String ans="";
        StringBuilder sb=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
             char curr=s.charAt(i);
           if(!st.isEmpty()){
            char top=st.peek();
            if( top!=curr && Character.toLowerCase(top)==Character.toLowerCase(curr)){
                st.pop();
                continue;
            }
           }
             st.push(curr);
           }
        while(!st.isEmpty()){
         sb=sb.append(st.pop());
        }
        return sb.reverse().toString();

        
    }
}