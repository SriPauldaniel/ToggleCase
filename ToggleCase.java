import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        String result = "";
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>= 65 && arr[i] <= 90) {
                arr[i] += 32;
            }
            else if(arr[i] >=97 && arr[i] <= 122) {
                arr[i] -= 32;
            }
            result += arr[i];
        }
        System.out.println(result);
        sc.close();
    }
}