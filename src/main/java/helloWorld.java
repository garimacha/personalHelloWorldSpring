/**
 * spring bean
 */
public class helloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("##Hello ! " + name);
    }
}
