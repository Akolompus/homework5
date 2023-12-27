public class Main {
    public static void main(String[] args) {
        Boss Boss = new Boss(800, 65, "physical");
        Boss.infoOfBoss();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("");
            System.out.println(createHeroes()[i].getHeroHealth());
            System.out.println(createHeroes()[i].getHeroDamage());
            System.out.println(createHeroes()[i].getAbility());


        }
    }

    public static Hero[] createHeroes() {
        Hero[] listOfHero = new Hero[3];
        listOfHero[0] = new Hero(30, 250, "Magical");
        listOfHero[1] = new Hero(35, 230, "Physical");
        listOfHero[2] = new Hero(40, 200);
        return listOfHero;
    }
}