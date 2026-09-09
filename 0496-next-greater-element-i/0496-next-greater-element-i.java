class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<nums1.length;i++){
             int max=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    for(int k=j+1;k<nums2.length;k++){
                    if(nums2[k]>nums1[i]){
                        max=nums2[k]; 
                        break;             
                  }
                }
                break;
                
            }
            
            }
             ans[i]=max;
                 
            }
             return ans;
        }
       


        
    
    }
