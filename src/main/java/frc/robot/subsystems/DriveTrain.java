import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase{
    CCSparkMax leftFront = new CCSparkMax("left front", "lf", Constants.MotorConstants.FRONT_LEFT, MotorType.kBrushless, IdleMode.kBrake, Constants.MotorConstants.FRONT_LEFT_REVERSE);
    CCSparkMax rightFront = new CCSparkMax("right front", "rf", Constants.MotorConstants.FRONT_RIGHT, MotorType.KBrushless, IdleMode.kBrake, Constants.MotorConstants.FRONT_RIGHT_REVERSE);
    CCSparkMax leftBack = new CCSparkMax("left back", "lb", Constants.MotorConstants.BACK_LEFT, MotorType.kBrushless, IdleMode.kbrake, Constants.MotorConstants.BACK_LEFT_REVERSE);
    CCSparkMax rightBack = new CCSparkMax("right back", "rb", Constants.MotorConstants.BACK_RIGHT, MotorType.kBrushless, IdleMode.kbrake, Constants.MotorConstants.BACK_RIGHT_REVERSE);

    DifferentialDrive frontDrive = new DifferentialDrive(leftFront, rightFront);
    DifferentialDrive backDrive = new DifferentialDrive(leftBack, rightBack);
    public void drive(double moveSpeed, double turnSpeed){
        frontDrive.arcadeDrive(moveSpeed, turnSpeed);
        backDrive.arcadeDrive(moveSpeed, turnSpeed);
    }
    public Command driveForward (double speed)(
        return new InstantCommand(() -> {
            leftFront.set(speed);
            rightFront.set(speed);
            leftBack.set(speed);
            rightBack.set(speed);
        }, this );
    )

}