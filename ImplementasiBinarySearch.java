import java.util.Scanner;

public class ImplementasiBinarySearch{
    public static void main(String[] args) {
        System.out.println("\n\tBinary Search Java\t\n");
        int angka[] = {1, 2, 5, 7, 8, 9, 12, 15, 19, 23, 25, 26, 27, 34, 47, 89};
        System.out.println("1, 2, 5, 7, 8, 9, 12, 15, 19, 23, 25, 26, 27, 34, 47, 89");
        Scanner userinput = new Scanner(System.in);
        System.out.print("Angka = ");
        int key = userinput.nextInt();
        int index = angka.length / 2;
        boolean ketemu = false;

        int tengah = index;
        while(index >= 0 && index < angka.length && ketemu == false){
            if(key == angka[index]){
                System.out.println("Data ditemukan pada index ke-" + index + ("\n"));
                ketemu = true;
        
            }else{
                if(key < angka[tengah]){
                    index--;
                }else{
                    index++;
                }
            }
        }

        if (ketemu == false){
            System.out.println("Mohon maaf, data yang anda masukkan tidak ditemukan🙏🏻" + "\n");
        }
    }
}