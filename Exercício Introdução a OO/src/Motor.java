public class Motor {
  public int power;
  public String type;

  // Constructors
  Motor(int power, String type) {
    this.power = power;
    this.type = type;
  }

  // Methods
  public void getAllInformations() {
    System.out.println("Sua potência é: " + power);
    System.out.println("Seu tipo é: " + type + "\n\n");
  }
}
