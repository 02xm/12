import java.util.Scanner;
public class level2 {
    public static void main(String[] args) {
        double t1=1;
        double t2=1;
        int i;
        String answer;
       do{Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println("请输入从"+n+"个数字中抽"+k+"个");
        for(i=1;i<=k;i++){
            t1*=i;
        }
        for(i=1;i<=n;i++){
            t2*=i;
        }
        System.out.println("请输入中奖的概率:"+1/(t2/t1));
       System.out.println("是否再抽一次(yes/no)");
       Scanner input=new Scanner(System.in);
       answer=input.next();}
       while("yes".equals(answer));
    }
}
