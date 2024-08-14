package oop.this_;

public class Player {

    //필드
    String nickName;
    int level;
    int hp;

    Player(){
        System.out.println("Playrer의 기본 생성자 호출!");
        level = 1;
        hp = 50;
    }
    Player(String nickName){
        System.out.println("Playrer의 2번 생성자 호출!");
        this.nickName = nickName;
        level = 1;
        hp = 50;
    }

    //메서드
    void attack(Player target){
        System.out.printf("%s이(가) %s을(를) 공격합니다.\n",
                this.nickName, target.nickName);
        // 맞는 플레이어의 체력을 10감소시키자
        target.hp -= 10;
        // 때리는 플레이어의 체력을 3감소시키자
        this.hp -= 3;



    }


    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}
