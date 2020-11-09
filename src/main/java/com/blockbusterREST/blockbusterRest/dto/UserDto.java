package com.blockbusterREST.blockbusterRest.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDto {

    private Long id;
    @NotBlank(message = "First name can not be blank")
    @Size(min = 2, max = 15,message = "First name must be between 2 and 15")
    private String firstName;
    @NotBlank(message = "Last name can not be blank")
    @Size(min = 2, max = 15,message = "Last name must be between 2 and 15")
    private String lastName;
    @NotBlank(message = "Username can not be blank")
    @Size(min = 2, max = 40,message = "username must be between 2 and 40 ")
    private String username;

    @NotBlank(message = "Email can not be blank")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password can not be blank")
    @Size(min = 8, message = "Minimal length for password is 8 char")
    private String password;
    private CityDto cityDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CityDto getCityDto() {
        return cityDto;
    }

    public void setCityDto(CityDto cityDto) {
        this.cityDto = cityDto;
    }
}
