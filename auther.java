package day4;

public class auther {

    String name;
    String email;

    public void auther(String name,String email){
        System.out.println(name+"   "+email);

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "auther{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



