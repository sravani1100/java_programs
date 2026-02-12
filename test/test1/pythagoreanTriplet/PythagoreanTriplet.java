import java.util.Arrays;
import java.util.Scanner;

class PythagoreanTriplet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (checkTriplet(arr, n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

        public static boolean checkTriplet(int[] arr, int n){
            for(int i = 0; i < n; i++){
                arr[i] = arr[i] * arr[i];
            }
            Arrays.sort(arr);
            for(int i = n - 1; i >= 2; i--){
                int left = 0;
                int right = i - 1;
                while(left < right){
                    if(arr[left] + arr[right] == arr[i]){
                        return true;
                    }
                    if(arr[left] + arr[right] < arr[i]){
                        left++;
                    }else right--;
                }
            }
            return false;
        }
}