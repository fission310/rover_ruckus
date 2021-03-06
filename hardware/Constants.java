package org.firstinspires.ftc.teamcode.hardware;

/**
 * Contains the all general constants for robot.
 */

public class Constants {
    /* CONSTANTS */
    private static final double GEAR_RATIO_26 = 25.83;
    private static final double GEAR_RATIO_3_7 = 3.7;
    private static final double GEAR_RATIO_20 = 20;
    private static final double GEAR_RATIO_ACQUIRER = 19.2;
    private static final double PPR = 7.0;
    private static final double CPR = PPR * 4.0; // 28
    /**
     * Ticks per revolution for a NeverRest and GoBilda motors.
     */
    private static final double TICKS_PER_MOTOR_26 = CPR * GEAR_RATIO_26; // 840
    private static final double TICKS_PER_MOTOR_20 = CPR * GEAR_RATIO_20; // 840
    private static final double TICKS_PER_MOTOR_3_7 = CPR * GEAR_RATIO_3_7; // 103.6
    private static final double TICKS_PER_MOTOR_ACQUIRER = CPR * GEAR_RATIO_ACQUIRER; // 103.6

    /**
     * Drivetrain gear ratio (< 1.0 if geared up).
     */
    private static final double DRIVE_GEAR_REDUCTION = 1.0;
    /**
     * Diameter of wheel in inches.
     */
    public static final double WHEEL_DIAMETER_INCHES_4 = 4.0;
    /**
     * Calculated ticks per inch.
     */
    public static final double INCHES_PER_TICK_20 = ((2.0 * Math.PI) / (TICKS_PER_MOTOR_20 * DRIVE_GEAR_REDUCTION));
    public static final double INCHES_PER_TICK_26 = ((WHEEL_DIAMETER_INCHES_4 * Math.PI) / (TICKS_PER_MOTOR_26 * DRIVE_GEAR_REDUCTION));
    public static final double INCHES_PER_TICK_HOPPER= ((2.0 * Math.PI) / (TICKS_PER_MOTOR_3_7 * DRIVE_GEAR_REDUCTION));
    public static final double INCHES_PER_TICK_ACQUIRER = ((2.0 * Math.PI) / (TICKS_PER_MOTOR_ACQUIRER * DRIVE_GEAR_REDUCTION));
    /**
     * Calculated inch per tick.
     */
    public static final double TICKS_PER_INCH_20 = 1.0 / INCHES_PER_TICK_20;
    public static final double TICKS_PER_INCH_26 = 1.0 / INCHES_PER_TICK_26;
    public static final double TICKS_PER_INCH_HOPPER = 1.0 / INCHES_PER_TICK_HOPPER;
    public static final double TICKS_PER_INCH_ACQUIRER = 1.0 / INCHES_PER_TICK_ACQUIRER;
    /**
     * Drive speed when using encoders.
     */
    public static final double DRIVE_SPEED = 0.4;
    /**
     * Turn speed when using encoders.
     */
    public static final double TURN_SPEED = 0.3;

    public static final double PCONSTANT = 0.1;
    /**
     * Ticks per revolution for a VEX EDR 393.
     */
    public static final double  TICKS_PER_SERVO_VEX = 627.2;
}
