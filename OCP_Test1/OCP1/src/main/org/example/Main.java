package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Palindromes object = new Palindromes();
        boolean bool = object.isPalindromeIgnoreSpaces("racecar");
        System.out.println(bool);*/

        var s1 = Students.getInstance();
        var s2 = Students.getInstance();

        System.out.println(s1 == s2);

        s1.addStudent("John", 1, "john@email.com");
        s1.addStudent("Terry", 2, "terry@email.com");

        var listOfStudents = s1.returnStudentList();

        for(Users user: listOfStudents)
        {
            System.out.println("Lista de studenti: " + user.toString());
        }

    }
}

/*
facem o clasa din care sa fim capabili sa intoarcem o singura instanta (singleton)
- in clasa respectiva, sa avem o lista de users cu 2 metode, add user, remove user
facem un test - sa verificam ca se poate face o singura instanta.


 */