package objects;

public class Player extends Member{
    private String position;
    private int number;

    public Player(String name, String team, int exp,int age, String position, int number) {
        super(name, team, exp,age);
        this.setRole("Player");
        this.position = position;
        this.number = number;
    }

    public Player() {
        super();
        this.setRole("Player");
        this.position = "";
        this.number = 0;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + " - Player{" +
                "position='" + position + '\'' +
                ", number=" + number +
                "} ";
    }
}
