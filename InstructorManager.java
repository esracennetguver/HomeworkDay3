public class InstructorManager extends UserManager{
    public void addUser(User user){
        System.out.println(user.getName() + " " + user.getLastName() + " İnstructor added.");
    }
}
