package Praktika;

 class Payer {
     String surname;
     String name;
     String address;
     String cardNumber;

     public Payer(String surname, String name, String address, String cardNumber) {
         this.surname = surname;
         this.name = name;
         this.address = address;
         this.cardNumber = cardNumber;
     }

     public String toString() {
         return "Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber;
     }


 }


