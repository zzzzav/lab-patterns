package ru.zvarko.pattern.behavioral.template;

public class SashaDailyRoutine extends BasicDailyRoutine {
    public Routine doSecondStep(Routine dto) {
        dto.setStepTwo(Step.GOING_SHOWER);
        return dto;
    }

    public Routine doThirdStep(Routine dto) {
        dto.setStepThree(Step.GOING_BREAKFAST);
        return dto;
    }
}
