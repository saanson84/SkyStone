package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "demo teleop2", group = "red")
//@Disable
public class DemoOpMode2 extends OpMode {


private ElapsedTime runtime = new ElapsedTime();
private DcMotor leftMotor;


    @Override
    public void init() {
        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Starting Initialization");    //
        telemetry.addData("Time Elasped", runtime.toString());    //
        telemetry.update();

        leftMotor = hardwareMap.dcMotor.get("left_drive");

        while (runtime.seconds() < 5.0) {
            // Send telemetry message to signify robot waiting;
            telemetry.addData("Status", "Initialization Complete");    //
            telemetry.addData("Status", "Time is less than 5 seconds");    //
            telemetry.addData("Time Elasped", runtime.toString());    //
            telemetry.update();
        }

        if (runtime.seconds() >= 5.0) {
            // Send telemetry message to signify robot waiting;
            telemetry.addData("Status", "Initialization Complete");    //
            telemetry.addData("Status", "Time is more than 5 seconds");    //
            telemetry.addData("Time Elasped", runtime.toString());    //
            telemetry.update();
        }


    }

    @Override
    public void start() {
        runtime.reset();
    }

    @Override
    public void loop() {
        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Running ...");    //
        telemetry.addData("Time Elasped", runtime.toString());    //
        telemetry.update();


    }

    @Override
    public void stop() {
        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Program has stopped");    //
        telemetry.addData("Time Elasped", runtime.toString());    //
    }
}