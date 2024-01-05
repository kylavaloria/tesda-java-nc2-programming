
public class Activity1_Valoria {
    static int age;
    double temperature;
    
    Activity1_Valoria(int age, double temperature) {
        this.age = age;
        this.temperature = temperature;
    }
    
    public static void main(String[] args) {
        String firstName = "Kyla Mae";
        String lastName = "Valoria";
        
        Activity1_Valoria info = new Activity1_Valoria(18, 35.6);
        
        System.out.println("String: First Name: " + firstName);
        System.out.println("String: Last Name: " + lastName);
        System.out.println("int: Age: " + info.age);
        System.out.println("double: Temperature: " + info.temperature);
    }
}
