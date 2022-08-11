package org.thecodeguy.doctorscheckup;

public class Skin extends Organ {
    private String SkinType;

    public Skin(String name, String Condition, String skinType) {
        super(name, Condition);
        SkinType = skinType;
    }

    public String getSkinType() {
        return SkinType;
    }

    public void setSkinType(String skinType) {
        SkinType = skinType;
    }

    @Override
    public void GetDetails() {
        super.GetDetails();
        System.out.println("Skin Type: " +getSkinType());
    }
}
