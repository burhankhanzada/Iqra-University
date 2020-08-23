public class HashTableCollisionCount {

    private static int hashTableSize = 10;

    private static int[] hashTable;

    private static int collisionCount;

    private static final String LINEAR_PROBING = "Linear Probing";
    private static final String QUADRATIC_PROBING = "Quadratic Probing";
    private static final String DOUBLE_HASHING_PROBING = "Double Hashing";

    private static int generateHashForLinearProbing(int prevHashVal, int increment) {
        return prevHashVal + increment % hashTableSize;
    }

    private static int generateHashForQuadraticProbing(int prevHashVal, int increment) {
        return prevHashVal + increment * increment % hashTableSize;
    }

    private static int generateHashForDoubleHashing(int key, int prevHashVal, int increment) {

        int secondHashFunctionVal = 7 - key % 7;

        return prevHashVal + increment * secondHashFunctionVal % hashTableSize;
    }

    private static int baseCollisionCount(int[] array, String type) {

        hashTable = new int[hashTableSize];

        collisionCount = 0;

        for (int i = 0; i < array.length; i++) {

            int key = array[i];

            int hash = key % hashTableSize;

            if (hashTable[hash] > 0) {

                int newHash = 0;

                int j = 0;

                do {

                    collisionCount++;

                    switch (type) {
                        case LINEAR_PROBING:
                            newHash = generateHashForLinearProbing(hash, j);
                            break;
                        case QUADRATIC_PROBING:
                            newHash = generateHashForQuadraticProbing(hash, j);
                            break;
                        case DOUBLE_HASHING_PROBING:
                            newHash = generateHashForDoubleHashing(key, hash, j);
                            break;
                    }

                    newHash = newHash % hashTableSize;

                    j++;

                } while (hashTable[newHash] > 0);

                hash = newHash;

            }

            hashTable[hash] = key;

        }

        return collisionCount;

    }

    static int countForLinearProbing(int[] array) {
        baseCollisionCount(array, LINEAR_PROBING);
        return collisionCount;
    }

    static int countForQuadraticProbing(int[] array) {
        baseCollisionCount(array, QUADRATIC_PROBING);
        return collisionCount;
    }

    static int countForDoubleHashing(int[] array) {
        baseCollisionCount(array, DOUBLE_HASHING_PROBING);
        return collisionCount;
    }

}
