class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>ans=new ArrayList<>();
        
      for(int hr=0;hr<12;hr++){
        for(int min=0;min<60;min++){
            if(Integer.bitCount(hr)+Integer.bitCount(min)==turnedOn){
                ans.add(String.format("%d:%02d", hr, min));
            }
        }
      }
      return ans;



        
    }
}