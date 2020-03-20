public class ali_poker {
    private static int ans=Integer.MAX_VALUE;
    public static void solution(int[] poker){

        dfs(0,poker);
        System.out.println(ans);

    }
    public static  void dfs(int deep,int[] poker){

        int sum=0;
        int flag=1;
        for (int i=0;i<10;i++){
            sum+=poker[i];
            if (sum>0)
                flag=0;
        }
        if (sum==0){
            ans=deep<ans?deep:ans;
            return ;
        }
        if(deep + sum/6+1 >= ans)
            return ;
        for(int i=0;i<=7;i++){
            if(poker[i]>1 & poker[i+1]>1 && poker[i+2]>1){
                poker[i]-=2;poker[i+1]-=2;poker[i+2]-=2;
                dfs(deep+1,poker);
                poker[i]+=2;poker[i+1]+=2;poker[i+2]+=2;
            }
        }
        for(int i=0;i<=5;i++){
            if(poker[i]>0 & poker[i+1]>0 && poker[i+2]>0 && poker[i+3]>0 && poker[i+4]>0){
                poker[i]-=1;poker[i+1]-=1;poker[i+2]-=1;poker[i+3]-=1;poker[i+4]-=1;
                dfs(deep+1,poker);
                poker[i]+=1;poker[i+1]+=1;poker[i+2]+=1;poker[i+3]+=1;poker[i+4]+=1;
            }
        }
        for(int i=0;i<=9;i++){
            if(poker[i]>1){
                poker[i]-=2;
                dfs(deep+1,poker);
                poker[i]+=2;
            }
        }
        for(int i=0;i<=9;i++){
            if(poker[i]>0){
                poker[i]-=1;
                dfs(deep+1,poker);
                poker[i]+=1;

            }
        }
        return ;
    }

    public static void main(String[] args) {
        int[] poker={1,2,2,2,2,1,0,0,0,0};
        solution(poker);
    }
}
