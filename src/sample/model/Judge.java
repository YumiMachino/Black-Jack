package sample.model;
import java.util.ArrayList;
/**
 * This is to judge the end of game: WIN/BUST/PUSH
 */
public class Judge extends Player {

    public Judge(String name, ArrayList<Card> hand,  int sum){
        super(name, hand, sum);
    }


    public static boolean isBlackJack(ArrayList<Player> players, String name){
        for (int i = 0; i < players.size(); i++){
            if (players.get(i).getName().equals(name)){
                if(players.get(i).getSum() == 21){
                    return true;
                }
            }
        }
        return false;
    }


//    public static void gameResult(ArrayList<Player> players) {
//        int player1Sum = players.get(0).getSum();
//        int player2Sum = players.get(1).getSum();
//        int dealerSum = players.get(2).getSum();


        // BlackJackの確認は最初の手札が21か確認する用
        // BlackJackのplayerはWin, out of the game -> player win


        // 各HITの後にSumが21を超えないか確認
        // 21超えたユーザーはBust, out of the game　-> Buttonをdisableにする


        // PlayerがStandをクリックした後　-> Dealer足りなかったら引く　-> Sumの比較
        // -> Dealer bustでevery players win
        // (DealerがBustしてなかったらプレーヤーの中でDealerよりもより21に近い方が勝ち






        // 1. Player1 BLACKJACK -> 最初に配られた二枚のカードで21
        // 2. Player2 BLACKJACK
        // 3. Dealer BLACKJACK
        // 4. Player1 WIN (Player1Sum <= 21, DealerSum > 21) Dealer BUST
        // 5. Player2 WIN (Player2Sum <= 21, DealerSum > 21) Dealer BUST
        // 6. Dealer WIN (Player1 > 21)  Player1 BUST
        // 7. Dealer WIN (Player2 > 21)  Player2 BUST
        // 8. PUSH (Player1Sum == DealerSum || Player1Sum <= 21, DealerSUm <= 21)
        // 9. Player1 WIN (Player1Sum <= 21 && DealerSUm <= 21)でPlayer1の方が21に近い
        // 10. Dealer WIN (Player1Sum <= 21 && DealerSUm <= 21)でdealerの方が21に近い
        // 11. Player2 WIN (Player2Sum <= 21 && DealerSUm <= 21)でPlayer2の方が21に近い
        // 12. Dealer WIN (Player2Sum <= 21 && DealerSUm <= 21)でdealerの方が21に近い




        // if BlackJack
//        if(player1Sum == 21){
//            System.out.println("player1 BlackJack!");
//        } else if(player2Sum == 21){
//            System.out.println("player2 BlackJack!");
//        } else if(dealerSum == 21){
//            System.out.println("dealer BlackJack!");
//        }
//        if (player1Sum <= 21 && dealerSum > 21){
//            System.out.println("Player1 Win! and Dealer Bust!");
//        } else if (player2Sum <= 21 && dealerSum > 21){
//            System.out.println("player2 Win! and Dealer Bust!");
//        }
//        if(player1Sum <= 21 && dealerSum <= 21){
//            int player1 = 21 - player1Sum;
//            int dealer = 21 - dealerSum;
//            if (player1 == dealer){
//                System.out.println("PUSH");
//            } else if (player1 < dealer){
//                System.out.println("player1 won");
//            } else {
//                System.out.println("dealer won");
//            }
//        }
//        if(player2Sum <= 21 && dealerSum <= 21){
//            int player2 = 21 - player1Sum;
//            int dealer = 21 - dealerSum;
//            if (player2 == dealer){
//                System.out.println("PUSH");
//            } else if (player2 < dealer){
//                System.out.println("player2 won");
//            } else {
//                System.out.println("dealer won");
//            }
//        }
//        if (player1Sum > 21 && dealerSum > 21){
//            System.out.println("PUSH");
//        }
//        if (player2Sum > 21 && dealerSum > 21){
//            System.out.println("PUSH");
//        }
//    }
    // Ger result method Here (depends on the sum of the deck)
    // - One bust: One player sum <= 21 & the other sum > 21
    // - both not bust: one player sum <=21 & the other sum <= 21 -> Which ever closer to 21, wins
    // - both bust (PUSH: one player sum > 21 & the other sum > 21 & one player sum <= 21 & the other sum <= 21
    // when sum == 21 -> BlackJack
    // // When onPlay is false (-> Play again)
}
