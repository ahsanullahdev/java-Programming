package casestudywp;

import java.util.Random;

public class CaseStudyWP 
{
    public static void main(String[] args) 
    {
        Animal[] an = new Animal[100];
        Random rd = new Random();
        for(int i=0;i<100; i++)
        {
            int op=rd.nextInt(3)+1;
            if(op==1)
            {
                an[i] = new Bird();
            }
            else
                if(op==2)
                {
                    an[i]=new Frog();
                }
            else
                if(op==3)
                {
                    an[i]= new Snake();
                }
        }
        for(int i=0;i<an.length;i++)
        {
            an[i].move();
        }
            
    } 
}
