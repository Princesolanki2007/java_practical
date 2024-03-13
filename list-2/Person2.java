class Person2{
    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }


    public static void main(String[] args) {
	Person2 person = new Person2();
	person.setName("prince");
        person.setAge(17);
    }
}
