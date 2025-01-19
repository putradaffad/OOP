# Soal:
## Buatlah program Java yang menggambarkan sebuah sistem manajemen kendaraan. Sistem ini harus menggunakan abstract class dan interface dengan ketentuan sebagai berikut: 

Deskripsi:
1. Interface Engine:
   - Menyediakan dua metode abstrak: startEngine() dan stopEngine().

2. Abstract Class Vehicle:
   - Memiliki atribut model, color, dan year.
   - Menyediakan konstruktor untuk menginisialisasi atribut-atribut tersebut.
   - Memiliki metode abstrak move() yang akan diimplementasikan oleh subclass.

3. Class Car:
   - Mengimplementasikan Engine dan meng-extend Vehicle.
   - Mengimplementasikan metode startEngine() dan stopEngine() dari interface Engine.
   - Mengimplementasikan metode move() yang mencetak pesan "Mobil bergerak".

4. Class Motorcycle:
   - Mengimplementasikan Engine dan meng-extend Vehicle.
   - Mengimplementasikan metode startEngine() dan stopEngine() dari interface Engine.
   - Mengimplementasikan metode move() yang mencetak pesan "Motor bergerak".

5. Class Main:
   - Buat objek dari Car dan Motorcycle, kemudian panggil metode startEngine(), move(), dan stopEngine() pada masing-masing objek.