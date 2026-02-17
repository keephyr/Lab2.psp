package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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
        return super.toString() + " - Player{" +
                "position='" + position + '\'' +
                ", number=" + number +
                "} ";
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

    @Override
    public List<String> Info(){
        List<String> list = Arrays.asList(String.valueOf(number),position);
        List<String> list2 = new ArrayList<>(super.Info());
        return Stream.concat(list.stream(), list2.stream()).toList();
    }
}
