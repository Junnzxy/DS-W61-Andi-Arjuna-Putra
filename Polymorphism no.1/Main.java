class Animal {
    // Metode dasar yang akan ditimpa oleh subclass
    void sound() {
        System.out.println("Some animal sound"); 
    }
}

class Cat extends Animal {
    // Menggunakan anotasi @Override untuk mengganti metode dari kelas induk
    @Override 
    void sound() { 
        // Implementasi spesifik untuk suara kucing
        System.out.println("Meow"); 
    }
}

public class Main {
    public static void main(String[] args) {
        // Polimorfisme: Menggunakan tipe referensi Animal untuk objek Cat
        Animal a = new Cat(); 
        
        // Memanggil metode sound. Java akan menjalankan punya cat Cat
        // karena adanya mekanisme Dynamic Method Dispatch
        a.sound(); 
    }
}