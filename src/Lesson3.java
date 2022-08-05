public class Lesson3 
{
    public static void main (String[] args)
	{
		Object[] ArrayList = new Object[10];
		Object[] ArrayListWeighty = new Object[ArrayList.size];
		int SortWeight;
		int j=0;
		for (int i=0; i<ArrayList.size; i++)
			{
				ArrayList[i] = new Box();
			}
		for (int i=0; i<ArrayList.size; i++)
			{
				if(ArrayList[i].Weight > SortWeight);
					{
						ArrayListWeighty[j]=ArrayList[i];
						j++;
						ArrayList.remove(i);
					}
			}
		System.Out.Println ("Box весом не более 300 гр.:");
		for (int i=0; i<ArrayList.size; i++)
			{
				System.Out.Println ("Box №" + i+ " весом "+ ArrayList[i].Weight + "гр.");
			}
		System.Out.Println ("Box весом более 300 гр.:");
		for (int i=0; i<ArrayListWeighty.size; i++)
			{
				System.Out.Println ("Box №" + i+ " весом "+ ArrayListWeighty[i].Weight + "гр.");
			}
    }
}


public class Box{
	int Weight = random.nextint(500);//вес в гр.
    int Height = random.nextint(100);//высота
	int Width = random.nextint(100);;//ширина
	int Depth = random.nextint(100);;//глубина
}
