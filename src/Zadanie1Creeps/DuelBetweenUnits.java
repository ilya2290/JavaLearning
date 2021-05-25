package Zadanie1Creeps;

public class DuelBetweenUnits {
    public static void unitsDuel(Unit target1, Unit target2) {
        int counterOfAttack = 0;
        int deadUnitActualHP = 0;
        for (; ; ) {
            target1.hp = target1.hp - target2.attackDamage; // creep attacking a T1
            target2.hp = target2.hp - target1.attackDamage;  // tower attacking a creep
            counterOfAttack++;
            if (target1.hp <= 0) {
                deadUnitActualHP = target1.hp;
                break;
            } else if (target2.hp <= 0) {
                deadUnitActualHP = target2.hp;
                break;
            }
        }
        if (target1.hp <= 0) {
            target1.hp = 0;
            System.out.println("\n" + "Sentinel has been killed by Tower1!");
        } else {
            target2.hp = 0;
            System.out.println("Tower1 has been killed by Sentinel!");
        }
        System.out.println("HP creep: " + target1.hp);
        System.out.println("HP tower: " + target2.hp);
        System.out.println("Number of attacks: " + counterOfAttack);
        System.out.println("Actual HP of death unit: " + deadUnitActualHP);

        //target1.setHp(target1.getHp()) =
    }

}
