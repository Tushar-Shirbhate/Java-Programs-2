package DP;

public class classFibonacci {
    public static int minsquaresIterative(int n){

        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int minans=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
             int ans=dp[i-(j*j)] ;
             if(minans>ans){
                 minans=ans;
             }
            }
            dp[i]=1+minans;
        }
        return dp[n];

    }
    public static int minsquare(int n,int dp[]){
        if(n==0){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for (int i=1;i*i<=n;i++){
            int ans;
            if(dp[n-(i*i)]==-1){
                ans=minsquare(n-(i*i),dp);
                dp[n-(i*i)]=ans;
            }else{
                ans=dp[n-(i*i)];
            }
            if(min>ans){
                min=ans;
            }
        }
        return 1+min;
    }
    public static int fibbI(int n){
        if (n==0||n==1){
            return n;
        }
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int minstaircaseI(int n){
        if(n==0){
            return 1;
        }
        if (n==1||n==2){
            return n;
        }
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i< dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static int fibonaccinumber(int n,int []dp){
        if(n==0||n==1){
            return n;
        }
        int ans1,ans2;
        if (dp[n-1]==-1) {
            ans1 = fibonaccinumber(n - 1, dp);
            dp[n-1]=ans1;
        }else{
            ans1=dp[n-1];
        }
        if(dp[n-2]==-1) {
            ans2 = fibonaccinumber(n - 2, dp);
            dp[n-2]=ans2;
        }else {
            ans2=dp[n-2];
        }
        int ans=ans1+ans2;
        return ans;
    }
    public static int mincostRecursive(int [][]input,int i,int j ){
        //special case
        int mrows=input.length;
        int ncolm=input[0].length;
        if(i==mrows-1&&j==ncolm-1){
            return input[i][j];
        }
        //base case
        if(i>=mrows||j>=ncolm){
            return Integer.MAX_VALUE;
        }
        int ans1=mincostRecursive(input,i+1,j);
        int ans2=mincostRecursive(input, i, j+1);
        int ans3=mincostRecursive(input, i+1, j+1);
        return input[i][j]+Math.min(ans1, Math.min(ans2, ans3));
    }
    public static int mincostmemoization(int [][]input,int i,int j ,int dp[][]){
        int mrows=input.length;
        int ncolm=input[0].length;
        //special case
        if(i==mrows-1&&j==ncolm-1){
            return input[i][j];
        }
        //base case
        if(i>=mrows||j>=ncolm){
            return Integer.MAX_VALUE;
        }
        int ans1;
        int ans2;
        int ans3;
        if(dp[i+1][j]==Integer.MIN_VALUE) {
            ans1 = mincostmemoization(input, i + 1, j,dp);
            dp[i+1][j]=ans1;
        }else{
            ans1=dp[i+1][j];
        }
        if(dp[i][j+1]==Integer.MIN_VALUE) {
            ans2 = mincostmemoization(input, i, j + 1,dp);
            dp[i][j+1]=ans2;
        }else{
            ans2=dp[i][j+1];
        }
        if(dp[i+1][j+1]==Integer.MIN_VALUE) {
            ans3 = mincostmemoization(input, i + 1, j + 1,dp);
            dp[i+1][j+1]=ans3;
        }else{
            ans3=dp[i+1][j+1];
        }
        return input[i][j]+Math.min(ans1, Math.min(ans2, ans3));
    }
    public static int mincostbyIterativeBU(int[][]cost ){
        int mrows=cost.length;
        int nclom=cost[0].length;
        int dp[][]=new int [mrows+1][nclom+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        dp[mrows-1][nclom-1]=cost[mrows-1][nclom-1];
        for(int i=mrows-1;i>=0;i--){
            for(int j=nclom-1;j>=0;j--){
                if(i==mrows-1&&j==nclom-1){
                   dp[i][j]=cost[i][j];
                   continue;
                }
                int ans1=dp[i][j+1];
                int ans2=dp[i+1][j];
                int ans3=dp[i+1][j+1];
                dp[i][j]=cost[i][j]+Math.min(ans1,Math.min(ans2,ans3));
            }
        }
        return  dp[0][0];
    }
    public static int mincostbyIterativeTD(int[][]cost ){
        int mrows=cost.length;
        int nclom=cost[0].length;
        int dp[][]=new int [mrows+1][nclom+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=1;i<mrows+1;i++){
            for(int j=1;j<nclom+1;j++){
                if(i==1&&j==1){
                    dp[i][j]=cost[0][0];
                    continue;
                }
                int ans1=dp[i][j-1];
                int ans2=dp[i-1][j];
                int ans3=dp[i-1][j-1];
                dp[i][j]=cost[i-1][j-1]+Math.min(ans1,Math.min(ans2,ans3));
            }
        }
        return  dp[mrows][nclom];
    }
    public static void main (String args []){
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int dp[]=new int[n+1] ;
//        for (int i=0;i<dp.length;i++){
//            dp[i]=-1;
//        }
//        int ans =fibbI(n);
//        System.out.println("The fibonacci of "+n+" is"+ans);
//
//        int minstair=minstaircaseI(n);
//        System.out.println("The total steps:"+minstair);
//
//        int minsq=minsquare(n,dp);
//        System.out.println("The min squares to represent " +n+" is "+minsq );
//
//        int minsqI=minsquaresIterative(n);
//        System.out.println("min squares to represent "+n+" by iterative method is"+minsqI);

        int input[][]={{3,4,5},{6,7,8},{9,10,11}};
        int dp[][]=new int [input.length+1][input[0].length+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        int mincost=mincostRecursive(input,0,0);
        System.out.println("The minimum cost is "+mincost);
        int Memomincost=mincostmemoization(input,0,0,dp);
        System.out.println("The minimum cost by memoization method is "+Memomincost);
        int mincostbyiterative=mincostbyIterativeBU(input);
        System.out.println("The minimum cost by iterative method is"+mincostbyiterative);
        int mincostbytopdownapp=mincostbyIterativeTD(input);
        System.out.println("The minimum cost by topdown approach is:"+mincostbytopdownapp);
    }
}
