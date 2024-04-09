package com.example.scorecalculator;

public enum EmergencyTask {
    ICE_SHADOW("冰海疑影", 30),
    NETWORK("路网", 10),
    NO_LEAK("无漏", 10),
    CONTAMINATED_SHELL("染污躯壳", 10),
    COMPANY_CONFLICT("公司纠葛", 40);

    private final String name;
    private final int score;

    EmergencyTask(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
