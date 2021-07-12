public class StudentManager extends UserManager{
    public void addUser(User user){
        System.out.println(user.getName() + " " + user.getLastName() + "" + " Student added.");
    }
}
