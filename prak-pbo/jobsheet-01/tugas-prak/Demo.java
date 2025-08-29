public class Demo {
  public static void main(String[] args) {
    Laptop lt = new Laptop();
    Mouse ms = new Mouse();
    TasRansel tr = new TasRansel();
    TasLaptop tl = new TasLaptop();

    lt.setMerek("Asus");
    lt.setRam(8);
    lt.cetakInformasi();
    
    System.out.println();

    ms.setMerek("Logitech");
    ms.setJenisKoneksi("Wireless");
    ms.cetakInformasi();

    System.out.println();

    tr.setWarna("Abu-abu");
    tr.setBahan("Nilon");
    tr.setJmlKantong(5);
    tr.setBerat(0.3);
    tr.cetakInformasi();

    System.out.println();

    tl.setWarna("Abu-abu");
    tl.setBahan("Nilon");
    tl.setUkuranMaks(15.6);
    tl.setAntiAir(false);
    tl.cetakInformasi();
  }
}