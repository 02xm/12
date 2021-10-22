public class 数组排序 {
    public static void main(String[] args) {
        int grade[]={71,89,67,53,78,64,92,56,74,85};
        数组排序 sorter=new 数组排序();
        sorter.sort(grade);
    }
    public void sort(int[] grade){
        int i;
        int j;
        for(i=1;i<grade.length;i++){
            for(j=0;j<grade.length-i;j++){
            if(grade[j]>grade[j+1]){
                int tem=grade[j];
                grade[j]=grade[j+1];
                grade[j+1]=tem;
            }
        }
    }
    showGrade(grade);}
    public void showGrade(int[] grade){
        for(int i:grade){
            System.out.print(">"+i);
        }
        System.out.println();
    }
}
