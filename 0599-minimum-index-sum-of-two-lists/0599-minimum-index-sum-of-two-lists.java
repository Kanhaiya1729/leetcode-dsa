class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
         int min = Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
           if(map.containsKey(list2[i])){
            int sum=map.get(list2[i])+i;
            min=Math.min(min,sum);
            
           }

        }
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<list2.length;i++){
           if(map.containsKey(list2[i]) && map.get(list2[i])+i==min){
            list.add(list2[i]);
           }
        }
        String ans[]=new String[list.size()];
        int i=0;
        for(String num:list){
            ans[i]=num;
            i++;

        }
        return ans;

        
    }
}