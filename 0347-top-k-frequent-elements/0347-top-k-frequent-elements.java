class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            return b[0]-a[0];
        });
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            
           pq.add(new int[]{entry.getValue(),entry.getKey()});
    
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
           ans[i]= pq.poll()[1];
        }
        return ans;
        
    }
}