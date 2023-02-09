package com.form_register.dto;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

public class SongDto {
    private int id;
    @NotNull(message = "Khong Null")
    @NotBlank(message = "khong duoc de trong")
    @Size(min = 0,max = 800,message = "Khong duoc qua 800 ky tu")
    @Pattern(regexp = "^[\\w|\\s]+$",message = "Sai dinh dang")
    private String name;
    @NotNull(message = "Khong Null")
    @NotBlank(message = "khong duoc de trong")
    @Size(min = 0,max = 300,message = "Khong duoc qua 300 ky tu")
    @Pattern(regexp = "^[\\w|\\s]+$",message = "Sai dinh dang")
    private String artist;
    @NotNull(message = "Khong Null")
    @NotBlank(message = "khong duoc de trong")
    @Size(min = 0,max = 1000,message = "Khong duoc qua 1000 ky tu")
    @Pattern(regexp = "^[\\w|\\s]+$",message = "Sai dinh dang")
    private String typeOfMusic;

    public SongDto() {
    }

    public SongDto(int id, String name, String artist, String typeOfMusic) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.typeOfMusic = typeOfMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTypeOfMusic() {
        return typeOfMusic;
    }

    public void setTypeOfMusic(String typeOfMusic) {
        this.typeOfMusic = typeOfMusic;
    }
}