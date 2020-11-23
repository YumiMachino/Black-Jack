package sample.model;
import java.util.ArrayList;


public class Dealer {

  private String name;
  private ArrayList<Card> hand;
  private int sum;

  public Dealer(String name, ArrayList<Card> hand, int sum){
    this.name= name;
    this.hand= hand;
    this.sum = sum;
  }



}
