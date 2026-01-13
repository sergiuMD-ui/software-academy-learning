package org.example;
import java.util.ArrayList;

public class Students {
    private static final Students INSTANCE = new Students();
    private final ArrayList<Users> list = new ArrayList<Users>();

    private Students(){

    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public void addStudent(String userName, int ID, String email){
        Users user = new Users(userName, ID, email);
        list.add(user);
        System.out.println("User added");

    }

    public void removeUser(int index){
        list.remove(index);
        System.out.println("User " + index + " removed");
    }

    public ArrayList<Users> returnStudentList(){
        return list;
    }


}
