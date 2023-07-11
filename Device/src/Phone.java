public class Phone extends Device {
    public void makeCall() {
        if (battery >= 5) {
            battery -= 5;
            System.out.println("You make a call.");
            status();
        } else {
            System.out.println("Battery critical. Unable to make a call.");
        }
    }

    public void playGame() {
        if (battery >= 25) {
            battery -= 20;
            System.out.println("You play a game.");
            status();
        } else {
            System.out.println("Battery critical. Unable to play a game.");
        }
    }

    public void charge() {
        battery += 50;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("Charging the phone.");
        status();
    }
}