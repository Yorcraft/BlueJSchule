public class Fakultaet
{
    public void Fakultaet (int n)
    {
        if (n>0)
        {
        long erg = n;
        n=n-1;
        for(int nf = n; nf>0; nf = nf-1) 
        {  
            erg = erg*nf;
        }
        System.out.println(erg);
    }
    else if (n<0)
        {
        n = Math.abs(n);
        long erg = n;
        n=n-1;
        for(int nf = n; nf>0; nf = nf-1) 
        {  
            erg = erg*nf;
        }
        erg = erg*-1;
        System.out.println(erg);
    }
    else if (n==0)
        {
            System.out.println(n);
        }
    }
}