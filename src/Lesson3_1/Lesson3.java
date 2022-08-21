import java.util.Random;

public class Lesson3
{
    public static void main (String[] args)
    {
        int BoxQantity=10;
        int SortWeight=300;
        Box[] ArrayList = new Box[BoxQantity];
        Box[] ArrayListWeighty = new Box[ArrayList.length];
        int j=0;
        for (int i=0; i<ArrayList.length; i++)
        {
            Random rn = new Random();
            int Weight = rn.nextInt(500) + 1;//вес в гр.
            int Height = rn.nextInt(500) + 1;//высота
            int Width = rn.nextInt(500) + 1;//ширина
            int Depth = rn.nextInt(500) + 1;//глубина
            ArrayList[i] = new Box(Weight, Weight, Width,Depth);
            System.out.println (i + " - "+ ArrayList[i].Weight + "гр. ");
        }
        for (int i=0; i<ArrayList.length; i++)
        {
            if(ArrayList[i]==null){}
            else if(ArrayList[i].Weight > SortWeight)
            {
                ArrayListWeighty[j]=ArrayList[i];
                j++;
                for (int q=i; q<ArrayList.length; q++)
                {
                    if (q==ArrayList.length-1)
                    {
                        ArrayList[q]=null;
                    }
                    else if(ArrayList[q+1]==null)
                    {
                        ArrayList[q]=null;
                    }
                    else
                    {
                        ArrayList[q]=ArrayList[q+1];
                    }
                }
                i--;
            }
        }
        System.out.println ("Box весом не более 300 гр.:");
        for (int i=0; i<ArrayList.length; i++)
        {
            if(ArrayList[i]==null){}
            else{
                System.out.println ("Box №" + i + " весом "+ ArrayList[i].Weight + "гр.");
                }
        }
        System.out.println ("Box весом более 300 гр.:");
		for (int i=0; i<ArrayListWeighty.length; i++)
			{
                if(ArrayListWeighty[i]==null){}
                else{
				    System.out.println ("Box №" + i+ " весом "+ ArrayListWeighty[i].Weight + "гр.");
                    }
			}
    }
}