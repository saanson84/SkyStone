package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.RobotLog;

@Autonomous(name = "Demo Linear OpMode2", group = "red")
//@Disable
public class DemoLinearOpMode2 extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {

        // Send telemetry message to signify the start of initialization;
        telemetry.addData("Status", "Starting Initialization");    //
        RobotLog.d("************ SAA - Starting Initialization at %.02f ************", runtime.seconds());
        telemetry.addData("Time Elasped", runtime.toString());    //
        telemetry.update();

        // Send telemetry message to signify robot waiting;
        while (runtime.seconds() < 5.0) {
            telemetry.addData("Status", "Initializing .");    //
            telemetry.addData("Time Elasped", runtime.toString());    //
            telemetry.update();
            sleep(250);
            telemetry.addData("Status", "Initializing . .");    //
            telemetry.addData("Time Elasped", runtime.toString());    //
            telemetry.update();
            sleep(250);
            telemetry.addData("Status", "Initializing . . .");    //
            telemetry.addData("Time Elasped", runtime.toString());    //
            telemetry.update();
            sleep(250);
        }

            // Send telemetry message to signify initialization is complete;
            telemetry.addData("Status", "Initialization Complete");    //
            RobotLog.d("************ SAA - Initialization Complete = %.03f ************", runtime.seconds() );
            telemetry.addData("Status", "Time is more than 5 seconds");    //
            telemetry.addData("Time Elasped", runtime.toString());    //
            telemetry.update();


        waitForStart();
        runtime.reset();

        RobotLog.d("************ SAA - Program Started at %.3f ************", runtime.seconds() );

        // Send telemetry message to signify robot running;
        while(opModeIsActive()) {
            telemetry.addData("Status", "Running ...");    //
            telemetry.addData("Time Elasped", runtime.toString());    //
            telemetry.update();

            idle();
        }
        RobotLog.d("************ SAA - Program Ended at %.2f *************", runtime.seconds() );

    }
}
