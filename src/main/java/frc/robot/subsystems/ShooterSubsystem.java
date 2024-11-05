package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
    CCSparkMax leftShooter = new CCSparkMax("left shooter", "ls",  Constants.MotorConstants.shoot1, MotorType.kBrushless,MotorType.kCoast);
    CCSparkMax rightShooter = new CCSparkMax("right shooter", "rs",  Constants.MotorConstants.shoot2, MotorType.kBrushless,MotorType.kCoast);
    
    public void shooter(double powerInput){
        leftShooter.set(powerInput);

    }
    public void shooter2 (double powerInput){
        rightShooter.set(powerInput);
    }
    
}
