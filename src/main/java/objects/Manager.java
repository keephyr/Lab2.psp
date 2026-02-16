package objects;

import java.util.Scanner;

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
        return "Manager{" +
                "contact='" + contact + '\'' +
                "} " +" - "+ super.toString();
    }

    @Override
    public void Edit(){
        Scanner scanner = new Scanner(System.in);
        super.Edit();
        System.out.println("Введите контакт: ");
        String contact = scanner.nextLine();
        setContact(contact);
    }
}
