

import java.util.Scanner; 
public class AlleBeispieleVeraltet
{
private Fakultaet fak1; 
private n alpha1;
public void Auswahlmodus(){
System.out.println("Bitte geben sie fak für Fakultät und n um alpha^n zu rechnen ein."); //gibt Text aus
Scanner scanni = new Scanner(System.in); 
String AuswahlUser = scanni.nextLine(); 
    switch(AuswahlUser){                
    case "n":
        alpha1 = new n();
        break; 
    case "fak":
        fak1 = new Fakultaet();
        break;
    default:
        System.out.println("Leider ist ihre Auswahl nicht gültig. \n Bitte geben sie fak für Fakultät und n um alpha^n zu rechnen ein. ");
    }
}
}
