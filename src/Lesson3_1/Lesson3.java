import java.util.Random;

public class Lesson3
{
    public static void main (String[] args)
    {
        Box[] ArrayList = new Box[10];
        Box[] ArrayListWeighty = new Box[ArrayList.length];
        int SortWeight=300;
        int j=0;
        for (int i=0; i<ArrayList.length; i++)
        {
            Random rn = new Random();
            int Weight = rn.nextInt(500) + 1;//вес в гр.
            int Height = rn.nextInt(500) + 1;//высота
            int Width = rn.nextInt(500) + 1;;//ширина
            int Depth = rn.nextInt(500) + 1;;//глубина
            //System.out.println ("вес:" + Weight + " длина:" + Height + " ирина"  + Width);
            ArrayList[i] = new Box(Weight, Weight, Width,Depth);
            System.out.println (i + " - "+ ArrayList[i].Weight + "гр. ");
        }
        System.out.println ("Цикл:");
        for (int i=0; i<ArrayList.length; i++)
        {
            if(ArrayList[i].Weight > SortWeight)
            {
                System.out.println ("Box №" + i +"    весом "+ArrayList[i].Weight + "гр. больше чем"+ SortWeight);
                ArrayListWeighty[j]=ArrayList[i];
                System.out.println ("Box №" + j +"    весом "+ArrayListWeighty[j].Weight + "гр.");
                j++;
                System.out.println ("Считаем:");
                for (int k=i+1; k<ArrayList.length; k++)
                {
                    int q=k-1;
                    System.out.println ("До смещения" + q +"    весом "+ArrayList[k-1].Weight + "гр.");
                    System.out.println ("Следующий" + k +"    весом "+ArrayList[k].Weight + "гр.");
                    if(ArrayList[k]==null)
                    {
                        System.out.println ("Нуль:");
                        ArrayList[k-1]=null;
                    }
                    /*else if(k==ArrayList.length-1)
                    {
                        ArrayList[k-1]=null;
                        System.out.println ("Обнулил 9" + q);
                    }*/
                    else
                    {
                        ArrayList[k-1]=ArrayList[k];
                        System.out.println ("После смещения" + q +"    весом "+ArrayList[k-1].Weight + "гр.");
                    }
                }
            }
        }
        System.out.println ("Box весом не более 300 гр.:");
        for (int i=0; i<ArrayList.length; i++)
        {
            int k=i+1;
            System.out.println ("Box №" + k + " весом "+ ArrayList[i].Weight + "гр.");
        }
		System.out.println ("Box весом более 300 гр.:");
		/*for (int i=0; i<ArrayListWeighty.length; i++)
			{
				System.out.println ("Box №" + i+ " весом "+ ArrayListWeighty[i].Weight + "гр.");
			}*/
    }
}