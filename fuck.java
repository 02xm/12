public class fuck {
    public static void main(String[] args) {
        int array[]={50,60,30,80,90,40,70,50};
        fuck sorter=new fuck();
        sorter.sort(array);   }
        public void sort(int[] array){
        int i;
        int j;
        for(i=1;i<array.length;i++) {
            for (j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tem;
                }
            }
        }
        showArray(array);
    }
    public void showArray(int[] array){
        for(int i:array){
            System.out.print(">"+i);
        }
            System.out.println();
    }
}
