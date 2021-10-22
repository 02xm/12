import java.util.Scanner;
public class level1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s;
       do{ System.out.println("请输入三个数字，用空格隔开(num1 num2 num3):");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("平时成绩为:"+num1);
        System.out.println("期中成绩为:"+num2);
        System.out.println("期末成绩为:"+num3);
        double d=num1*0.2+num2*0.3+num3*0.5;
        System.out.println(d);
        if(d>60){System.out.println("就这?还没我卷");}
        else{System.out.println("勇敢俊袅，不怕困难");}
           System.out.println("请输入你的选择:(yes/no)");
           Scanner in=new Scanner(System.in);
       s=in.next();}
            while("yes".equals(s));
        sc.close();


    }

}
