
public class Arrays
{
    public static void main (String[] args)
    {
        int[] a1;
        a1 = new int[5];
        
        a1[0] = 10;
        a1[1] = 20;
        a1[4] = 30;

        for (int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }

        System.out.println();

        int a2[] = new int[3];

        for(int i = 0; i < a2.length; i++){
            System.out.println(a2[i] = i+2);
        }

    }
  
}
