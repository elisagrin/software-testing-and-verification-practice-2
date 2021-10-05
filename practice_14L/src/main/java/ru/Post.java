package ru;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Post implements AllFunc{
    @JsonProperty("text")
    public String text;

    @JsonProperty("creationDate")
    public LocalDate creationDate;

    //конструктор
    public Post(String text, LocalDate creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    //getters and setters
    //for 5 semestr testirovaniye i verification - practic 3
    /**
     * returns text
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * returns creationDate
     * @return creationDate
     */
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    //toString для вывода объектов
    /**
     * returns all params in string
     * @return params in string
     */
    @Override
    public String toString() {
        return "Post{" +
                "text='" + text + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
