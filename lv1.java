public class lv1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=9;i++){ /*行数*/
            for(j=1;j<=i;j++){/*控制一行中个数*/
                System.out.print("\t"+j+"*"+i+"="+i*j);
            }System.out.println();
        }
    }
}
