package d04_Class_method;

public class Person {

    public String publicA;
    protected String protectedB;
    String defaultC;
    private String privateD;

    public void eat() {
        System.out.println("eat:");
    }

    public String eat(String food) {
        return "eat:" + food;
    }

    @Override
    public String toString() {
        return "Person{" +
                "publicA='" + publicA + '\'' +
                ", protectedB='" + protectedB + '\'' +
                ", defaultC='" + defaultC + '\'' +
                ", privateD='" + privateD + '\'' +
                '}';
    }

    public String getPublicA() {
        return publicA;
    }

    public void setPublicA(String publicA) {
        this.publicA = publicA;
    }

    public String getProtectedB() {
        return protectedB;
    }

    public void setProtectedB(String protectedB) {
        this.protectedB = protectedB;
    }

    public String getDefaultC() {
        return defaultC;
    }

    public void setDefaultC(String defaultC) {
        this.defaultC = defaultC;
    }

    public String getPrivateD() {
        return privateD;
    }

    public void setPrivateD(String privateD) {
        this.privateD = privateD;
    }

    public Person(String publicA, String protectedB, String defaultC, String privateD) {
        this.publicA = publicA;
        this.protectedB = protectedB;
        this.defaultC = defaultC;
        this.privateD = privateD;
    }

    public Person() {
    }
}
