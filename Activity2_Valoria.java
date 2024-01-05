public class Activity2_Valoria {
    private String name;
    private char gender;
    private boolean isEnrolled;
    private short semester;
    private int age;
    private long ID;
    private float averageGrade;
    private double tuitionFee;
   
    Activity2_Valoria(String name, char gender, boolean isEnrolled, short semester, int age, long ID, float averageGrade, double tuitionFee) {
        this.name = name;
        this.gender = gender;
        this.isEnrolled = isEnrolled;
        this.semester = semester;
        this.age = age;
        this.ID = ID;
        this.averageGrade = averageGrade;
        this.tuitionFee = tuitionFee;
    }
    
    public static void main(String[] args) {
        Activity2_Valoria student = new Activity2_Valoria("Kyla Mae Valoria", 'F', true,(short) 2, 20, 7637654423456745678L, 1.10f, 25000.46);
        
        System.out.println("\t\t\tSTUDENT INFORMATION:\n");
        System.out.println("\t\t[String] Name: " + student.name);
        System.out.println("\t\t[char] Gender: " + student.gender);
        System.out.println("\t\t[boolean] Enrolled: " + student.isEnrolled);
        System.out.println("\t\t[short] Semester: " + student.semester);
        System.out.println("\t\t[int] Age: " + student.age);
        System.out.println("\t\t[long] Student ID: " + student.ID);
        System.out.println("\t\t[float] Average Grade: " + student.averageGrade);
        System.out.println("\t\t[double] Tuition Fee: " + student.tuitionFee);
        System.out.println();
    }
}
