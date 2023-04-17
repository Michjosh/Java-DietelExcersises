package ChapterFourteen;

public class Strings {
    public static void main(String[] args) {
        Integer intig = 34;
        int num = 12;

        intig += num;
        System.out.println(intig);

        String str = new String("Am good");
        String str1 = "Am good";
        StringBuffer sbf = new StringBuffer();
        StringBuilder sbl = new StringBuilder();

        System.out.println(sbf.capacity());
        System.out.println(sbl.capacity());

        System.out.println(str1.substring(3, 7));
        System.out.println(str1.equals(str));
        System.out.println(str1 == str);
    } 
    }
