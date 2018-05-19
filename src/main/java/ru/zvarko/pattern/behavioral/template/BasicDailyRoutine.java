package ru.zvarko.pattern.behavioral.template;

public abstract class BasicDailyRoutine {

    public final Routine doAllSteps(final Routine dto) {
        doFirstStep(dto);
        doSecondStep(dto);
        doThirdStep(dto);
        doFourthStep(dto);
        return dto;
    }

    private Routine doFirstStep(final Routine dto) {
        dto.setStepOne(Step.WAKEUP);
        return dto;
    }

    public abstract Routine doSecondStep(final Routine dto);
    public abstract Routine doThirdStep(final Routine dto);

    private Routine doFourthStep(final Routine dto) {
        dto.setStepFour(Step.DRESSING);
        return dto;
    }

}

