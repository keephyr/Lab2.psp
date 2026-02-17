package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Coach extends Member{
    private int amountOfPeople;
    private String type;

    public Coach(String name, String team, int exp, String role, int amountOfPeople, String type) {
        super(name, team, exp, role);
        this.amountOfPeople = amountOfPeople;
        this.type = type;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " - Coach{" +
                "amountOfPeople=" + amountOfPeople +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void Edit(){
        Scanner scanner = new Scanner(System.in);
        super.Edit();
        System.out.println("Введите тип тренировок: ");
        String type = scanner.nextLine();
        setType(type);
        System.out.println("Введите кол-во подопечных: ");
        int amount = scanner.nextInt();
        setAmountOfPeople(amount);
    }

    @Override
    public List<String> Info(){
        List<String> list = Arrays.asList(String.valueOf(amountOfPeople),type);
        List<String> list2 = new ArrayList<>(super.Info());
        return Stream.concat(list.stream(), list2.stream()).toList();
    }
}
