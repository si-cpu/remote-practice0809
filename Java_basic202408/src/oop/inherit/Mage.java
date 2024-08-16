package Java_basic202408.src.oop.inherit;

public class Mage extends Player {
    
    int mana;


    @Override
    public void showStatus() {
        super.showStatus();
    }

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;



    }
}
