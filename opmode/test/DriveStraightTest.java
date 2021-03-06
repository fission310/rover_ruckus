package org.firstinspires.ftc.teamcode.opmode.test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.FieldConstants;
import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.mecanum.HardwareMecanum;

@Autonomous(name="Driv Straight Test", group="Test")
//@Disabled
public class DriveStraightTest extends LinearOpMode {

    /* Private OpMode members */
    private ElapsedTime     runtime = new ElapsedTime();

    /* Robot hardware */
    private HardwareMecanum robot = new HardwareMecanum(this);

    private int step = 0;

    /**
     * Runs the autonomous routine.
     */
    @Override
    public void runOpMode() {
        // Initialize robot
        robot.init(hardwareMap);
        robot.drivetrain.encoderInit();
        robot.imuInit(hardwareMap);
        robot.drivetrain.singleImu.setStartingAngle();

        // Wait until we're told to go
        while (!opModeIsActive() && !isStopRequested()) {
            telemetry.addData("Status", "Waiting in Init");
            telemetry.update();
        }

        waitForStart();
        runtime.reset();  // Start counting run time from now.

        while (opModeIsActive()) {
            switch (step) {
                case 0:
                    robot.drivetrain.turnPID(-90, 90);
//                    robot.drivetrain.driveToPos(.5, -FieldConstants.FLOOR_TILE * 1.5, 5);
                    telemetry.addData("Step 0", "Robot Drive one floor tile");
                    telemetry.update();
                    step++;
                    break;
                case 1:
                    sleep(1000);
//                    robot.drivetrain.turnPID(90, 90);
                    telemetry.addData("Step 0", "Robot Drive one floor tile negative speed");
                    telemetry.update();
                    step++;
                    break;
                case 2:
//                    sleep(3000);
                    robot.drivetrain.turnPID((int)robot.drivetrain.singleImu.getDeltaStartingAngle(), (int)robot.drivetrain.singleImu.getDeltaStartingAngle());
                    telemetry.addData("Step 0", "Robot Drive one floor tile negative speed");
                    telemetry.update();
                    step++;
                    break;

                default: {
                    robot.drivetrain.driveToPos(0, 0, 5);
                    telemetry.addData("Status", "Robot default");
                    telemetry.update();
                }
                break;
            }
        }
        if (isStopRequested() || !opModeIsActive()) { }
    }
}
