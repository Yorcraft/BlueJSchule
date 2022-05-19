


public class EinfacheVersion
{
    private int x;

    /**
     * Konstruktor für Objekte der Klasse EinfacheVersion
     */
    public int zweiHochN(int n)
    {
        int erg =1;
        for(int i=1; i<=n;i++)
        {
            erg = erg*2;
        }
        return(erg);
    }

   public int fakultaet(int n)
    {
        int erg =1;
        for(int i=1; i<=n;i++)
        {
            erg = erg*i;
        }
        return(erg);
    }
    
    public long zweiHochNundFakulaet (int n){
        long fak1 =fakultaet(n);
        long n1 =zweiHochN(n);
        long ges = n1 + fak1;
        return(ges);
    }
    
    
public void ineinerfor(int n)
{
    int erg =1;
    int erg2 =1;
        for(int i=1; i<=n;i++)
        {
            erg = erg*2;
            erg2 = erg2*i;
        }
        System.out.println(erg);
        System.out.println(erg2);
       
}

public void array(int[] f, int[] f1){
    
   int[] F = new int[f.length];
   
   for(int i = 0; i<f.length; i++)
   {
       F[i] = f[i] + f1[i];
   }
   for(int i = 0; i<f.length; i++)
   {
       System.out.println(F[i]);
   }
}

public int[] arrayDefne(int[]S, int[]N){
    
   int[] F = new int[S.length];
   for(int i=0; i<S.length;i++)         
   {
       F[i] = S[i] + N[i];
   }
   return F;
}







//WIEDERHOLUNG
public void zhn(int n)          //2^n
{
    int erg =1;

        for(int i=0; i<n; i++)
        {
            erg = erg*2;
        }
        System.out.println(erg);

}

public void faku(int n)         //n Fakultät
{
    int erg =1;

        for(int i=1; i<=n; i++)
        {
            erg = erg*i;
        }
        System.out.println(erg);    
}

public void add(int n)          //1 + 2 + 3 ... + n
{
    int erg =0;

        for(int i=0; i<=n; i++)
        {
            erg = erg+i;
        }
        System.out.println(erg);

}

public int[] ArrayAddSchwer(int[] f, int[] f1)        //Werte zweier Listen addieren un in eine neu Schreiben
{
    int[] F = new int[f.length];

        for(int i=0; i<f.length; i++)
        {
            if (i<f1.length){
                F[i] = f[i] + f1[i];
            }
            else {
                F[i] = f[i];
            }
        }
    return F;  
}

public int[] ArrayAddEinfach(int[] f, int[] f1)        //Werte zweier Listen addieren un in eine neu Schreiben
{
    int[] F = new int[f.length];

        for(int i=0; i<f.length; i++)
        {
                F[i] = f[i] + f1[i];
        }
    return F;  
}
public int fakUzhn(int n)          //n Fakultät + 2^n (in einer for loop)
{
    int erg =1;
    int erg1 =1;
        for(int i=1; i<=n; i++)
        {
            erg = erg*2;
            erg1 = erg1*i;
        }
        return erg+erg1;

}

public int findeKleinste(int[] f)       //kleinste zahl einer Liste finden
{
       int erg = f[0];
        for(int i=1; i<f.length; i++)
        {
            if (f[i]< erg)
            {
                erg = f[i];
            }
        }

return erg;
}

//POST TEST

public int findeAnzahl(int[] f, int Zahl)       //Anzahl der Zahl in Array f finden
{
      
       int counter = 0;
        for(int i=0; i<f.length; i++)
        {
            if (f[i] == Zahl)
            {
                counter++;
            }
        }

return counter;
}

public int [] ersetze(int[] f, int Zahl, int ZahlErsetzen){

        for(int i=0; i<f.length; i++)
        {
            if (f[i] == Zahl)
            {
                f[i]=ZahlErsetzen;
            }
        }
        return f;
}


public int [] mitteschwer(int[] f){
    int l = f.length-1;
    int l1 = 0;
    int temp;
    
    while(l!=l1)
    {
    temp=f[l];
    f[l]=f[l1];
    f[l1]=temp;
    l1++;
    l--;
    }
    return f;  

}

public int [] mittelSchwer2(int[] f){
    int[] F = new int[f.length];
    int l = f.length-1;    
   for(int i=0; i<f.length; i++)
        {
            F[i]=f[l];
            l--;
        }
return F;
}

}