class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {  
      byte n=(byte)grid.length;
      short len=(short)(n*n);
      byte[] num= new byte[len];
      n--;
      for(byte i=n;i>=0;i--){
        for(byte j=n;j>=0;j--){
          num[grid[i][j]-1]++;
        }
      }
      int[]result=new int[2];
      for(byte i=2;i>0;){
        if(num[--len]==2){
          result[0]=len+1;
          i--;
        }else if(num[len]==0){
          result[1]=len+1;
          i--;
        }
      }return result;
    }
}
