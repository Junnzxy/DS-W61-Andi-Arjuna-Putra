class Vehicle {
    // Metode yang akan ditimpa (overridden)
    void move() {
        System.out.println("Vehicle is moving"); // Implementasi bawaan/umum
    }
}

class Car extends Vehicle { 
    // Subclass yang menimpa metode move untuk memberikan implementasi spesifik bagi Car
    @Override // Anotasi untuk menandakan bahwa kita sedang menimpa sebuah metode
    void move() { 
        // Implementasi spesifik untuk Car
        System.out.println("Car is moving"); 
    }
}

public class Main { 
    // Kelas utama untuk menguji polimorfisme
    public static void main(String[] args) { 
        Vehicle v1 = new Vehicle(); 
        Vehicle v2 = new Car(); 

        // Memanggil metode move pada kedua objek
        v1.move(); // Ini akan memanggil metode move milik Vehicle
        v2.move(); // Ini akan memanggil metode move milik Car karena mekanisme dynamic method dispatch
    }
}
