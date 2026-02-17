package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


public class Member {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private final int id;
    private String role;
    private int exp;
    private final String name;
    private final String team;

    public Member(String name, String team, int exp, String role) {
        this.id = idGenerator.incrementAndGet();
        this.name = name;
        this.team = team;
        this.exp = exp;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id = '" + id + '\'' +
                ", role='" + role + '\'' +
                ", exp=" + exp +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }

    public List<String> Info(){
        String[] list = {role,String.valueOf(exp),name, team};
        return new ArrayList<String>(Arrays.asList(list));
    }

    public void Edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Изменение члена: " + name);
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        setRole(role);
        System.out.println("Введите опыт: ");
        int exp = scanner.nextInt();
        setExp(exp);
    }
}
