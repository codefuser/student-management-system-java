package ui;

import dao.StudentDAO;
import model.Student;

import java.util.Scanner;

public class MainMenu {
    public void start() {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println();
            System.out.println("=================================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM ");
            System.out.println("=================================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    if (name.isEmpty()) {

                        System.out.println("Name Cannot Be Empty!");
                        break;
                    }

                    System.out.print("Enter Student Email: ");
                    String email = scanner.nextLine();

                    if (email.isEmpty()) {

                        System.out.println("Email Cannot Be Empty!");
                        break;
                    }

                    if (!email.contains("@") || !email.contains(".com")) {

                        System.out.println("Invalid Email Format!");
                        break;
                    }

                    System.out.print("Enter Student Course: ");
                    String course = scanner.nextLine();

                    if (course.isEmpty()) {

                        System.out.println("Course Cannot Be Empty!");
                        break;
                    }

                    System.out.print("Enter Student Phone: ");
                    String phone = scanner.nextLine();

                    if (phone.isEmpty()) {

                        System.out.println("Phone Cannot Be Empty!");
                        break;
                    }

                    if (!phone.matches("\\d{10}")) {

                        System.out.println("Phone Number Must Be 10 Digits!");
                        break;
                    }

                    Student student = new Student(name, email, course, phone);

                    StudentDAO dao = new StudentDAO();

                    dao.addStudent(student);

                    break;
                case 2:

                    StudentDAO viewDAO = new StudentDAO();

                    viewDAO.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");

                    int searchId = scanner.nextInt();

                    StudentDAO searchDAO = new StudentDAO();

                    searchDAO.searchStudentById(searchId);

                    break;

                case 4:

                    System.out.print("Enter Student ID to Update: ");

                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String updateName = scanner.nextLine();

                    System.out.print("Enter New Email: ");
                    String updateEmail = scanner.nextLine();

                    System.out.print("Enter New Course: ");
                    String updateCourse = scanner.nextLine();

                    System.out.print("Enter New Phone: ");
                    String updatePhone = scanner.nextLine();

                    Student updateStudent = new Student(
                            updateName,
                            updateEmail,
                            updateCourse,
                            updatePhone);

                    updateStudent.setId(updateId);

                    StudentDAO updateDAO = new StudentDAO();

                    updateDAO.updateStudent(updateStudent);

                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete: ");

                    int deleteId = scanner.nextInt();

                    StudentDAO deleteDAO = new StudentDAO();

                    deleteDAO.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println();
                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println();
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        scanner.close();
    }
}