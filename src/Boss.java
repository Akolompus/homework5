public class Boss {
    private int BossHealth;
    private int BossDamage;
    private String BossDefence;

    public Boss(int bossHealth, int bossDamage, String bossDefence) {
        this.BossHealth = bossHealth;
        this.BossDamage = bossDamage;
        this.BossDefence = bossDefence;
    }

    public void infoOfBoss() {
        System.out.println("Boss information");
        System.out.println("BossHealth: " + getBossHealth());
        System.out.println("BossDamage: " + getBossDamage());
        System.out.println("BossDefence: " + getBossDefence());
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        if (this.BossHealth > 0) {
            this.BossHealth = BossHealth;
        } else {
            System.out.println("Wrong");
        }
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public String getBossDefence() {
        return BossDefence;
    }

    public void setBossDefence(String bossDefence) {
        BossDefence = bossDefence;
    }
}



