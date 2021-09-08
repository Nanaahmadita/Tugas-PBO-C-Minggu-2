public class MenentukanBilGanjilGenap{
    public static void main(String[] args) {
        System.out.println("\n\tMenentukan Bilangan Ganjil dan Genap\t\n");
        int [] bil = {1, 2, 3,89, 90, 68, 80, 87687586, 123124235,456789, 1234567, 987654, 258779, 5, 7, 4};
        System.out.println("Data angka: " + "\n" + "1, 2, 3,89, 90, 68, 80, 87687586, 123124235,456789, 1234567, 987654, 258779, 5, 7, 4");

        System.out.print("\n" + "Bilangan Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " | ");
            }
        }
        System.out.print("\n" + "Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " | ");
            }
        }      
        System.out.println("");
    }
}