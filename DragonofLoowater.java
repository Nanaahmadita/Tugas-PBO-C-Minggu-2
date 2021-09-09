import java.util.Arrays;

public class DragonofLoowater  {
    public static void main(String[] args) {
        System.out.println("\n\tDragon of Loowater 🐉\t\n");
        //ksatria        
        int[] H = { 5, 7, 8 };
        System.out.println("{ 5, 7, 8 }");
        Arrays.sort(H);
        int N = 0;

        //dragon
        int[] D = { 5, 4 };
        System.out.println("{ 5, 4 }");
        Arrays.sort(D);
        int indeksD  = 0;
        for (int x : H ){
            if (indeksD < D.length){
                if (x >= D[indeksD]){
                    N += x;
                    indeksD++;
                }
            }
        }
        if (indeksD == D.length){
            System.out.println("\n" + N + "😍😍😍");
        } 
        else {
            System.out.println("Ouwwh😲");
        }
    }

}