import java.util.Scanner;

public class no2
{
    public static void uts_no2(){
        Scanner inputan = new Scanner(System.in);

        int input_array[] = new int[10];

        for(int i = 0; i < input_array.length; i++) {
            System.out.print("Masukkan Angka ke " + (i+1) +" : ");
            input_array[i] = inputan.nextInt();

        }

        selectionSortAbsenGanjil(input_array);
    }

    public static void selectionSortAbsenGanjil(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                     index = j;

                }
                

            }

            int smallernumber = array[index];
            array[index] = array[i];
            array[i] = smallernumber;


        }

        System.out.println("Selection Sort");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}