import java.util.Scanner;

public class case_1 {
        
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        String nString = iScanner.nextLine();
        int n = Integer.parseInt(nString);
        System.out.printf("Введите символ c1: ");
        String c1 = iScanner.nextLine();
        System.out.printf("Введите символ c2: ");
        String c2 = iScanner.nextLine();
        iScanner.close();
    

    StringBuilder sres = new StringBuilder();

// for (int i = 1; i <= n; i++) {
// if (i%2 == 0){
// sres.append(c1);
// } else {
// sres.append(c2);
// }
// }


// for (int i = 1; i <= n/2; i++) {
// sres.append(c1+c2);
// }
//
// System.out.println(sres);
    sres.append((c1 + c2).repeat(Math.max(0, n / 2)));
    
    System.out.println(sres);
    
    }
}
