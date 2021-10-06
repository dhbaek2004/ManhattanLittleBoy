package BaekInternational.ManhattanLittleBoy.controller;

import java.time.LocalDateTime;

public class QuestionForm {
    private String title;
    private String content;
    private LocalDateTime RegisterTime;
    private LocalDateTime ModifyTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRegisterTime() {
        return RegisterTime;
    }

    public void setRegisterTime(LocalDateTime registerTime) {
        RegisterTime = registerTime;
    }

    public LocalDateTime getModifyTime() {
        return ModifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        ModifyTime = modifyTime;
    }
}
