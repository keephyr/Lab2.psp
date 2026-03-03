package objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.concurrent.atomic.AtomicInteger;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private final int id;
    private String role;
    private int exp;
    private int age;
    private final String name;
    private final String team;

    public Member(String name, String team, int exp,int age) {
        this.id = idGenerator.incrementAndGet();
        this.setRole("Member");
        this.name = name;
        this.team = team;
        this.exp = exp;
        this.age = age;
    }

    public Member(){
        this.id = idGenerator.incrementAndGet();
        this.setRole("Member");
        this.name = "None";
        this.team = "None";
        this.exp = 0;
        this.age = 0;
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
        this.exp = Math.max(0, exp);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(14, age);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", exp=" + exp +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }

}
