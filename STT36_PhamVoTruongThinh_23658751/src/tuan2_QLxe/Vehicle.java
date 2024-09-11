package tuan2_QLxe;

class Vehicle {
    private String chuxe;
    private String mauxe;
    private double dungtich;
    private double giaxe;

    // Constructor
    public Vehicle(String chuxe, String mauxe, double dungtich, double giaxe) {
        this.chuxe = chuxe;
        this.mauxe = mauxe;
        this.dungtich = dungtich;
        this.giaxe = giaxe;
    }

    // Thong tin xe
    public double thue() {
        if (dungtich < 100) {
            return giaxe * 0.01;
        } else if (dungtich <= 200) {
            return giaxe * 0.03;
        } else {
            return giaxe * 0.05;
        }
    }

   
    public void displayInfo() {
        System.out.printf("Chu so huuu: %s, Mau xe: %s, Dung tich: %.1f cc, Gia thanh: %.2f, Thue: %.2f%n", chuxe, mauxe, dungtich, giaxe, thue());
    }
}
