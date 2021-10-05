package ru;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User implements AllFunc{
    //объявляем поля для базы данных
    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("middleName")
    public String middleName;
    @JsonProperty("birthDate")
    public String birthName;

    //конструктор
    public User(String firstName, String lastName, String middleName, String birthName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthName = birthName;
    }

    //getters and setters
    /**
     * returns firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * returns lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * returns middleName
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * returns birthName
     * @return birthName
     */
    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    //toString для вывода объектов
    /**
     * returns all params in string
     * @return params in string
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthName='" + birthName + '\'' +
                '}';
    }
}