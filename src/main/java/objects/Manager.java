package objects;

public class Manager extends Member{
    private String contact;

    public Manager(String name, String team, int exp,int age, String contact) {
        super(name, team, exp,age);
        this.setRole("Manager");
        this.contact = contact;
    }

    public Manager() {
        super();
        this.setRole("Manager");
        this.contact = "";
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
}
