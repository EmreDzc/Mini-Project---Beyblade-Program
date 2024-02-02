public class Beyblade {

    private String name;
    private int rotationSpeed;
    private int attackPower;

    public Beyblade(String name, int rotationSpeed, int attackPower) {
        this.name = name;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attack(){
        System.out.println(name + " " + rotationSpeed + " with " + attackPower + " is attacking..." );

    }
    public void bringOutTheMonster(){
        System.out.println("This beyblade doesn't have monster...");
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Rotation speed is: " + rotationSpeed);
        System.out.println("Attack power is: " + attackPower);
    }
}
