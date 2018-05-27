package ru.zvarko.pattern.behavioral.strategy;

public class DtoCopier {

    private Dto item;

    public DtoCopier(Dto item) {
        this.item = item;
    }

    public Dto copyDto(CopyStrategy strategy) {
        return strategy.copy(this.item);
    }

}
