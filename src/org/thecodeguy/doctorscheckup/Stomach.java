package org.thecodeguy.doctorscheckup;

public class Stomach extends Organ {
    private boolean isEmpty;

    public Stomach(String name, String Condition, boolean isEmpty) {
        super(name, Condition);
        this.isEmpty = isEmpty;
    }
    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public boolean getIsEmpty() {
        return isEmpty;
    }
    @Override
    public void GetDetails() {
        super.GetDetails();
        if(this.isEmpty){
            System.out.println("Stomach is empty");
        }
        else{
            System.out.println("Stomach is not empty");
        }
    }
    public void digest(){
        System.out.println("Digesting");
    }
}
