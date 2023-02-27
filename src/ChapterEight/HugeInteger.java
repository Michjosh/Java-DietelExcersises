package ChapterEight;

/**
 * (HugeInteger Class) Create a class HugeInteger which uses a 40-element array of digits to
 * store integers as large as 40 digits each. Provide methods parse, toString, add and subtract.
 * Method parse should receive a String, extract each digit using method charAt and place the integer
 * equivalent of each digit into the integer array. For comparing HugeInteger objects,
 * provide the following methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
 * and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
 * holds between the two HugeInteger objects and returns false if the relationship does not hold.
 * Provide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
 * remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
 * format specifier %b.]
 */

    import java.util.Arrays;

    public class HugeInteger {
        private int[] digits;

        public HugeInteger(String value) {
            digits = new int[40];
            parse(value);
        }

        public void parse(String value) {
            int length = value.length();
            if (length > 40) {
                throw new IllegalArgumentException("Value too large to fit in 40-element array.");
            }
            for (int i = 0; i < length; i++) {
                digits[i] = Character.getNumericValue(value.charAt(length - i - 1));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = digits.length - 1; i >= 0; i--) {
                if (sb.length() > 0 || digits[i] != 0) {
                    sb.append(digits[i]);
                }
            }
            if (sb.length() == 0) {
                sb.append(0);
            }
            return sb.toString();
        }

        public HugeInteger add(HugeInteger other) {
            HugeInteger result = new HugeInteger("");
            int carry = 0;
            for (int i = 0; i < 40; i++) {
                int sum = this.digits[i] + other.digits[i] + carry;
                result.digits[i] = sum % 10;
                carry = sum / 10;
            }
            return result;
        }

        public HugeInteger subtract(HugeInteger other) {
            HugeInteger result = new HugeInteger("");
            int borrow = 0;
            for (int i = 0; i < 40; i++) {
                int difference = this.digits[i] - other.digits[i] - borrow;
                if (difference < 0) {
                    difference += 10;
                    borrow = 1;
                } else {
                    borrow = 0;
                }
                result.digits[i] = difference;
            }
            return result;
        }

        public boolean isEqualTo(HugeInteger other) {
            return Arrays.equals(this.digits, other.digits);
        }

        public boolean isNotEqualTo(HugeInteger other) {
            return !isEqualTo(other);
        }

        public boolean isGreaterThan(HugeInteger other) {
            for (int i = 39; i >= 0; i--) {
                if (this.digits[i] > other.digits[i]) {
                    return true;
                } else if (this.digits[i] < other.digits[i]) {
                    return false;
                }
            }
            return false;
        }

        public boolean isLessThan(HugeInteger other) {
            return !isGreaterThan(other) && isNotEqualTo(other);
        }

        public boolean isGreaterThanOrEqualTo(HugeInteger other) {
            return isGreaterThan(other) || isEqualTo(other);
        }
    }