class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
         int i=0;
         int sum=0;
         while(i<boxTypes.length && truckSize>0){
            if(boxTypes[i][0]<=truckSize){
                sum+= boxTypes[i][0]*boxTypes[i][1];
                truckSize-= boxTypes[i][0];
                i++;
            }else{
                 sum+= truckSize*boxTypes[i][1];
                  truckSize-= boxTypes[i][0];
                 
            }


         }
         return sum;
        
    }
}