package org.thecodeguy.doctorscheckup;

public class Eye extends Organ {
    private String EyeColor;
    private boolean isOpened;
    public Eye(String name, String Condition, String EyeColor, boolean isOpened) {
        super(name, Condition);
        this.EyeColor = EyeColor;
        this.isOpened = isOpened;
    }
    @Override
    public void GetDetails() {
        super.GetDetails();
        System.out.println("Eye Color: " + EyeColor);
    }
    public void open(){
        this.setOpened(true);
        System.out.println(getName() + " opened");
    }
    public void close(){
        this.setOpened(false);
        System.out.println(getName() + " closed");
    }

    public String getEyeColor() {
        return EyeColor;
    }

    public void setEyeColor(String eyeColor) {
        EyeColor = eyeColor;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}


