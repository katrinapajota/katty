
public class encaps {
 
    public static String Name; 
    public static int age;
    
    public static void setName ( String name ) {
        Name = name;
    }
    
    public static void setAge ( int age) {
        encaps.age = age;
    }
    
    public static String getName() {
        return Name;
    }
    public static int getAge() {
        return age;
    }
    
}
