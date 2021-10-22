import java.util.Scanner;
public class 选举 {
    public static void main(String[] args) {
        System.out.println("请输入你的选票");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=s.charAt(0);
        char s1='a';
        char s2='b';
        char s3='c';
        char s4='d';
        if(s1==(c)||s2==(c)||s3==(c)||s4==(c)){
            System.out.println("获胜者是:"+c);}
            else{
                System.out.println("无效!");
            }

    }
}
