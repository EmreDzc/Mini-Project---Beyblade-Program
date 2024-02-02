public class Dragon extends Beyblade {
    private String monster;
    private String hiddenTalent;

    public Dragon(String name, int rotationSpeed, int attackPower, String monster, String hiddenTalent) {
        super(name, rotationSpeed, attackPower);
        this.monster = monster;
        this.hiddenTalent = hiddenTalent;
    }

    @Override
    public void bringOutTheMonster() {
        System.out.println(getName() + " reveals the " + monster);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Monster name is: " + monster);
        System.out.println("Hidden talent is: " + hiddenTalent);
    }
}
