package access_modifier.lopchighi;

public class Students {
    private String name = "Jonh";
    private String classes = "CO2";

    public Students(){
    }
    void setName(String name){
        this.name = name;
    }
    protected void setClasses(String classes){
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
