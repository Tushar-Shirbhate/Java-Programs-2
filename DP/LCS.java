package DP;

public class LCS {
    public  static int LCS( String str1,String str2,int i,int j){
        int myans;
        if(i==str1.length()||j==str2.length()){
           return 0;
       }

        if (str1.charAt(i)==str2.charAt(j)){
       int smallans=LCS(str1,str2,i+1,j+1);
       myans=1+smallans;
      }else{
            int smallans1=LCS(str1,str2,i+1,j);
            int smallans2=LCS(str1,str2,i,j+1);
            myans=Math.max(smallans1,smallans2);
        }
        return myans;
    }
    public static  int LCSdp(String str1,String str2,int i,int j,int dp[][]){
        if(i==str1.length()||j==str2.length()){
            return 0;
        }
        int myans;
        if (str1.charAt(i)==str2.charAt(j)){
            int smallans;
            if(dp[i+1][j+1]==-1) {
                 smallans = LCS(str1, str2, i + 1, j + 1);
                dp[i+1][j+1]=smallans;
            }else{
               smallans= dp[i+1][j+1];
            }
            myans = 1 + smallans;

        }else{
            int smallans1;
            int smallans2;
            if(dp[i+1][j]==-1) {
                smallans1 = LCS(str1, str2, i + 1, j);
                dp[i+1][j]=smallans1;
            }else{
               smallans1= dp[i+1][j];
            }
            if(dp[i][j+1]==-1) {
                smallans2 = LCS(str1, str2, i, j + 1);
                dp[i][j+1]=smallans2;
            }else{
                smallans2=dp[i][j+1];
            }
            myans=Math.max(smallans1,smallans2);
        }
        return myans;

    }
    public static int LCSiterative(String str1,String str2){
        int str1l=str1.length();
        int str2l=str2.length();
        int dp[][]=new int [str1l+1][str2l+1];
//        for(int i=0;i< dp.length;i++){
//            for(int j=0;j<dp[0].length;j++){
//                dp[i][j]=0;
//            }
//        }
        for(int i=str1l-1;i>=0;i--){
            for(int j=str2l-1;j>=0;j--){
                if(str1.charAt(i)==str2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];

    }
    public static  void main (String args[]){
       String str1="bedgmc" ;
       String str2="abdfglc";
       int dp[][]=new int [str1.length()][str2.length()];
       for(int i=0;i< dp.length;i++){
           for(int j=0;j<dp[0].length;j++){
               dp[i][j]=-1;
           }
       }
       int LCSno=LCS(str1,str2,0,0);
       System.out.println(LCSno);
       int Lcsdp=LCSdp(str1,str2,0,0,dp);
        System.out.println(Lcsdp);

        int LCSnobyiterative=LCSiterative(str1,str2);
        System.out.println(LCSnobyiterative);
    }
}
