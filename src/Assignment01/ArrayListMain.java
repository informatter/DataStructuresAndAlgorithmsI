package src.Assignment01;

public class ArrayListMain
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int [] b = {3,8,5,1,14};

        for (int i : b) {

           // arrayList.addToBack(i);

           arrayList.addToFront(i);
        }

        arrayList.removeFromFront();

    }

}