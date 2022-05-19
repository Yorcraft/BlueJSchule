
public class EigenerStuff
{
public int[] arraySort(int[] f)
{
    int temp;
    int addi;
    int wiederhole = f.length;
    while (wiederhole>0){
for(int i = 0; i< f.length; i++)
{
    
    addi =i+1;
    if (addi<f.length)
  {
    if (f[i]<f[addi])
    {
        temp = f[i];
        f[i]= f[addi];
        f[addi]=temp;
    }
}

}
wiederhole = wiederhole-1;
}
return f;
}

public void diskri(int a, int b, int c){
        int erg=0;
        if (b*b-4*a*c>=0){
            System.out.println("das passt");
        } else {
            System.out.println("geht nicht");
        }

    }

public float[] array(float[]S, float[]N){
   
    for(int i=0; i<S.length;i++)
    {
        if(N[i]!=0)
        {
            S[i] = S[i]/N[i];
        }
        else
        {
            System.out.println("geht nicht");
        }
    }
   return S;
}

    
}
