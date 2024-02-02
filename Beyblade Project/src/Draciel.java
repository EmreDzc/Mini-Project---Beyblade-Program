public class Draciel extends Beyblade{
    private String monster;

    public Draciel(String name, int rotationSpeed, int attackPower, String monster) {
        super(name, rotationSpeed, attackPower);
        this.monster = monster;
    }

    @Override
    public void bringOutTheMonster() {
        System.out.println(getName() + " reveals the " + monster);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Monster name is: " + monster);
    }
}
