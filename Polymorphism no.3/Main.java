class Employee {
    // Metode yang akan ditimpa (overridden)
   void work() {
       System.out.println("Employee is working"); // Implementasi umum
   }

   void attendMeeting() {
    // Metode lain yang juga diwariskan
       System.out.println("Employee attends meeting"); // Implementasi umum
   }
} 

class Programmer extends Employee {
// Menimpa metode work untuk memberikan implementasi spesifik bagi Programmer
   @Override
    // Implementasi spesifik untuk Programmer
   void work() {
       System.out.println("Programmer writes code");
   }
}

public class Main {
// Metode utama untuk menguji polimorfisme
   public static void main(String[] args) {
    // Polimorfisme: Menggunakan referensi Employee untuk merujuk ke objek Programmer
       Employee e = new Programmer();

       // Memanggil metode work. Java akan menjalankan versi milik Programmer 
       // karena adanya mekanisme dynamic method dispatch
       e.work();

       // Memanggil metode attendMeeting. Karena Programmer tidak menimpa (override) 
       // attendMeeting, maka Java akan menjalankan versi milik Employee (inherited)
       e.attendMeeting();
   }
}
