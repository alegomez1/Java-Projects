package OldStuff;

/**
 *  This is the constructor class that ties in to the OldStuff.MidtermPractice driver class
 */
public class SlotMachine
{
    private int ranNum1;
    private int ranNum2;
    private int ranNum3;

    public SlotMachine()
    {
        ranNum1 = 0;
        ranNum2 = 0;
        ranNum3 = 0;
    }

//  These are the getters and setters
    public int getRanNum1()
    {
        return ranNum1;
    }

    public int getRanNum2()
    {
        return ranNum2;
    }

    public int getRanNum3()
    {
        return ranNum3;
    }

    public void setRanNum1(int aRanNum1)
    {
        ranNum1 = aRanNum1;
    }

    public void setRanNum2(int aRanNum2)
    {
        ranNum2 = aRanNum2;
    }

    public void setRanNum3(int aRanNum3)
    {
        ranNum3 = aRanNum3;
    }

    //This is the toString() method that displays what the three random numbers that were generated are
    public String toString()
    {
        return "You pulled the handle, and the slot machine gave you these 3 numbers: \n" + ranNum1 + " " + ranNum2 + " " + ranNum3;
    }
}
