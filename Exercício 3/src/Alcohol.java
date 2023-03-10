public class Alcohol {
  private double price = 4.9;
  private double discountBelowTwentyLiters = 0.03;
  private int litersToIncreaseTheDiscount = 20;
  private double discountOverTwentyLiters = 0.05;

  // Methods
  public double purchasePrice(double literBought) {
    if(literBought >= litersToIncreaseTheDiscount) {
      return literBought * price * (1 - discountBelowTwentyLiters);
    }
    return literBought * price * (1 - discountOverTwentyLiters);
  }


}
