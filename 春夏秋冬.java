import java.util.Scanner;
public class 春夏秋冬 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字:");
        int num=sc.nextInt();
        switch(num){
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("春");
                break;
        }
        sc.close();
    }
}
