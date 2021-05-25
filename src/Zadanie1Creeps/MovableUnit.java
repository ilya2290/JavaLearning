package Zadanie1Creeps;

public abstract class MovableUnit extends Unit {

    public void setMoveSpeed(int ms) {
        this.ms = ms;
    }

    public int getMoveSpeed() {
        return ms;
    }

    abstract public void moveToTarget(Unit target); // в юнит шуруется объект, тк юнит класс родитель все объекты у насл ему пренадл
}
