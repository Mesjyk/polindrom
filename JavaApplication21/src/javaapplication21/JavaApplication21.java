package javaapplication21;

public class JavaApplication21 {

    public static void main(String[] args) {
        int max=0;
        String str="klkdpppapppsdsdsdsds";
        char[] simb=str.toCharArray();
        for(int i=1;i<str.length()-1;i++){
            int a=1;
            int b=1;
            a=polindrom(simb, i, a);
            if((a>1)&&(a>max)){
                max=a;
            }
        }
        
        System.out.println(max*2-1);
    }
    
    public static int polindrom(char[] simb, int i, int a) {
        if(((i+a)>simb.length-1)||((i-a)<0)){
            if
                if
            System.out.println("net"+i);
        }else if((simb[i-a]!=simb[i+a])||(simb[i]!=simb[i-1])||(simb[i-a-1]!=simb[i+a])){
            System.out.println("net"+i);
        }else{
            System.out.println("estb"+i);
            a++;
            a=polindrom(simb, i, a);
        }
        return a;
    }
}
