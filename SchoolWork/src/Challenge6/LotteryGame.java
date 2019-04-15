package Challenge6;

public class LotteryGame {

    public static void main(String[] args) {

        Lottery lotto = new Lottery();


        lotto.getUserPicks();

        System.out.printf("Lotto numbers are: %d %d %d %d %d %d\n", lotto.lotteryNumbers[0], lotto.lotteryNumbers[1], lotto.lotteryNumbers[2], lotto.lotteryNumbers[3], lotto.lotteryNumbers[4], lotto.lotteryNumbers[5]);

        System.out.printf("Your numbers are: %d %d %d %d %d %d\n", lotto.userLotteryPicks[0],lotto.userLotteryPicks[1],lotto.userLotteryPicks[2],lotto.userLotteryPicks[3],lotto.userLotteryPicks[4], lotto.userLotteryPicks[5]);

        lotto.setNum1(lotto.userNum1);

        System.out.println("The amount of matches is: " + lotto.checkLotteryMatch());

    }
}
