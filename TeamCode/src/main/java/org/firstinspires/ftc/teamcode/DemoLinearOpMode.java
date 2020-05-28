package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Demo Linear OpMode", group = "blue")
//@Disabled
public class DemoLinearOpMode extends LinearOpMode {
    private DcMotor leftMotor;
    private Servo servo;
    private OpticalDistanceSensor ods;

    @Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("left");
        servo = hardwareMap.servo.get("servo");
        ods = hardwareMap.opticalDistanceSensor.get("ods");

        waitForStart();

        leftMotor.setPower(1);
        servo.setPosition(1);
        double light = ods.getLightDetected();

        Thread.sleep(1000);
        if (light >= 0.5) {
            servo.setPosition(light);
        } else {
            servo.setPosition(0);
        }
        leftMotor.setPower(0);
    }
}
