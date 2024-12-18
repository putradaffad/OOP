package praktikum.Pert12.Quiz.Soal3;

import java.util.Scanner;

interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi: Ponsel dinyalakan.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi: Ponsel dimatikan.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Xiaomi: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("Xiaomi: Nyalakan ponsel terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Xiaomi: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("Xiaomi: Nyalakan ponsel terlebih dahulu.");
        }
    }
}

class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone: Ponsel dinyalakan.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone: Ponsel dimatikan.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("iPhone: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("iPhone: Nyalakan ponsel terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("iPhone: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("iPhone: Nyalakan ponsel terlebih dahulu.");
        }
    }
}

class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung: Ponsel dinyalakan.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung: Ponsel dimatikan.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Samsung: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("Samsung: Nyalakan ponsel terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Samsung: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("Samsung: Nyalakan ponsel terlebih dahulu.");
        }
    }
}

class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo: Ponsel dinyalakan.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo: Ponsel dimatikan.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Oppo: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("Oppo: Nyalakan ponsel terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Oppo: Volume sekarang " + volume);
        } else if (!isPowerOn) {
            System.out.println("Oppo: Nyalakan ponsel terlebih dahulu.");
        }
    }
}

class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

public class InterfacePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Phone xiaomi = new Xiaomi();
        Phone iphone = new iPhone();
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();

        System.out.println("Pilih ponsel yang akan digunakan:");
        System.out.println("1. Xiaomi\n2. iPhone\n3. Samsung\n4. Oppo");
        int choice = input.nextInt();

        Phone selectedPhone = null;

        switch (choice) {
            case 1: selectedPhone = xiaomi; break;
            case 2: selectedPhone = iphone; break;
            case 3: selectedPhone = samsung; break;
            case 4: selectedPhone = oppo; break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        PhoneUser user = new PhoneUser(selectedPhone);

        int action;
        do {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Nyalakan Ponsel");
            System.out.println("2. Matikan Ponsel");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Kecilkan Volume");
            System.out.println("0. Keluar");

            action = input.nextInt();

            switch (action) {
                case 1: user.turnOnThePhone(); break;
                case 2: user.turnOffThePhone(); break;
                case 3: user.makePhoneLouder(); break;
                case 4: user.makePhoneSilent(); break;
                case 0: System.out.println("Program selesai."); break;
                default:
                    System.out.println("Aksi tidak valid.");
            }
        } while (action != 0);

        input.close();
    }
}