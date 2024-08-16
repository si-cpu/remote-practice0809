package Java_basic202408.src.oop.inherit;

import Java_basic202408.src.oop.inherit.Mage;

public class main {
    public static void main (String[] args) {

        Warrior w1 = new Warrior("전사짱짱맨");
                w1.showStatus();

        System.out.println("===================================");

        Mage m1 = new Mage("법사짱짱맨");
        m1.showStatus();

    }
}
