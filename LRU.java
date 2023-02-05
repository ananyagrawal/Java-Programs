import java.util.*;
public class LRU
{
    int [] p;
    int[] fr;
    int[] fs;
    int n,m,index,k,l,i,j;
    int frameSize = 3;
    int pf=0;

    int flag1=0;
    int flag2=0;

    Scanner src=new Scanner(System.in);
    void read()
    {
        n=10;
        p=new int[10];
        for(int i=0;i<n;i++) {
            p[i] = ((int)(Math.random()*11));
        }
        m=3;
        fr=new int[m];
        fs=new int[m];
    }
    void display()
    {
        System.out.println("\n");
        for(i=0;i<m;i++)
        {
            if(fr[i]==-1)
                System.out.println("[ ]");
            else {
                System.out.println("[" + fr[i] + "]");
            }
        }
    }
    void lru()
    {
        for(i=0;i<m;i++)
        {
            fr[i]=-1;
        }
        for(j=0;j<n;j++)
        {
            flag1=0;flag2=0;
            for(i=0;i<m;i++)
            {
                if(fr[i]==p[j])
                {
                    flag1=1; flag2=1;
                    break;
                }
            }
            if(flag1==0)
            {
                for(i=0;i<m;i++)
                {
                    if(fr[i]==-1)
                    {
                        fr[i]=p[j];
                        flag2=1;
                        break;
                    }
                }
            }
            if(flag2==0)
            {
                for(i=0; i< frameSize; i++)
                    fs[i]=0;
                for(k=j-1,l=1; l<= frameSize -1; l++,k--){
                    for(i=0;i<3;i++)
                    {
                        if(fr[i]==p[k]) fs[i]=1;
                    }
                }
                for(i=0;i<3;i++)
                {
                    if(fs[i]==0) index=i;
                }
                fr[index]=p[j];
                pf++;
            }
            System.out.print("Page :"+p[j]); display();
        }
        System.out.println("\n Number of page fault:"+pf);
    }
    public static void main(String[] args)
    {
        LRU a=new LRU();
        a.read();
        a.lru();
        a.display();
    }
}