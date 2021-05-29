package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String nickName;
    private Integer id;
    private String password;

    private final List<User> users;

    public User(String nickName, Integer id, String password){
        this.nickName = nickName;
        this.id = id;
        this.password = password;
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }

    public void removeUser(User user){
        users.removeIf(x -> x.equals(user));
    }

    public void removeAllUsers(){
        users.clear();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nickName, user.nickName) && Objects.equals(id, user.id) && Objects.equals(password, user.password) && Objects.equals(users, user.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, id, password, users);
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", users=" + users +
                '}';
    }
}
