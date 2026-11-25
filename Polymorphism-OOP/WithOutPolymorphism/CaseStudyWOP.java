package casestudywop;

import java.util.Random;

public class CaseStudyWOP
{

    public static void main(String[] args) 
    {
         Bird[] bird = new Bird[100];
         int bcount = 0;
         Frog[] frog = new Frog[100];
         int fcount = 0;
         Random rd = new Random();
         for(int i=0; i<100 ; i++)
         {
            int op =rd.nextInt(2)+1;
           if(op==1)
           {
              bird[bcount]= new Bird();
              bcount++;
           }
           if(op==2)
           {
              frog[fcount]= new Frog();
              fcount++;
           }
         }
         System.out.printf("Total Birds %d\n",bcount);
         for(int i=0; i<bcount; i++)
         {
            bird[i].move();
         }
         System.out.printf("Total Frogs %d\n",fcount);
         for(int i=0; i<fcount; i++)
         {
           frog[i].move();
         }
         
    }
    
}
