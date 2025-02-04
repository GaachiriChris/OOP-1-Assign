//Gachiri Christopher Mbuki ADM: 175851

// Main class to test the implementation
public class OOPclasses {
    public static void main(String[] args) {
        Flagship myPhone = new Flagship("Samsung", 1);

        myPhone.start();
        myPhone.chargeType();
        myPhone.showDetails();
        myPhone.stop();
    }
}
// Interface class
interface Phone {
    void start();
    void stop();
}

// Abstract class
abstract class Smartphone implements Phone {
    String brand;

    Smartphone(String brand) {
        this.brand = brand;
    }

    abstract void chargeType(); // Abstract method

    public void start() {
        System.out.println(brand + " is Booting...");
    }

    public void stop() {
        System.out.println(brand + " is shutting off...");
    }
}

// Concrete class
class Flagship extends Smartphone {
    int storageCapacity;

    Flagship(String brand, int storageCapacity) {
        super(brand);
        this.storageCapacity = storageCapacity;
    }

    @Override
    void chargeType() {
        System.out.println(brand + " allows wireless charging.");
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Storage Capacity: " + storageCapacity + " TB");
    }
}