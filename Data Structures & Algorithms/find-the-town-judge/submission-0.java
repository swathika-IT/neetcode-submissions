class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<trust.length;i++){
         // map.put(trust[i][0],map.getorDefault(0));
         map.put(trust[i][0], map.getOrDefault(trust[i][0], 0) + 1);
         count.put(trust[i][1], count.getOrDefault(trust[i][1], 0) + 1);
         
        }
    for(int i=1;i<=n;i++){
      if(map.getOrDefault(i, 0) == 0 && count.getOrDefault(i, 0) == n-1){
        return i;
      }
    }
    return -1;
    }
}