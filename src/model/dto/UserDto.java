package model.dto;

public class UserDto {
    private String userName;
    private String email;

    public UserDto(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
