package objects;

import java.util.Scanner;

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
        return "Coach{" +
                "amountOfPeople=" + amountOfPeople +
                ", type='" + type + '\'' +
                '}' +" - "+ super.toString();
    }

    @Override
    public void Edit(){
        Scanner scanner = new Scanner(System.in);
        super.Edit();
        System.out.println("Введите кол-во подопечных: ");
        int amount = scanner.nextInt();
        setAmountOfPeople(amount);
        System.out.println("Введите тип тренировок: ");
        String type = scanner.nextLine();
        setType(type);
    }
}
