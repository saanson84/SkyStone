package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "demo teleop", group = "blue")
//@Disabled
public class DemoOpMode extends OpMode {
    private DcMotor leftMotor;
    private Servo servo;


    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left");
        servo = hardwareMap.servo.get("servo");

    }

    @Override
    public void loop() {
        leftMotor.setPower(gamepad1.left_stick_y);
        if (gamepad1.a) {
            servo.setPosition(1);
        } else {
            servo.setPosition(0);
        }
    }
}