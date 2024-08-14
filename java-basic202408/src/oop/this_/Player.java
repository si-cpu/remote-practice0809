package oop.this_;

public class Player {

    //필드
    String nickName;
    int level;
    int hp;

    Player(){
        System.out.println("Player의 기본 생성자 호출!");
        level = 1;
        hp = 50;
    }


    Player(String nickName){
        this(); // 내 다른 생성자를 호출하는 문.
        System.out.println("Player의 2번 생성자 호출!");
        this.nickName = nickName;
//        level = 1;
//        hp = 50;
    }

    Player(String nickName,int hp){
        this(nickName); // 내 다른 생성자 호출은 반드시 생성자 최상댄에 위침함 -> 충돌이 발생할 수 있음.
        System.out.println("Player의 3번 생성자 호출!");
        this.hp = hp;
    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    //메서드
    void attack(Player target){
        if (this == target){
            System.out.println("시전대상이 잘못되었습니다.");
            return;
        }
        System.out.printf("%s이(가) %s을(를) 공격합니다.\n",
                this.nickName, target.nickName);

        // 맞는 플레이어의 체력을 10감소시키자
        target.hp -= 10;

        // 때리는 플레이어의 체력을 3감소시키자
        this.hp -= 3;

        System.out.printf("%s 님의 남은 체력 : %d \n", this.nickName,this.hp);
        System.out.printf("%s 님의 남은 체력 : %d \n", target.nickName,target.hp);



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
