package ua.org.oa.TaisKotliar;

public class Main {

    public static void main(String[] args) {
        // Заданы 2 произвольных строки.
        // Из этих строк создать одну объединенную без первых символов в каждой из строк.
        String stringOne = "!Yo-ho-ho!";
        String stringOneOne = "!Marry Christmas and Happy New Year!";
        System.out.println(stringOne.substring(1) + " " + stringOneOne.substring(1));
        System.out.println(stringOne.substring(1).concat(" " + stringOneOne.substring(1)));

        // Задана строка с нечетным количеством символов. Создайте строку, состоящую из 3-х символов,
        // например: “Candy” -> “and”, “solving” -> “lvi”.
        String stringTwo = "Dalaran";
        System.out.println(stringTwo.substring(stringTwo.length() / 2 - 1, stringTwo.length() / 2 + 2));

        //Задана строка произвольного размера. Создайте из этой строки новую,
        // в которой 2 последних символа исходной строки перенесены в начало.
        String stringThree = "For the Alliance!";
        System.out.println(stringThree.substring(stringThree.length() - 2).
                concat(stringThree.substring(0, stringThree.length() - 2)));

        //Из заданной строки составьте новую, в которой каждый исходный символ представлен двумя,
        // например “Candy” -> “CCaannddyy”.
        StringBuilder stringFour = new StringBuilder("Cheese");
        StringBuilder stringFiveFive = new StringBuilder("");
        for (int i = 0; i < stringFour.length(); i++) {
            stringFour.charAt(i);
            stringFiveFive.append(stringFour.charAt(i)).append(stringFour.charAt(i));
        }
        System.out.println(stringFiveFive);

        //Найдите все вхождения строки "b*b" (* - любой символ) в заданной строке без использования регулярных выражений,
        // например “bob is bab” -> 2
        String stringFive = "bobybob is bab";
        int count = 0;
        for (int i = 0; i < stringFive.length(); i++) {
            if (stringFive.charAt(i) == 'b') {
                if (i + 2 < stringFive.length() && stringFive.charAt(i + 2) == 'b') {
                    count++;
                    //i = i + 2;
                }
            }
        }
        System.out.println(count);

        //Создайте подстроку из исходной строки, где в каждом слово, содержащем символ “*” удалены соседние
        // левый и правый символы, например “th*is is sum*mer” -> “ts is suer”.
        String stringSix = "Th*is is sum*mer!";
        String stringSixSix = "";
        int lasti = 0;
        for (int i = 0; i < stringSix.length(); i++) {
            if (stringSix.charAt(i) == '*' && (i + 1) < stringSix.length() && (i - 1) >= 0) {
                stringSixSix += stringSix.substring(lasti, i - 1);
                lasti = i + 2;
            }
        }
        stringSixSix += stringSix.substring(lasti);
        System.out.println(stringSixSix);

        //В заданной строке подсчитайте количество слов, заканчивающихся на ‘a’ или ‘s’, без учета регистра символов
        String stringSeven = "I have two cute rats. I love them very much. Their name are Ripichip and Scotty. " +
                "Ripichip like nuts and green salad. Scotty is strange animal - his behavior is surprised my some time. " +
                "But they are my little babies";
        int count7 = 0;
        for (int i = 0; i < stringSeven.length(); i++) {
            if (stringSeven.charAt(i) == 's' || stringSeven.charAt(i) == 'a') {
                if ((i + 1) < stringSeven.length()
                        && (stringSeven.charAt(i + 1) == ' '
                        || stringSeven.charAt(i + 1) == '.'
                        || stringSeven.charAt(i + 1) == ',')) {
                    count7++;
                }
            }
        }
        System.out.println(count7);

        //Заданы две строки. Создайте новую строку, состоящую из первой строки,
        // в которой удалены все вхождения второй строки.
        String stringEight = "Jingle bells, jingle bells" +
                "Jingle all the way," +
                "Oh what fun it is to ride" +
                "In a one-horse open sleigh," +
                "Jingle bells, jingle bells" +
                "Jingle all the way," +
                "Oh what fun it is to ride" +
                "In a one-horse open sleigh.";
        String pattern = "bells";
        String stringEightTest = "";
        int lastEntry = 0;
        while (lastEntry < stringEight.length()){
            int entry = stringEight.indexOf(pattern, lastEntry);
            if (entry == -1) break;
            stringEightTest += stringEight.substring(lastEntry, entry);
            lastEntry = entry + pattern.length();
        }
        System.out.println(stringEightTest);

    }
}