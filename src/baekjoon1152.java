import java.util.Scanner;

public class baekjoon1152 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int word = 0;
        for(int i = 1 ; i<input.length();i++){
            char d = input.charAt(i-1);
            char c = input.charAt(i);
            if(String.valueOf(c).equals(" ")  && !String.valueOf(d).equals(" ")){
                word++;
            }
        }
        if(word != 0){
            word++;
        }
        System.out.println(word);
    }
}
