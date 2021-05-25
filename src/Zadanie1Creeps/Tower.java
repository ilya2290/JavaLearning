package Zadanie1Creeps;

public class Tower extends Unit {

    @Override
    public void attackProcess(Unit target1, Unit target2) {
        int hitNumber = 0;
        while (target2.hp >= 0) {
            target2.hp = target2.hp - target1.attackDamage;
            hitNumber++;
            System.out.println("Creep's HP: " + target2.hp + " (" + hitNumber + " hit ϟ)");

            if (target2.hp <= 0) {
                System.out.println("Sentinel has been die.");
            }
        }
        System.out.println("Hit number to Sentinel's death: " + hitNumber + "\n");
    }


}
