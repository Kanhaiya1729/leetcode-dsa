class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                s.pop();
            }
            else if(operations[i].equals("D")){
                int num=s.peek();
                s.push(num*2);
                
            }else if(operations[i].equals("+")){
                int x=s.pop();
                int y=s.peek();
                s.push(x);
                s.push(x+y);
            }else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int ans=0;
        while(!s.isEmpty()){
            int num=s.pop();
            ans+=num;

        }
        return ans;


        
    }
}