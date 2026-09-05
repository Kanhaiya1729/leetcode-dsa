class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int k=0;
        for(int i=0;i<arr2.length;i++){
            while(map.containsKey(arr2[i])){
                if(map.get(arr2[i])==0){
                    map.remove(arr2[i]);
                }else{
                arr1[k]=arr2[i];
                k++;
                map.put(arr2[i],map.get(arr2[i])-1);
                }
            }

        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x: map.keySet()){
            int count=map.get(x);
            while(count!=0){
                list.add(x);
                count--;
            }
        }
        Collections.sort(list); 
        for(int x: list){
            arr1[k++]=x;
        }
        return arr1;

        
    }
}