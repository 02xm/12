public class 三角形 {
    public static void main(String[] args) {
        int i;
        int j;
        int m;
        for(i=1;i<=10;i++){
            for(j=0;j<10-i;j++){
                System.out.print(" ");}
                for(m=0;m<2*i-1;m++){
                    System.out.print("*");}
            System.out.println();
        }
    }
}
