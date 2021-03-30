package academy.belhard;
import entity.Person;
import entity.User;

public class Main {
    public static void main(String[] args) {
        Person user1 = new Person( "Tom" , "Hardy");
        System.out.println(user1.getFullName());

        User user2 = new User("Jack" , "Brown", "jack.brown@mail.ru", "13579");
        System.out.println(user2.getFullInfo());

        System.out.println(user2.isPasswordCorrect("13579"));
        System.out.println(user2.isPasswordCorrect("12345"));
    }
}
