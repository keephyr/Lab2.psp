package objects;

import java.util.Scanner;

public class Player extends Member{
    private String position;
    private int number;

    public Player(String name, String team, int exp, String role, String position, int number) {
        super(name, team, exp, role);
        this.position = position;
        this.number = number;
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
        return "Player{" +
                "position='" + position + '\'' +
                ", number=" + number +
                "} " +" - " + super.toString();
    }

    @Override
    public void Edit(){
        Scanner scanner = new Scanner(System.in);
        super.Edit();
        System.out.println("Введите позицию: ");
        String position = scanner.nextLine();
        setPosition(position);
        System.out.println("Введите номер: ");
        int number = scanner.nextInt();
        setNumber(number);
    }
}
