package ConditionalIntro;

public class SwitchStatement {
    public static void main(String[] args) {
        int variable = 2;
        switch (variable) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("mango shake");
                break;   
            default:
                System.out.println("we wake up");
                break;
        }
    }
}
