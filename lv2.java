import java.util.Scanner;
public class lv2 {
    public static void main(String[] args) {
        int a[] = {50, 60, 30, 25, 61};
        lv2 sorter = new lv2();
        sorter.sort(a);
    }

    public void sort(int[] a) {
        int i;
        int j;
        for (i = 1; i < a.length; i++) {/*交换总次数*/
            for (j = 0; j < a.length - i; j++) {/*数组之间交换次数*/
                if (a[j] > a[j + 1]) {
                    int tem = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tem;
                }
            }
        }
        showA(a);
    }

    public void showA(int[] a) {
        int i, j;
        for (int m : a) {
            System.out.print("<" + m);}
        System.out.println();
            Scanner sc = new Scanner(System.in);
        System.out.println("在数组中插入一个数:");
            int b = sc.nextInt();
            int c[] = new int[6];
            for (i = 0; i < a.length; i++) {
                c[i]=a[i];
            }
            c[5] = b;
            for (i = 1; i < c.length; i++) {/*交换总次数*/
                for (j = 0; j < c.length - i; j++) {/*数组之间交换次数*/
                    if (c[j] > c[j + 1]) {
                        int f= c[j + 1];
                        c[j + 1]= c[j];
                        c[j] =f;
                        }
                    }
                }
        for (int e : c) {
            System.out.print("<" +e );
            }
        }
    }
