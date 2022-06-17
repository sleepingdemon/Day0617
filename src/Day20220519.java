import java.util.Scanner;

public class Day20220519 {
    public static void main(String[] args) {
        String result="";
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            String next = scanner.next();
            char[] chars = next.toCharArray();
            for (char c:chars) {
                if((c>='A' && c<='Z')||(c>='0' && c<='9') ){
                    result=result+c;
                }
            }
        }
        System.out.println(result);
    }
}