package utils;

public class Methods {
    public static int getRandomNumber(int min, int max) {
        int range = max - min + 1;
        int random = 0;
        for (int i = min; i < max; i++) {
            random = (int) (Math.random() * range) + min;
        }
        return random;
    }
}
