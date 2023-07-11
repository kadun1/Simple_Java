package enums;

import java.util.Arrays;
import java.util.function.DoublePredicate;

public enum MyStatus {

    FAST(status -> status < 60,"빠름"),
    MEDIUM(status -> status >= 60 && status < 120,"보통"),
    SLOW(status -> status >= 120,"느림");

    private String statusMessage;
    private DoublePredicate predicate;

    MyStatus(DoublePredicate predicate, String statusMessage) {
        this.predicate = predicate;
        this.statusMessage = statusMessage;
    }

    public static MyStatus of(Double status) {
        return Arrays.stream(MyStatus.values())
                .filter(myStatus -> myStatus.predicate.test(status))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("상태가 없습니다."));
    }
}
