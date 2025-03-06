class Solution {
    static short dic(char x){
        switch(x){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }return 0;
    }
    public int romanToInt(String s) {
        byte len=(byte)(s.length());
        if(len==0)
            return 0;
        if(len==1)
            return dic(s.charAt(0));
        short[] nums=new short[len];
        
        for(short i=(short)(--len);i>=0;i--){
            nums[i]=dic(s.charAt(i));
            
        }
        short sum=nums[len--];
        for(short i=(short)(len);i>=0;i--){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
            
        //System.out.println(sum);
        }
        return sum;
    }
}
