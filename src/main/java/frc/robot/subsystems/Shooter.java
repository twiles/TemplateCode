public class Shooter extends SubsystemBase {

    CCSparkMax ShooterTop = new CCSparkMax("ShooterTop", "ST", RobotMab.SHOOTER_TOP, MotorType.kBrushless, IdleMode.kBraked, RobotMap.SHOOTER_TOP_REVERSE, RobotMap.SHOOTER_TOP);
    CCSparkMax ShooterBottom = new CCSparkMax("ShooterBot", "SB", RobotMab.SHOOTER_BOTTOM, MotorType.kBrushless, IdleMode.kBraked,, RobotMap.SHOOTER_BOT_REVERSE, RobotMap.SHOOTER_BOT);

    MotorControllerGroup Shooter = new MotorControllerGroup(ShooterTop, ShooterBottom);

    public void set(double speed){

        Shooter.set(speed);
    }

}