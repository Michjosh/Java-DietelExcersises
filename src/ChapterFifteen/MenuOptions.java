package ChapterFifteen;

public enum MenuOptions {

ZERO_BALANCE(1),
CREDIT_BALANCE(2),
DEBIT_BALANCE(3),
END(4);
 private final int value; // current menu option
    private MenuOptions(int value) {this.value = value;}
 }
