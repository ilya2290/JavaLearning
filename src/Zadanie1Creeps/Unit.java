package Zadanie1Creeps;

public abstract class Unit {

    protected int armor = 0;
    protected int attackDamage = 0;
    protected int hp = 0;
    protected int ms = 0;
    protected int attackRange;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }





    public abstract void attackProcess(Unit target1, Unit target2); // кто-то бьет кого-то в 1 рыло

    /*
    public void duelCollision(Unit target1, Unit target2) {
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
            System.out.println("\n"+"Sentinel has been killed by Tower1!");
        } else {
            target2.hp = 0;
            System.out.println("Tower1 has been killed by Sentinel!");
        }
        System.out.println("HP creep: " + target1.hp);
        System.out.println("HP tower: " + target2.hp);
        System.out.println("Numeber of attacks: " + counterOfAttack);
        System.out.println("Actual HP of death unit: " + deadUnitActualHP);

    }  // ПВП 2 юнитов
*/

}
