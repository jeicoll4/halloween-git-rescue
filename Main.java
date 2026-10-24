import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String s;
        System.out.println("Quantes coses vols esriure?");
        int coses = sc.nextInt();
    for ( i= 1; i<=coses;i++){
        
        System.out.println("Escriu cosa "+i+"...");
        s =  sc.next();
    } 

    sc.close();
    }
}
