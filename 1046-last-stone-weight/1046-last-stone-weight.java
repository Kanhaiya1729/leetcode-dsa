class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            pq.add(x);  
        }
        while(pq.size()>1){
           int f= pq.remove();
            int s=pq.remove();
            int diff=Math.abs(f-s);
            if(diff!=0){
                pq.add(diff);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();

        
    }
}