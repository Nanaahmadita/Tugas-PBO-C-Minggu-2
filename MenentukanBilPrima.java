import java.util.Scanner;

class MenentukanBilPrima {
    public static void main(String[] args) 
    {
        System.out.println("\n\tMenentukan Bilangan Prima\t\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka = ");

        int angka = sc.nextInt();
        boolean bilprima = true;

        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
            int i = angka % pembagi;
            if(i == 0){
                bilprima = false;
                break;
            }
        }
        if (bilprima && ((angka > 0) && (angka != 1)))
        System.out.println("Angka " + angka + " adalah bilangan prima" + "\n");
        else
        System.out.println("Angka " + angka + " bukan bilangan prima" + "\n");
    }
}
