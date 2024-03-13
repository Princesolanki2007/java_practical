public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void DisplayInfo() {
        System.out.println("Hello, my name is " + name + ", I am " + age + " years old, and I live at " + address + ".");
    }
    public static void main(String[] args) {
        
        Person person = new Person("Prince", 17, "Upleta");
        person.DisplayInfo();
        
   	
        }
}
