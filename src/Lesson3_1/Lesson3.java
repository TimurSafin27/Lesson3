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
            int Weight = rn.nextInt(500) + 1;//��� � ��.
            int Height = rn.nextInt(500) + 1;//������
            int Width = rn.nextInt(500) + 1;;//������
            int Depth = rn.nextInt(500) + 1;;//�������
            //System.out.println ("���:" + Weight + " �����:" + Height + " �����"  + Width);
            ArrayList[i] = new Box(Weight, Weight, Width,Depth);
            System.out.println (i + " - "+ ArrayList[i].Weight + "��. ");
        }
        System.out.println ("����:");
        for (int i=0; i<ArrayList.length; i++)
        {
            if(ArrayList[i].Weight > SortWeight)
            {
                System.out.println ("Box �" + i +"    ����� "+ArrayList[i].Weight + "��. ������ ���"+ SortWeight);
                ArrayListWeighty[j]=ArrayList[i];
                System.out.println ("Box �" + j +"    ����� "+ArrayListWeighty[j].Weight + "��.");
                j++;
                System.out.println ("�������:");
                for (int k=i+1; k<ArrayList.length; k++)
                {
                    int q=k-1;
                    System.out.println ("�� ��������" + q +"    ����� "+ArrayList[k-1].Weight + "��.");
                    System.out.println ("���������" + k +"    ����� "+ArrayList[k].Weight + "��.");
                    if(ArrayList[k]==null)
                    {
                        System.out.println ("����:");
                        ArrayList[k-1]=null;
                    }
                    /*else if(k==ArrayList.length-1)
                    {
                        ArrayList[k-1]=null;
                        System.out.println ("������� 9" + q);
                    }*/
                    else
                    {
                        ArrayList[k-1]=ArrayList[k];
                        System.out.println ("����� ��������" + q +"    ����� "+ArrayList[k-1].Weight + "��.");
                    }
                }
            }
        }
        System.out.println ("Box ����� �� ����� 300 ��.:");
        for (int i=0; i<ArrayList.length; i++)
        {
            int k=i+1;
            System.out.println ("Box �" + k + " ����� "+ ArrayList[i].Weight + "��.");
        }
		System.out.println ("Box ����� ����� 300 ��.:");
		/*for (int i=0; i<ArrayListWeighty.length; i++)
			{
				System.out.println ("Box �" + i+ " ����� "+ ArrayListWeighty[i].Weight + "��.");
			}*/
    }
}