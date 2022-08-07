import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng ");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            arr[i]=scanner.nextInt();
        }
        int min=arr[0];
        for (int e:arr
             ) {
            if(min>e){
                min=e;
            }
        }
        for (int e:arr
             ) {
            System.out.print(e+"\t");
        }
        System.out.println("\n Giá trị nhỏ nhất là "+min );
    }
}
