



import java.util.Scanner;

public class WirdNichtWeitergeführt {

    Scanner scanni = new Scanner(System.in); 
    
    
    
    public void Fakultaet() 
    {
        System.out.println("Geben Sie bitte die Zahl an von der Sie die Fakultät erhalten möchten."); 
        
        int n = scanni.nextInt(); 
        if (n > 0) {
            long erg = n;
            n = n - 1;
            for (int nf = n; nf > 0; nf = nf - 1) {
                erg = erg * nf;
            }
            System.out.println(erg);
        } else if (n < 0) {
            n = Math.abs(n);
            long erg = n;
            n = n - 1;
            for (int nf = n; nf > 0; nf = nf - 1) {
                erg = erg * nf;
            }
            erg = erg * -1;
            System.out.println(erg);
        } else if (n == 0) {
            System.out.println(n);
        }
    }

    public void alphaHochN() {
        System.out.println("Geben Sie bitte den Exponenten an");
        int n = scanni.nextInt();
        System.out.println("Geben Sie bitte die Basis an");
        int alpha = scanni.nextInt();
        int multiplier = alpha;
        double erg = 1;

        if (n > 0) {
            for (int wiederholung = 1; wiederholung <= n; wiederholung++) {
                erg = erg * multiplier;
            }
            System.out.println(erg);
        } else if (n == 0) {
            System.out.println(1);
        } else {
            n = Math.abs(n);
            for (int wiederholung = 1; wiederholung <= n; wiederholung++) {
                erg = erg * multiplier;
            }
            erg = 1 / erg;
            System.out.println(erg);
        }
    }
    
    public void zweiHochnPlusFakultaet()
    {
        System.out.println("Geben sie n an.");
        int n = scanni.nextInt(); 
            long erg = n;
            n = n - 1;
            for (int nf = n; nf > 0; nf = nf - 1) {
                erg = erg * nf;
            }
            
            double ergN = 1;
            for (int i = 0; i <= n; i= i+1) {
                ergN = ergN * 2;
            }
    
    double ergGes = erg + ergN;
    System.out.println(ergGes);
}
    public void renn() {
        String AuswahlUser = "empty";       
                                            

        boolean Schleife = true;
        while (Schleife) {
            try {                               
                Thread.sleep(450);
            } catch (InterruptedException e) {  
                e.printStackTrace();
            }

            System.out.println("Bitte geben sie fak für Fakultät und n um alpha^n zu rechnen ein, nf für zweihoch n + fakultät n oder break um das Programm zu beenden.");
            AuswahlUser = scanni.nextLine(); 

            switch (AuswahlUser) { 
                
                case "n":
                    alphaHochN(); 
                    break;
                case "nf":
                    zweiHochnPlusFakultaet();
                break;
                case "fak":
                    Fakultaet();
                    break;
                case "break":
                    Schleife = false;
                    break;
                case "":                      //Notlösung weil der Scanner immer einmal leer ist und nur jede zweite Runde funktioniert
                    System.out.println("----------------------------------------------------------------------");
                    try {                               
                        Thread.sleep(450);
                    } catch (InterruptedException e) {  
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Leider ist ihre Auswahl nicht gültig. \n Bitte geben sie fak für Fakultät und n um alpha^n zu rechnen ein.");
            }
        }

    }


}


