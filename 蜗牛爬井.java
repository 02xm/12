public class 蜗牛爬井 {
    public static void main(String[] args){
        int distance=0;
        int day=1;
        while(true){
            distance+=2;
            if(distance>=10){
                break;
            }else{
                distance-=1;
                day++;
            }
        }
        System.out.println("蜗牛需要"+day+"天爬出洞");





    }
}
