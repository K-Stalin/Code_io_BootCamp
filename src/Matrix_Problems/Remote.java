package Matrix_Problems;

interface Remote {
    default void turningON() {
        System.out.println("Turning ON from Remote");
    }
}

interface Bluetooth extends Remote {
    @Override
    default void turningON() {
        System.out.println("Turning ON from Bluetooth");
    }
}

interface InfraRed extends Remote {
    @Override
    default void turningON() {
        System.out.println("Turning ON from InfraRed");
    }
}

class TVRemote implements Bluetooth, InfraRed {
    @Override
    public void turningON() {  // Override method also ***PUBLIC***
        Bluetooth.super.turningON();

    }
}

 class Main {
    public static void main(String[] args) {
        TVRemote tv = new TVRemote();
        tv.turningON();
    }
}
