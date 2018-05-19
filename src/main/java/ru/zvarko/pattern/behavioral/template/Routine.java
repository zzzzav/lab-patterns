package ru.zvarko.pattern.behavioral.template;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Routine {
    private Step stepOne;
    private Step stepTwo;
    private Step stepThree;
    private Step stepFour;
}
