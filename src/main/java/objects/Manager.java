package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Manager extends Member{
    private String contact;

    public Manager(String name, String team, int exp, String role, String contact) {
        super(name, team, exp, role);
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return super.toString() + " - Manager{" +
                "contact='" + contact + '\'' +
                "} ";
    }

    @Override
    public void Edit(){
        Scanner scanner = new Scanner(System.in);
        super.Edit();
        System.out.println("Введите контакт: ");
        String contact = scanner.nextLine();
        setContact(contact);
    }

    @Override
    public List<String> Info(){
        List<String> list = Arrays.asList(contact);
        List<String> list2 = new ArrayList<>(super.Info());
        return Stream.concat(list.stream(), list2.stream()).toList();
    }
}
