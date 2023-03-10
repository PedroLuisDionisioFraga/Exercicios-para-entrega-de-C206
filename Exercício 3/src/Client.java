public class Client {
  private String name;
  private double litersOfGasolinePurchased;
  private double litersOfAlcoholPurchased;
  private Gasoline gasoline;
  private Alcohol alcohol;

  // Constructors
  Client(String name, double litersOfAlcoholPurchased, double litersOfGasolinePurchased) {
    this.name = name;
    this.litersOfAlcoholPurchased = litersOfAlcoholPurchased;
    this.litersOfGasolinePurchased = litersOfGasolinePurchased;
    gasoline = new Gasoline();
    alcohol = new Alcohol();
  }

  // Methods
  public double calculateThePurchasePrice() {
    double gasolineValue = gasoline.purchasePrice(litersOfGasolinePurchased);
    double alcoholValue = alcohol.purchasePrice(litersOfAlcoholPurchased);
    return gasolineValue + alcoholValue;
  }

  // Getters e setters
  public String getName() {
    return this.name;
  }

}