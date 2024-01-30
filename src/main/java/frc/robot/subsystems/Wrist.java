public class Wrist extends SubsystemBase {

    CCSparkMax wristRight = new CCSparkMax("WristRight", "WR", RobotMab.WRIST_RIGHT, MotorType.kBrushless, IdleMode.kBraked, RobotMap.WRIST_RIGHT_REVERSE, RobotMap.WRIST_RIGHT);
    CCSparkMax wristLeft = new CCSparkMax("WristLeft", "WL", RobotMab.WRIST_LEFT, MotorType.kBrushless, IdleMode.kBraked,, RobotMap.WRIST_LEFT_REVERSE, RobotMap.WRIST_LEFT);

    MotorControllerGroup wrist = new MotorControllerGroup(WristRight, WristLeft);

    public void set(double speed){

        wrist.set(speed);
    }

}