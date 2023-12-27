public class Hero {
    private int heroDamage;
    private int heroHealth;
    private String ability;

    public Hero(int heroDamage, int heroHealth, String ability) {
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
        this.ability = ability;
    }
    public Hero(int heroDamage, int heroHealth) {
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public String getAbility() {
        return ability;
    }
}
