public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Azul", "BMW", 451.122, 0, 1500, "Foda");
    Car car2 = new Car("Preto", "Subaru", 229.47, 0, 1100, "Foda também");

    car1.turnOn();
    car1.getAllInformations();
    car2.turnOn();
    car2.getAllInformations();
  }
}
