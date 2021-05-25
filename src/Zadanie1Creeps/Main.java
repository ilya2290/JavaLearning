package Zadanie1Creeps;

public class Main {

    public static void main(String[] args) {

        Creep sentinel = new Creep();
        Tower tower1 = new Tower();
        CreepCannibal sentinelCannibal = new CreepCannibal();

        sentinelCannibal.setHp(300);
        sentinelCannibal.setMoveSpeed(280);
        sentinelCannibal.setAttackDamage(30);
        sentinelCannibal.setArmor(0);

        sentinel.setHp(300);
        sentinel.setArmor(1);
        sentinel.setAttackDamage(40);
        sentinel.setMoveSpeed(325);

        tower1.setArmor(5);
        tower1.setHp(1500);
        tower1.setAttackDamage(120);



        // ВЫВОД ХАРАКТЕРИСТИК ТАВЕРА И СЕНТИНЕЛЯ

//        System.out.println("HP:" + sentinel.getHp());
//        System.out.println("Armor:" + sentinel.getArmor());
//        System.out.println("Attack:" + sentinel.getAttackDamage());
//        System.out.println("Move Speed:" + sentinel.getMoveSpeed()+"\n");
//
//        System.out.println("HP:" + tower1.getHp());
//        System.out.println("Armor:" + tower1.getArmor());
//        System.out.println("Attack:" + tower1.getAttackDamage());
//        System.out.println("Move Speed:" + tower1.getMoveSpeed()+"\n");
//
//        sentinel.moveToTarget(tower1);
//        sentinel.attackTarget(tower1);
//
//        sentinel.attackProcess(sentinel, tower1);  // Только Крип лупит тавер
//        tower1.attackProcess(tower1, sentinel);   // Только Тавер лупит крипа
//        sentinel.duelCollision(sentinel,tower1); // хитаются тавер и крипчанский

//          System.out.println(sentinelCannibal.attackDamage);
//          System.out.println(sentinelCannibal.hp);
//          System.out.println(sentinelCannibal.armor);
//          System.out.println(sentinelCannibal.ms);


       //sentinelCannibal.moveToTarget(tower1);
       //sentinelCannibal.eat(sentinel);

       DuelBetweenUnits.unitsDuel(sentinel,tower1);

    }

}
