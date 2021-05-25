package Zadanie1Creeps;

public class CreepCannibal extends Creep {

    public void eat(Creep target) {
        attackDamage = attackDamage + target.hp;
        System.out.println("Cannibal Damage: " + attackDamage);
    }
}
