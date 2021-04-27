package src.Assignment01;

public class ArrayListMain
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int [] testB = new int[36];

        for (int i = 0; i < testB.length; i++) {

            testB[i] = i;        
        }     

    
        //int [] b = {3,5,8,1,14};

        for (int i : testB) {

           //arrayList.addToBack(i);

           arrayList.addToFront(i);
        }

        //arrayList.removeFromFront();

    }

}