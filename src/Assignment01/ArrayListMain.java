package src.Assignment01;

public class ArrayListMain
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int [] a = {1,2,3,4,5,6,7,8,9,10,11};

        for (int i : a) {

            arrayList.addToBack(i);
        }
        
        arrayList.removeFromFront();

    }
}