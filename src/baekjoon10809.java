// 10809번 : 알파벳 찾기
// 2017-09-04

import java.util.Scanner;
public class baekjoon10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //알파벳 위치를 저장할 배열 선언, -1로 값 초기화
        int[] location = new int[26];
        for(int i = 0 ; i < 26 ; i++){
            location[i] = -1;
        }
        //최초의 등장 위치만을 저장하기 위해 조건문을 걸어줬다.
        //입력값의 아스키코드값 - a(97)을 뺀 자리에 위치를 저장한다.
        for(int i = 0 ; i < input.length(); i++){
            if(location[input.charAt(i) - 'a'] == -1) {
                location[input.charAt(i) - 'a'] += i + 1;
            }
        }
        for(int i = 0 ; i < location.length;i++){
            System.out.print(location[i] + " ");
        }
    }
}
