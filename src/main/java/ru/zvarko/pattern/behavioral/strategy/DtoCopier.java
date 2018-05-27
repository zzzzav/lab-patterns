package ru.zvarko.pattern.behavioral.strategy;

public class DtoCopier {

    public Dto copyDto(Dto dto, CopyStrategy strategy) {
        return strategy.copy(dto);
    }

}
