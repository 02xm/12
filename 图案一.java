public class 图案一 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                if(i==0|i==5|j==0|j==5){
                    System.out.print("lxy");
                    if(i==2&j==2){
                        System.out.print("加油!");
                    }else
                        System.out.print(" ");

                }else{
                    System.out.print(" ");
                }
                }System.out.println();

            }
        }
    }

