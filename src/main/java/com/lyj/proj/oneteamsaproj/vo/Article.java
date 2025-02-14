package com.lyj.proj.oneteamsaproj.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    private int id;
    private String regDate;
    private String updateDate;
    private int memberId;
    private int boardId;
    private String title;
    private String body;
    private int hitCount;
    private int goodReactionPoint;
    private int badReactionPoint;

    private String extra__writer;

    private String extra__repliesCount;

    private String extra__sumReactionPoint;

    private boolean userCanModify;
    private boolean userCanDelete;

    //  ---- 날짜/시간 표현 구간 시작 ----
    private String formattedDate;

    public String getFormattedDate() {
        return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }
    //  ---- 날짜/시간 표현 구간 끝 ----
}