public class UserManager {
    public void addUser(User user){
        System.out.println(user.getName() + " " + user.getLastName() + "" + " is added.");
    }

    public void updateUser(User user){
        System.out.println(user.getName() + " " + user.getLastName() + "" + " is updated.");
    }

    public void deleteUser(User user){
        System.out.println(user.getName() + " " + user.getLastName() + "" + " is deleted.");
    }

}
