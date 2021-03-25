
public class BinaryReversalApp {
    public static void main(String[] args) {
        System.out.println(binaryReversal("47"));
    }

    public static int binaryReversal(String str) {
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }

        String result = Integer.toBinaryString(number);
        int padding = (int) (Math.ceil(result.length() / 8.0) * 8);
        String resultWithPadding = String.format("%" + padding + "s", result).replaceAll(" ", "0");
        int sum = 0;
        for (int i = 0; i < resultWithPadding.length(); i++) {
            sum += Integer.parseInt(resultWithPadding.substring(i, i + 1)) * Math.pow(2, i);

        }

        return sum;

    }
}