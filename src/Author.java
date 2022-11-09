public class Author {
    private String firstName;
    private String serName;
    private String lastName;

    public Author(String firstName, String serName, String lastName) {
        this.firstName = firstName;
        this.serName = serName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSerName() {
        return this.serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}