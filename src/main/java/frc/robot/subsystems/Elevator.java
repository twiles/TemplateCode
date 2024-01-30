public class Elevator extends SubsystemBase {

    CCSparkMax ElevatorRight = new CCSparkMax("ElevatorRight", "ER", RobotMab.ELEVATOR_RIGHT, MotorType.kBrushless, IdleMode.kBraked, RobotMap.INTAKE_RIGHT_REVERSE, RobotMap.INTAKE_RIGHT);
    CCSparkMax ElevatorLeft = new CCSparkMax("ElevatorLeft", "EL", RobotMab.ELEVATOR_LEFT, MotorType.kBrushless, IdleMode.kBraked,, RobotMap.INTAKE_LEFT_REVERSE, RobotMap.INTAKE_LEFT);

    MotorControllerGroup Elevator = new MotorControllerGroup(ElevatorRight, ElevatorLeft);

    public void set(double speed){

        Elevator.set(speed);
    }

}