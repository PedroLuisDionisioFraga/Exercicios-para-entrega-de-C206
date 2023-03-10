public class Car {
  public String color;
  public String model;
  public double maximumSpeed;
  public double minimumSpeed;
  Motor motor;

  // Constructors
  Car(String color, String model, double maximumSpeed, double minimumSpeed, int powerMotor, String typeMotor) {
    this.color = color;
    this.model = model;
    this.maximumSpeed = maximumSpeed;
    this.minimumSpeed = minimumSpeed;
    motor = new Motor(powerMotor, typeMotor);
  }

  // Methods
  public void turnOn() {
    System.out.println("Carro do modelo " + this.model + " ligado");
  }
  public void speedUp() {
    System.out.println("Carro do modelo " + this.model + "Acelerando...");
  }
  public void getAllInformations() {
    System.out.println("Cor: " + color);
    System.out.println("Modelo: " + model);
    System.out.println("Velocidade máxima: " + maximumSpeed);
    System.out.println("Velocidade minima: " + minimumSpeed + "\n");
    System.out.println("Informações do motor:");
    motor.getAllInformations();
  }
}
