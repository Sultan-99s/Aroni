package January19;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int n = 0;
        char c;
        String s = "";
        System.out.println("Enter the text : ");
        Scanner sc = new Scanner(System.in);
        String aroni = sc.nextLine();
        for(int i =0; i<aroni.length(); i++){
            c = aroni.charAt(i);
            int x = c +12;
            if(c+12 >=97 && c+12<122){
               n = c+13;
               c = (char)n;
            }
            else if(c+12 >=65 && c+12<90){
                n = c+13;
                c = (char)n;
            }
            else if(c+12>=90 && c+12<122) {
                int a = x-90;
                n=a+65;
                c = (char) n;
            }
            else if (c>= 48 && c<=57){
                n = c;
                c = (char)n;
            }
            else if(c+12>=122) {
                int a = x-122;
                n=a+97;
                c = (char) n;
            }
            else if(c==32){
                n=0;
                c = (char) n;
            }
            else if (c==33){
                n=33;
                c = (char)n;
            }
            else if(c==46){
                n=46;
                c = (char)n;
            }
            else if(c==44){
                n=44;
                c = (char)n;
            }
            else if(c==59){
                n=59;
                c = (char)n;
            }
            else if(c==34){
                n=34;
                c = (char)n;
            }
            else if(c==63){
                n=63;
                c=(char)n;
            }
            else {
                c = (char) n;
            }

            s = s+c;
        }
        System.out.println("new : "+s);
    }
}
