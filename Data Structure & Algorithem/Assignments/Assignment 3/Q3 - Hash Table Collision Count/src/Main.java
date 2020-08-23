public class Main {

    public static void main(String[] args) {

        int[] integerArray = {4371, 1323, 6173, 4199, 4344, 9679, 1989};

        HashTableCollisionCount.countForLinearProbing(integerArray);
        HashTableCollisionCount.countForQuadraticProbing(integerArray);
        HashTableCollisionCount.countForDoubleHashing(integerArray);

    }

}