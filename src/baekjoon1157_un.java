// 1157번 : 단어 공부
// 2017-09-06

import java.util.Scanner;

public class baekjoon1157_un {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.toUpperCase();
        int[] count = new int[input.length()];
        for(int i = 0 ; i < input.length(); i++){
            for(int j = 0 ; j < input.length(); j++){
                if(input.charAt(i) == input.charAt(j)){
                    count[j]++;
                    break;
                }
            }
        }

        for(int i = 0 ; i < count.length;i++){
            System.out.println(count[i]);
        }
    }
}
