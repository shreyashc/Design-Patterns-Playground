public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");

    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin torso");

    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Tin arms");

    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller skates Legs");

    }

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }

}
