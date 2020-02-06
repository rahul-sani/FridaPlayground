package com.r4hu1.fridaplayground;

public class ChallengeModel {

    private String chall_desc,button_desc;

    public ChallengeModel(String chall_desc, String button_desc) {
        this.chall_desc = chall_desc;
        this.button_desc = button_desc;
    }

    public String getChall_desc() {
        return chall_desc;
    }

    public void setChall_desc(String chall_desc) {
        this.chall_desc = chall_desc;
    }

    public String getButton_desc() {
        return button_desc;
    }

    public void setButton_desc(String button_desc) {
        this.button_desc = button_desc;
    }
}
