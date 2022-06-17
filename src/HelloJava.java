import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        double target=0.618;
        double mini=1;
        double minj=1;
        double currentDistance=0;
        double lastDistance=0;
        for(double i=1;i<=20;i++){
            for(double j=1;j<=20;j++){
                lastDistance=Math.abs(mini/minj-target);
                currentDistance=Math.abs(i/j-target);
                if(currentDistance<=lastDistance){
                    mini=i;
                    minj=j;
                }
            }
        }
        System.out.println(mini);
        System.out.println(minj);
    }
}