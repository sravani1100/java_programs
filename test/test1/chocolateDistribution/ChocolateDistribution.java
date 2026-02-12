import java.util.Scanner;
import java.util.Arrays;

class ChocolateDistribution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        if(M == 0 || N == 0 || M > N){
            System.out.println(0);
            return;
        }

        Arrays.sort(A);
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i + M - 1 < N; i++){
            int diff = A[i + M - 1] - A[i];
            minDiff = Math.min(minDiff, diff);
        }
        System.out.println(minDiff);
    }
}