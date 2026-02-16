package objects;

import java.util.Scanner;

public class Member {
    private String role;
    private int exp;
    private final String name;
    private final String team;

    public Member(String name, String team, int exp, String role) {
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

    @Override
    public String toString() {
        return "Member{" +
                "role='" + role + '\'' +
                ", exp=" + exp +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }

    public void Edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        setRole(role);
        System.out.println("Введите опыт: ");
        int exp = scanner.nextInt();
        setExp(exp);
    }
}
