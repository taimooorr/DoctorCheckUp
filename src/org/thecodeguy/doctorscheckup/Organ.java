package org.thecodeguy.doctorscheckup;

public class Organ {
    private String name;
    private String Condition;

    public Organ(String name, String Condition) {
        this.name = name;
        this.Condition = Condition;
    }
    public void GetDetails() {
        System.out.println("Organ Name: " + name);
        System.out.println("Organ Condition: " + Condition);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }
}
