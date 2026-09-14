class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        backtrack(nums,0,curr,ans);
        return ans;
        
    }
    public void  backtrack(int nums[],int idx,List<Integer>curr,List<List<Integer>>ans){
        if(idx==nums.length){
        return ;  
        }
       if(curr.size()==0){
          ans.add(new ArrayList<>(curr));
       }
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            ans.add(new ArrayList<>(curr));
            backtrack(nums,i+1,curr,ans);
            curr.remove(curr.size()-1);

            
        }
    }
}