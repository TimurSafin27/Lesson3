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
            int Weight = rn.nextInt(500) + 1;//âåñ â ãð.
            int Height = rn.nextInt(500) + 1;//âûñîòà
            int Width = rn.nextInt(500) + 1;;//øèðèíà
            int Depth = rn.nextInt(500) + 1;;//ãëóáèíà
            //System.out.println ("âåñ:" + Weight + " äëèíà:" + Height + " èðèíà"  + Width);
            ArrayList[i] = new Box(Weight, Weight, Width,Depth);
            System.out.println (i + " - "+ ArrayList[i].Weight + "ãð. ");
        }
        System.out.println ("Öèêë:");
        for (int i=0; i<ArrayList.length; i++)
        {
            if(ArrayList[i].Weight > SortWeight)
            {
                System.out.println ("Box ¹" + i +"    âåñîì "+ArrayList[i].Weight + "ãð. áîëüøå ÷åì"+ SortWeight);
                ArrayListWeighty[j]=ArrayList[i];
                System.out.println ("Box ¹" + j +"    âåñîì "+ArrayListWeighty[j].Weight + "ãð.");
                j++;
                System.out.println ("Ñ÷èòàåì:");
                for (int q=i; q<ArrayList.length; q++)
                {
                    int k=q+1;
                    System.out.println ("Äî ñìåùåíèÿ" + q +"    âåñîì "+ArrayList[q].Weight + "ãð.");
                    System.out.println ("Ñëåäóþùèé" + k +"    âåñîì "+ArrayList[k].Weight + "ãð.");
                    if (q=ArrayList.length)
		    {
			ArrayList[q]=null
		    }
		    else if(ArrayList[k]==null)
                    {
                        System.out.println ("Íóëü:");
                        ArrayList[q]=null;
                    }
                    else
                    {
                        ArrayList[q]=ArrayList[k];
                        System.out.println ("Ïîñëå ñìåùåíèÿ" + q +"    âåñîì "+ArrayList[q].Weight + "ãð.");
                    }
                }
            }
        }
        System.out.println ("Box âåñîì íå áîëåå 300 ãð.:");
        for (int i=0; i<ArrayList.length; i++)
        {
            int k=i+1;
            System.out.println ("Box ¹" + k + " âåñîì "+ ArrayList[i].Weight + "ãð.");
        }
		System.out.println ("Box âåñîì áîëåå 300 ãð.:");
		/*for (int i=0; i<ArrayListWeighty.length; i++)
			{
				System.out.println ("Box ¹" + i+ " âåñîì "+ ArrayListWeighty[i].Weight + "ãð.");
			}*/
    }
}
