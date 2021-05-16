package creational.buider;

public class Client {

    private String firstName;
    private String surname;
    private int age;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private Client client;

        public Builder() {
            client = new Client();
        }

        public Builder withFirstName(String firstName) {
            client.firstName = firstName;
            return this;
        }

        public Builder withSurname(String surname) {
            client.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            client.age = age;
            return this;
        }

        public Builder withEmail(String email) {
            client.email = email;
            return this;
        }

        public Client build() {
            return client;
        }
    }
}
