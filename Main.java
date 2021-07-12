public class Main {

    public static void main(String[] args) {

        Instructor user1 = new Instructor();
        user1.setName("Engin");
        user1.setLastName("Demiroğ");
        System.out.println(user1.getSeniorityYear());

        Student user2= new Student();
        user2.setName("Esra");
        user2.setLastName("Güver");
        user2.setAdvisor("Beydat");
        user2.setNumber("1325");

        UserManager userManager= new UserManager();
        userManager.addUser(user1);
        userManager.addUser(user2);

        StudentManager studentManager= new StudentManager();
        studentManager.addUser(user2);
        studentManager.deleteUser(user2);

        InstructorManager instructorManager= new InstructorManager();
        instructorManager.addUser(user1);
        instructorManager.updateUser(user2);



    }
