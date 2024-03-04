package model;

import lombok.*;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Subject {
    private int id;
    private int korean;
    private int english;
    private int math;

    @Builder(builderMethodName = "builder")
    public Subject(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}
