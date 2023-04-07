package DP;

public class knapsack {
    public static int knapsack(int []w,int []val,int i,int maxwt){
        if(i==val.length||maxwt==0){
          return 0;
        }
        if(w[i]>maxwt){
            return knapsack(w, val, i+1, maxwt);
        }
        int ans1=val[i]+knapsack(w,val,i+1,maxwt-w[i]);
        int ans2=knapsack(w, val, i+1, maxwt);
        return Math.max(ans1,ans2);
    }
    public static int knapsackmemo(int []w,int []val,int i,int maxwt,int dp[][]) {
        int smallans;
        if (i == val.length || maxwt == 0) {
            return dp[i][maxwt] = 0;
        }
        if (w[i] > maxwt) {
            if (dp[i + 1][maxwt] == 0) {
                smallans = knapsack(w, val, i + 1, maxwt);
                dp[i + 1][maxwt] = smallans;
            } else {
                smallans = dp[i + 1][maxwt];
            }
        }
        int ans1;
        int ans2;
        if (dp[i + 1][maxwt - w[i]] == 0) {
            ans1 = val[i] + knapsack(w, val, i + 1, maxwt - w[i]);
            dp[i + 1][maxwt - w[i]] = ans1;
        }else{
            ans1=dp[i + 1][maxwt - w[i]];
        }
        if(dp[i+1][maxwt]==0) {
            ans2 = knapsack(w, val, i + 1, maxwt);
            dp[i+1][maxwt]=ans2;
        }else {
             ans2= dp[i+1][maxwt];
        }
        smallans= Math.max(ans1,ans2);
      return smallans;
    }
    public static int knapsackIte(int []val,int []wts,int maxweight){
    int n=val.length;
    int dp[][]=new int [n+1][maxweight+1];

    for(int i=n-1;i>=0;i--){
        for(int w=0;w<=maxweight;w++){
            int ans;
            if(wts[i]<=w){
                int ans1=val[i]+dp[i+1][w-wts[i]];
                int ans2=dp[i+1][w];
                ans=Math.max(ans1,ans2);
            }else{
                ans=dp[i+1][w];
            }
            dp[i][w]=ans;
        }

    }
        return dp[0][maxweight];

    }
   public  static void main (String arge[]){
       int val[]={200,300,100};
       int wts[]={20,25,30};
       int maxwt=50;
       int ans=knapsack(wts,val,0,maxwt);
       System.out.println(ans);
       int dp[][]=new int [val.length+1][maxwt+1];
       for(int i=0;i< dp.length;i++){
           for(int j=0;j<dp[0].length;j++){
               dp[i][j]=0;
           }
       }
       int memoans=knapsackmemo(wts,val,0,maxwt,dp);
       System.out.println(memoans);
       int iteana=knapsackIte(val,wts,maxwt);
       System.out.println(iteana);
   }
}
