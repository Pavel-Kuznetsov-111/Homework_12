public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Имя автора " + this.firstName + "Фамилия автора " + this.lastName;
    }

    public boolean equals(Author other) {
        if ((this.getLastName() != other.getLastName()) && (this.getFirstName() != other.getFirstName())) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return java.util.Objects.hash(lastName) + java.util.Objects.hash(firstName);
    }

}
