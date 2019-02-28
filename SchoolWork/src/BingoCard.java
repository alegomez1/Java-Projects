public class BingoCard
{
    //These ints are initialized to random numbers between
    private int bNum1;
    private int bNum2;
    private int bNum3;
    private int bNum4;
    private int bNum5;

    private int iNum1;
    private int iNum2;
    private int iNum3;
    private int iNum4;
    private int iNum5;

    private int nNum1;
    private int nNum2;
    private int nNum3;
    private int nNum4;
    private int nNum5;

    private int gNum1;
    private int gNum2;
    private int gNum3;
    private int gNum4;
    private int gNum5;

    private int oNum1;
    private int oNum2;
    private int oNum3;
    private int oNum4;
    private int oNum5;

    public BingoCard()
    {
        //Constructor for a BingoCard
        //Generate a random number for each instance variable in the Bingo Card, using
        //the following range of numbers:

        // "B" (numbers 1–15), "I" (numbers 16–30),
        // "N" (numbers 31–45), "G" (numbers 46–60),
        // and "O" (numbers 61–75).
    }

    public int getbNum1() {
        return bNum1;
    }

    public int getbNum2() {
        return bNum2;
    }

    public int getbNum3() {
        return bNum3;
    }

    public int getbNum4() {
        return bNum4;
    }

    public int getbNum5() {
        return bNum5;
    }

    public int getiNum1() {
        return iNum1;
    }

    public int getiNum2() {
        return iNum2;
    }

    public int getiNum3() {
        return iNum3;
    }

    public int getiNum4() {
        return iNum4;
    }

    public int getiNum5() {
        return iNum5;
    }

    public int getnNum1() {
        return nNum1;
    }

    public int getnNum2() {
        return nNum2;
    }

    public int getnNum3() {
        return nNum3;
    }

    public int getnNum4() {
        return nNum4;
    }

    public int getnNum5() {
        return nNum5;
    }

    public int getgNum1() {
        return gNum1;
    }

    public int getgNum2() {
        return gNum2;
    }

    public int getgNum3() {
        return gNum3;
    }

    public int getgNum4() {
        return gNum4;
    }

    public int getgNum5() {
        return gNum5;
    }

    public int getoNum1() {
        return oNum1;
    }

    public int getoNum2() {
        return oNum2;
    }

    public int getoNum3() {
        return oNum3;
    }

    public int getoNum4() {
        return oNum4;
    }

    public int getoNum5() {
        return oNum5;
    }

    public void setbNum1(int bNum1) {
        this.bNum1 = bNum1;
    }

    public void setbNum2(int bNum2) {
        this.bNum2 = bNum2;
    }

    public void setbNum3(int bNum3) {
        this.bNum3 = bNum3;
    }

    public void setbNum4(int bNum4) {
        this.bNum4 = bNum4;
    }

    public void setbNum5(int bNum5) {
        this.bNum5 = bNum5;
    }

    public void setiNum1(int iNum1) {
        this.iNum1 = iNum1;
    }

    public void setiNum2(int iNum2) {
        this.iNum2 = iNum2;
    }

    public void setiNum3(int iNum3) {
        this.iNum3 = iNum3;
    }

    public void setiNum4(int iNum4) {
        this.iNum4 = iNum4;
    }

    public void setiNum5(int iNum5) {
        this.iNum5 = iNum5;
    }

    public void setnNum1(int nNum1) {
        this.nNum1 = nNum1;
    }

    public void setnNum2(int nNum2) {
        this.nNum2 = nNum2;
    }

    public void setnNum3(int nNum3) {
        this.nNum3 = nNum3;
    }

    public void setnNum4(int nNum4) {
        this.nNum4 = nNum4;
    }

    public void setnNum5(int nNum5) {
        this.nNum5 = nNum5;
    }

    public void setgNum1(int gNum1) {
        this.gNum1 = gNum1;
    }

    public void setgNum2(int gNum2) {
        this.gNum2 = gNum2;
    }

    public void setgNum3(int gNum3) {
        this.gNum3 = gNum3;
    }

    public void setgNum4(int gNum4) {
        this.gNum4 = gNum4;
    }

    public void setgNum5(int gNum5) {
        this.gNum5 = gNum5;
    }

    public void setoNum1(int oNum1) {
        this.oNum1 = oNum1;
    }

    public void setoNum2(int oNum2) {
        this.oNum2 = oNum2;
    }

    public void setoNum3(int oNum3) {
        this.oNum3 = oNum3;
    }

    public void setoNum4(int oNum4) {
        this.oNum4 = oNum4;
    }

    public void setoNum5(int oNum5) {
        this.oNum5 = oNum5;
    }

    public boolean gotBingo()
    {
        //when a game is being played, if the letter and number match
        //the letter and number called out, its value will be zeroed out
        //to simulate placing a button on that location.

        //to determine if the card has BINGO, one of the following conditions must be true:
        //1. Vertical:  bNum1, bNum2, bNum3, bNum4, and bNum5 must all be 0's OR
        //              iNum1, iNum2, iNum3, iNum4, and iNum5 must all be 0's OR
        //              nNum1, nNum2, nNum3, nNum4, and nNum5 must all be 0's OR
        //              gNum1, gNum2, gNum3, gNum4, and gNum5 must all be 0's OR
        //              oNum1, oNum2, oNum3, oNum4, and oNum5 must all be 0's

        //2.  Horizontal:  bNum1, iNum1, nNum1, gNum1, and oNum1 must all be 0's OR
        //                 bNum2, iNum2, nNum2, gNum2, and oNum2 must all be 0's OR
        //                 bNum3, iNum3, nNum3, gNum3, and oNum3 must all be 0's OR
        //                 bNum4, iNum4, nNum4, gNum4, and oNum4 must all be 0's OR
        //                 bNum5, iNum5, nNum5, gNum5, and oNum5 must all be 0's

        //3.  Diagonal:    bNum1, iNum2, nNum3, gNum4, and oNum5 must all be 0's OR
        //                 bNum5, iNum4, nNum3, gNum2, and oNum1 must all be 0's

        //When any of the above 12 conditions are true, return true.  Otherwise, return false;

        return false;
    }

    public String toString()
    {

        return "BingoCard{" +
                "bNum1=" + bNum1 +
                ", bNum2=" + bNum2 +
                ", bNum3=" + bNum3 +
                ", bNum4=" + bNum4 +
                ", bNum5=" + bNum5 +
                ", iNum1=" + iNum1 +
                ", iNum2=" + iNum2 +
                ", iNum3=" + iNum3 +
                ", iNum4=" + iNum4 +
                ", iNum5=" + iNum5 +
                ", nNum1=" + nNum1 +
                ", nNum2=" + nNum2 +
                ", nNum3=" + nNum3 +
                ", nNum4=" + nNum4 +
                ", nNum5=" + nNum5 +
                ", gNum1=" + gNum1 +
                ", gNum2=" + gNum2 +
                ", gNum3=" + gNum3 +
                ", gNum4=" + gNum4 +
                ", gNum5=" + gNum5 +
                ", oNum1=" + oNum1 +
                ", oNum2=" + oNum2 +
                ", oNum3=" + oNum3 +
                ", oNum4=" + oNum4 +
                ", oNum5=" + oNum5 +
                '}';

        //1.  Print the content of the Bingo Card, ensuring the display is formatted as follows:
        //    bNum1  iNum1  nNum1  gNum1  oNum1
        //    bNum2  iNum2  nNum2  gNum2  oNum2
        //    bNum3  iNum3  nNum3  gNum3  oNum3
        //    bNum4  iNum4  nNum4  gNum4  oNum4
        //    bNum5  iNum5  nNum5  gNum5  oNum5
    }


}
