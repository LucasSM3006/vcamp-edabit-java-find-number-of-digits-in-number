public class Main {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if(num < 0) {
            String str = Integer.toString(num);
            System.out.println("The length of (" + num + ") is: " + findNumOfDigits(str));
        }

        else {
        System.out.println("The length of (" + num + ") is: " + findNumOfDigits(num));
        }
    }

    public static int findNumOfDigits(int num) {
        int lengthOfInteger = (int) (Math.floor(Math.log10(num)) + 1);
        return lengthOfInteger;
    }

    public static int findNumOfDigits(String num) {
        int stringLength = num.length() - 1;
        return stringLength;
    }
}