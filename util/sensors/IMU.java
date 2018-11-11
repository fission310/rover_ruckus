package org.firstinspires.ftc.teamcode.util.sensors;

import com.qualcomm.hardware.bosch.BNO055IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;

public interface IMU {
    public void init(BNO055IMU f, AxesOrder axesOrder, double heading);
    public double getHeading();
    public double getError(double d);
}
