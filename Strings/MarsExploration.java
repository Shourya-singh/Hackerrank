package Strings;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++){
            char a=(i%3==1)?'O':'S';
            if(s.charAt(i)!=a)
                c++;
        }
        System.out.println(c);
    }
}
