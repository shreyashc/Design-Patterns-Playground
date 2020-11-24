public class TestRobotBuilder {
    public static void main(String[] args) {
        RobotBuilder oldRobotBuilder = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldRobotBuilder);
        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");

        System.out.println("Robot head Type:" + firstRobot.getRobotHead());
        System.out.println("Robot torso Type:" + firstRobot.getRobotTorso());
        System.out.println("Robot arms Type:" + firstRobot.getRobotArms());
        System.out.println("Robot legs Type:" + firstRobot.getRobotLegs());
    }
}
