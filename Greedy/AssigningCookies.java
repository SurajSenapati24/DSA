import java.util.Arrays;

public class AssigningCookies {
    public static int solution(int g[],int s[]){
        int n=g.length;
        int m=s.length;
        int ans=0;
        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<n && r<m){
            if(g[l]<=s[r]){
                r++;
                l++;
            }
            else{
                r++;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int g[]={1,5,3,3,4};
        int s[]={4,2,1,2,1,3};
        System.out.println(solution(g, s));
    }
}
