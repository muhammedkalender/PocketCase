package dev.siyah.casesimulator.Development;

import java.util.Random;

import lombok.NonNull;

public class Randomizer {
    public int randomizeInteger(int minValue, int maxValue) {
        return new Random().nextInt(maxValue) + minValue;
    }

    @NonNull
    public <T> T randomizeEnum(@NonNull T[] enums) {
        return enums[randomizeInteger(0, enums.length)];
    }

    @NonNull
    public String randomizeString(int minLength, int maxLength) {
        int length = randomizeInteger(minLength, maxLength);

        Random random = new Random();

        String space = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(space.charAt(random.nextInt(space.length())));
        }

        return sb.toString();
    }
}
