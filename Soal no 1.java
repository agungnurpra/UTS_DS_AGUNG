public class no1 {
    public static void uts_no1(){
        int random_array[] = {63,6,4,9,27,19,2,8,9,23,81,56,45,82,63};
        for(int i = 0; i < random_array.length; i++) {
            if(random_array[i] % 2 == 0) {
                System.out.println(random_array[i] + " --> Bilangan Genap");
            }else{
                System.out.println(random_array[i] + " --> Bilangan Ganjil");
            }
        }
        return;
    }
}