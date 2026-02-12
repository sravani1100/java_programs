import java.util.Scanner;

class Pangram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String input = sc.nextLine().toLowerCase();
            boolean letters[] = new boolean[26];
            for(int i = 0; i < input.length(); i++){
                char ch = input.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    letters[ch - 'a'] = true;
                }
            }
            boolean isPangram = true;
            for(int i = 0; i < letters.length; i++){
                if(!letters[i]){
                    isPangram = false;
                    break;
                }
            }
            if(isPangram) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}