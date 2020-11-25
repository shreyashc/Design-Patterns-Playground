public class SecurityCodeCheck {

    private int securityCode = 12345;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {
        return secCodeToCheck == getSecurityCode();
    }
}
