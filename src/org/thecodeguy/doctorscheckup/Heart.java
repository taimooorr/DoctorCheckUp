package org.thecodeguy.doctorscheckup;

public class Heart extends Organ {
    private double heartRate;

    public Heart(String name, String Condition, double heartRate) {
        super(name, Condition);
        this.heartRate = heartRate;
    }
    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;

    }
    public double getHeartRate() {
        return heartRate;
    }

    @Override
    public void GetDetails() {
        super.GetDetails();
        System.out.println("Heart Rate: " + getHeartRate());
    }

}
