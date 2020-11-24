public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    @Override
    public void setRobotTorso(String Torso) {
        robotTorso = Torso;

    }

    @Override
    public void setRobotArms(String arms) {
        robotArms = arms;

    }

    @Override
    public void setRobotLegs(String legs) {
        robotLegs = legs;

    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

}
