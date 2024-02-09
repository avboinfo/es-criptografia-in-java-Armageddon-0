import java.util.*;
public class Main {
    public static void main(String[] args) {
        String risposta;
        Scanner f=new Scanner(System.in);
        System.out.println("ti chiedero quale metodo vuoi usare [cesar ,xor] ");
        risposta=f.nextLine();
        if(risposta.equals("cesar")){
            System.out.println("ti chiedero una frase a tua scelta ");
            String parola=f.nextLine();
            System.out.println("ti chiedero una chiave a tua scelta deve essere un numero");
            int chiave=f.nextInt();
            String rispostaFinale=Cryto.Cesar(parola,chiave);
            System.out.println(rispostaFinale);
            System.out.println("dimmi se lo vuoi decriptare metti[A] o no metti [F]");
            String risposta1=f.nextLine();
            if (risposta1.equals("A")) {
                System.out.println("Decrypted: " + Cryto.Cesar(rispostaFinale,-chiave));
                f.close();
            } else if(risposta1.equals("F")){
                f.close();
                return;
            }

        }else if(risposta.equals("xor")){
            System.out.println("ti chiedero una frase a tua scelta ");
            String parola=f.nextLine();
            System.out.println("ti chiedero una chiave a tua scelta ");
            String chiave=f.nextLine();
            String rispostaFinale=Cryto.xorAlgo(parola,chiave);
            System.out.println(rispostaFinale);
        }
        
    }
    
}
