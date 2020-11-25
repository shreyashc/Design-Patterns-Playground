public class TestEnemyAttackers {
    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("The robot");
        enemyRobot.reactToHuman("Paul");
        enemyRobot.walkForward();
        enemyRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();
        System.out.println();

        System.out.println("The robot with adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}
