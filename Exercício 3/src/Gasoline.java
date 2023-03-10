public class Gasoline {
  private double price = 6;
  private double discountBelowTwentyLiters = 0.04;
  private int litersToIncreaseTheDiscount = 20;
  private double discountOverTwentyLiters = 0.06;

  // Methods
  public double purchasePrice(double literBought) {
    if(literBought >= litersToIncreaseTheDiscount) {
      return literBought * price * (1 - discountBelowTwentyLiters);
    }
    return literBought * price * (1 - discountOverTwentyLiters);
  }

}
