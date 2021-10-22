import java.util.Scanner;
public class 作业1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("请输入:"+x);
        if(x%2==0){System.out.println("偶数");}
        else if(x%2==1){
            System.out.println("奇数");
        }
    }
}
