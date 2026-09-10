class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && s.peek()<nums2[i]){
                map.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()){
            map.put(s.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i]=map.get(nums1[i]);
            }
        }
        return ans;
        
        }
       


        
    
    }
