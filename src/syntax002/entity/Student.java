package syntax002.entity;

public class Student {

    public static String javaClass;

    static{
        javaClass="三年二班";
    }

    public Student(){
        System.out.println(javaClass);
    }

    public Student(String name) {
        this.name = name;
        System.out.println(javaClass);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
