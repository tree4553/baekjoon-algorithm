//2577번 : 숫자의 개수
import java.util.Scanner;
public class baekjoon2577 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int[] num = new int[10];
        int n = a*b*c;
        int temp = a*b*c;
        int x = 0;
        while(temp!=0){
            temp=temp/10;
            x++;
        }
        for(int i = 0 ; i< x; i++){
            int y = n%10;
            num[y]++;
            n = n/10;
        }
        for(int i = 0 ; i < 10; i++){
            System.out.println(num[i]);
        }
    }
}
