package com.form_register.dto;
import javax.validation.constraints.*;

public class UserDto {
    private int id;
    @NotNull(message = "Khong duoc null")
    @NotEmpty(message = "Khong duoc trong")
    @NotBlank(message = "Khong duoc chi dung ki tu trang nhe")
    @Size(min = 5,max = 45,message = "Tu 5-45 ki tu")
    private String firstName;

    @NotNull(message = "Khong duoc null")
    @NotEmpty(message = "Khong duoc trong")
    @NotBlank(message = "Khong duoc chi dung ki tu trang")
    @Size(min = 5,max = 45,message = "Tu 5-45 ki tu")
    private String lastName;
    @Pattern(regexp = "^0905\\d{6,7}",message = "Sai dinh dang")
    private String phoneNumber;

    @Min(value = 18,message = "Lon hon 18 tuoi")
    private int age;
    @Email(message = "Sai dinh dang")
    private String email;

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, String phoneNumber, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}