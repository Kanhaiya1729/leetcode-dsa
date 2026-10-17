class Solution {
    HashMap<String,Integer>map=new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,0,target,nums);
       
        } 
    
    public int solve(int idx , int sum,int target,int nums[] ){

         if(idx==nums.length){
          return sum==target? 1 : 0 ;
        }
        String key=idx+" "+sum;
         if(map.containsKey(key)){
            return map.get(key);
         }
        int plus=  solve(idx+1,sum+nums[idx],target,nums);
        int minus=  solve(idx+1,sum-nums[idx],target,nums);
        int ways=plus+minus;
        map.put(key,ways);
        return ways;
    }
    }
