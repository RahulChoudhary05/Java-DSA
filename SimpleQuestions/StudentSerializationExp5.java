import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name='" + name + "', GPA=" + gpa + "]";
    }
}

public class StudentSerializationExp5 {
    public static void main(String[] args) {
        String filePath = "student.ser";
        Student student = new Student(101, "Rahul", 3.9);
        serializeStudent(student, filePath);
        Student deserializedStudent = deserializeStudent(filePath);
        if (deserializedStudent != null) {
            System.out.println("Deserialized Student Details: " + deserializedStudent);
        }
    }

    private static void serializeStudent(Student student, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(student);
            System.out.println("Serialization successful!");
        } catch (IOException e) {
            System.err.println("Serialization failed: " + e.getMessage());
        }
    }

    private static Student deserializeStudent(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Student) ois.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
        return null;
    }
}
