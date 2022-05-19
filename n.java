
public class n
{
public void alphaHochN(int n,int alpha)
{
    
    int multiplier = alpha;
    double erg = 1;
    
    if (n>0){
    for(int wiederholung = 1; wiederholung<=n; wiederholung++)
    {
        erg = erg*multiplier;
    }
    System.out.println(erg);
}
else if (n==0)
    {
    System.out.println(1);
}
else {
    n = Math.abs(n);
   for(int wiederholung = 1; wiederholung<=n; wiederholung++)
    {
        erg = erg*multiplier;
    }
    erg = 1/erg;
    System.out.println(erg);
}
}
}

