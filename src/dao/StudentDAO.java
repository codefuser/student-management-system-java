package dao;

import db.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    // ADD STUDENT

    public void addStudent(Student student) {

        try {

            Connection connection = DBConnection.getConnection();

            // CHECK DUPLICATE EMAIL

            String checkQuery = "SELECT * FROM students WHERE email = ?";

            PreparedStatement checkPs = connection.prepareStatement(checkQuery);

            checkPs.setString(1, student.getEmail());

            ResultSet checkRs = checkPs.executeQuery();

            if (checkRs.next()) {

                System.out.println();
                System.out.println("Email Already Exists!");

                connection.close();

                return;
            }

            System.out.println("Duplicate Check Passed");

            // INSERT STUDENT

            String insertQuery = "INSERT INTO students(name, email, course, phone) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(insertQuery);

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());
            ps.setString(4, student.getPhone());

            int rows = ps.executeUpdate();

System.out.println("Insert Query Executed");

System.out.println("Rows Inserted: " + rows);

            if (rows > 0) {

                System.out.println();
                System.out.println("Student Added Successfully!");

            } else {

                System.out.println();
                System.out.println("Insert Failed!");
            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    // VIEW STUDENTS

    public void viewStudents() {

        try {

            Connection connection = DBConnection.getConnection();

            String query = "SELECT * FROM students";

            PreparedStatement ps = connection.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println();
            System.out.println("===== STUDENT LIST =====");
            System.out.println();

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                        "ID: " + rs.getInt("id"));

                System.out.println(
                        "Name: " + rs.getString("name"));

                System.out.println(
                        "Email: " + rs.getString("email"));

                System.out.println(
                        "Course: " + rs.getString("course"));

                System.out.println(
                        "Phone: " + rs.getString("phone"));

                System.out.println("----------------------");
            }

            if (!found) {

                System.out.println("No Students Found!");
            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // SEARCH STUDENT

    public void searchStudentById(int studentId) {

        try {

            Connection connection = DBConnection.getConnection();

            String query = "SELECT * FROM students WHERE id = ?";

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println();
                System.out.println("===== STUDENT FOUND =====");
                System.out.println();

                System.out.println(
                        "ID: " + rs.getInt("id"));

                System.out.println(
                        "Name: " + rs.getString("name"));

                System.out.println(
                        "Email: " + rs.getString("email"));

                System.out.println(
                        "Course: " + rs.getString("course"));

                System.out.println(
                        "Phone: " + rs.getString("phone"));

            } else {

                System.out.println();
                System.out.println("Student Not Found!");
            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // UPDATE STUDENT

    public void updateStudent(Student student) {

        try {

            Connection connection = DBConnection.getConnection();

            String query = "UPDATE students SET name=?, email=?, course=?, phone=? WHERE id=?";

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());
            ps.setString(4, student.getPhone());
            ps.setInt(5, student.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println();
                System.out.println("Student Updated Successfully!");

            } else {

                System.out.println();
                System.out.println("Student Not Found!");
            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // DELETE STUDENT

    public void deleteStudent(int studentId) {

        try {

            Connection connection = DBConnection.getConnection();

            String query = "DELETE FROM students WHERE id=?";

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, studentId);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println();
                System.out.println("Student Deleted Successfully!");

            } else {

                System.out.println();
                System.out.println("Student Not Found!");
            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}