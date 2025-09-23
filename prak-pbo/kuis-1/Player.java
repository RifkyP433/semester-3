public class Player extends Character {
  private int level;

  public Player(String name, int health, int attackPower, int level) {
    super(name, health, attackPower);
    this.level = level;
  }

  @Override
  public void attack(Character target) {
    int damage = (int) (super.getHealth() * 0.1) + level; // bonus dari level
    System.out.println(getName() + " attacks with sword! Damage: " + damage);
    target.takeDamage(damage);
  }

    public void heal(int amount) {
    if (getHealth() == 0) {
      System.out.println(getName() + " is defeated and cannot heal.");
      return;
    }
    int newHealth = getHealth() + amount;
    // Tidak melebihi health awal karena kita tidak bisa akses maxHealth
    if (newHealth > 100) { // Asumsi max health 100, karena tidak bisa aksesnya
      newHealth = 100;
    }
    setHealth(newHealth);
    System.out.println(getName() + " heals for " + amount + " HP. Current health: " + getHealth());
  }
}