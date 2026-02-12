import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class MeetingRoomAssignment{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine( ));
            int[] start = new int[n];
            int[] end = new int[n];
            for(int i = 0; i < n; i++){
                String s[] = br.readLine().split(" ");
                start[i] = Integer.parseInt(s[0]);
                end[i] = Integer.parseInt(s[1]);
            }
            Arrays.sort(start);
            Arrays.sort(end);

            int ans = 0;
            int c = 1, p1 = 1, p2 = 0;
            while(p1 < n){
                if(start[p1] < end[p2]){
                    c++;
                    ans = Math.max(ans, c);
                    p1++;
                }else{
                    p2++;
                    c--;
                }
            }
            System.out.println(ans);
        }
    }
}