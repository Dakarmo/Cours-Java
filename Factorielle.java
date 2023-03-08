

// public class Factorielle {

//     public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        if(n==0) {
//         System.out.println("voilà factorielle de " + n + "= 1");
//        }else if(n>0){
//             int facto = 1;
//                 for(int i=n; i>1; i--) {
//                     facto *=i;
//                 } 
//             System.out.println("voilà factorielle de " + n + "= " + facto);
//        }else {
//         System.out.println("Assurez-vous de bien retrer un nombre positif");
//        }

//     }
    
// }

public class Factorielle {

    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);
       long factoriel = facto(n);
       System.out.println(factoriel);
    }

    public static long facto(int k){
        if(k==0) {
            return 1;
        }else if(k>0) {
            return k * facto(k-1);
        }else {
            return 0;
        }

    }
    
}
