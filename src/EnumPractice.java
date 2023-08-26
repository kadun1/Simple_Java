import enums.Languages;

import java.util.Set;

public class EnumPractice {
    public static void main(String[] args) {
        Languages language = Languages.JAVA;
        language.printName();

        Set<String> mySet = Set.of("asdf", "asd", "fdsa");

        System.out.println(mySet.contains("fdsa"));

    }
}
