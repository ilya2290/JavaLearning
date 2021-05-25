package Zadanie1Creeps;

public class Creep extends MovableUnit {

    @Override
    public void attackProcess(Unit target1, Unit target2) {
        int hitNumber = 0;
        while (target2.hp >= 0) {
            target2.hp = target2.hp - target1.attackDamage;
            hitNumber++;
            System.out.println("Tower1 HP: " + target2.hp + "  (" + hitNumber + " hit ϟ)");
            if (target2.hp <= 0) {
                System.out.println("Tower1 has been destroyed by Sentinel");
            }
        }
        System.out.println("Hit number to destroy Tower1: " + hitNumber + "\n");
    }

    @Override
    public void moveToTarget(Unit target) {
        System.out.println("Sentinel's move speed: " + ms);  // узнать как применить вместо сентинеля имя объекта
    } // принимает объект


}





