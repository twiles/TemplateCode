public class Intake extends SubsystemBase{
   
    CCSparkMax intake = new CCSparkMax("intake", "in", RobotMap.INTAKE, MotorType.kBrushless, IdleMode.kBrake, RobotMap.INTAKE_REVERSE, RobotMap.DRIVE_ENCODER);
   
    public void set(double speed) {
        
        intake.set(speed);
    }
}