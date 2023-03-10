public class Main {
  public static void main(String[] args) {
    Client client = new Client("Pedro", 11.4, 10.54);

    client.calculateThePurchasePrice();

    System.out.println("O preço total da compra do cliente " + client.getName() + " é: " + client.calculateThePurchasePrice() + "\n");

  }
}
