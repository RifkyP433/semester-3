package hewanoop1;

public class Main {
  public static void main(String[] args) {
    Kucing kucing = new Kucing("Milo");
    kucing.bersuara();
    kucing.mengeong();

    Anjing anjing = new Anjing("Max");
    anjing.bersuara();
    anjing.menggonggong();
  }
}