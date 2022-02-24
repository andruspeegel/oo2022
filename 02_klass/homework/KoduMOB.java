package homework;

public class KoduMOB {
    String name;
    int level;
    String type;
    int HP;

    public KoduMOB(String name, int level, String type, int HP) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.HP = HP;
    }

    public void sayMOB(){
        System.out.println("Mob name is " + name + ", at level " + level + ", mob HP is " + HP);
    }

    @Override
    public String toString() {
        return "KoduMOB{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", type='" + type + '\'' +
                ", HP=" + HP +
                '}';
    }
}
