public class GameTest {
  public static void main(String[] args) {
    Player p1 = new Player("Hero Rifky", 100, 20, 5);
    Monster m1 = new Monster("Goblin", 80, 15, "Goblin");
    Monster m2 = new Monster("Dragon", 200, 30, "Dragon");
    BossMonster mboss = new BossMonster("Kratos", 200, 30, "Kratos");

    Character[] enemies = {m1, m2, mboss};

    int round = 1;
    while (p1.getHealth() > 0 && anyAlive(enemies)) {
      System.out.println("\n--- Round " + round + " ---");

      // Giliran Player
      Character target = getFirstAlive(enemies);
      if (p1.getHealth() < 40) {
        p1.heal(20); // Player akan heal jika HP < 40
      } else {
        p1.attack(target);
      }

      // Giliran musuh
      for (Character enemy : enemies) {
        if (enemy.getHealth() > 0) {
          enemy.attack(p1);
        }
      }

      round++;
    }

    // Hasil akhir
    System.out.println("\n=== Pertarungan Selesai ===");
    if (p1.getHealth() > 0) {
      System.out.println(p1.getName() + " menang!");
    } else {
      System.out.println(p1.getName() + " kalah.");
    }
  }

  // Tambahan method untuk pengecekan musuh
  public static boolean anyAlive(Character[] characters) {
    for (Character c : characters) {
      if (c.getHealth() > 0) return true;
    }
    return false;
  }

  public static Character getFirstAlive(Character[] characters) {
    for (Character c : characters) {
      if (c.getHealth() > 0) return c;
    }
    return null;
  }
}
