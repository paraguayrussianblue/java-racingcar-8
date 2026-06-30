package racingcar.domain;

public class TryCount {
    public final int count;

    public TryCount(String input) {
        int parsedCount = validateNumeric(input);
        validatePositive(parsedCount);
        this.count = parsedCount;
    }

    private int validateNumeric(String input) {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 양의 정수여야 합니다.");
        }
    }

    private void validatePositive(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 양의 정수여야 합니다,");
        }
    }

    public int getCount() {
        return count;
    }


}
