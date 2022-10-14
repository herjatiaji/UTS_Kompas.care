package com.pad1.uts_kompascare;

import java.util.Date;

public class News {
    private String headlines;
    private String content;
    private String category;
    private int minAge;
    private String releaseDate;


    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private int newspic;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public News(String headLines, String category, int newspic, int minAge, String releaseDate,String content){
        this.headlines = headLines;
        this.minAge = minAge;
        this.releaseDate = releaseDate;
        this.category = category;
        this.content = content;
        this.newspic = newspic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeadlines() {
        return headlines;
    }

    public void setHeadlines(String headlines) {
        this.headlines = headlines;
    }

    public int getNewspic() {
        return newspic;
    }

    public void setNewspic(int newspic) {
        this.newspic = newspic;
    }
}
