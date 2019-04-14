package Challenge6;

public class LotteryGame {

    public static void main(String[] args) {

        Lottery lotto = new Lottery();


        lotto.getUserPicks();

        System.out.printf("Lotto numbers are: %d %d %d %d %d %d\n", lotto.getNum1(), lotto.getNum2(), lotto.getNum3(), lotto.getNum4(), lotto.getNum5(), lotto.getNum6());

        System.out.printf("Your numbers are: %d %d %d %d %d %d\n", lotto.userLotteryPicks[0],lotto.getUserNum2(),lotto.getUserNum3(),lotto.getUserNum4(),lotto.getUserNum5(),lotto.getUserNum6());

        lotto.setNum1(lotto.userNum1);

        System.out.println("The amount of matches is: " + lotto.checkLotteryMatch());

    }
}
