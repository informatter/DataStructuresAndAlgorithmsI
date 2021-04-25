package src.Assignment01;

public class ArrayListMain
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int [] b = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        for (int i : b) {

           // arrayList.addToBack(i);

           //arrayList.addToFront(i);
        }

        arrayList.removeFromFront();

    }

}