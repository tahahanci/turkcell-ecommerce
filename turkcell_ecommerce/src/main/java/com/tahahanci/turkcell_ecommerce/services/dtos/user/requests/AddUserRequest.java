package com.tahahanci.turkcell_ecommerce.services.dtos.user.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class AddUserRequest {

        @NotBlank(message = "Name cannot be blank!")
        @Min(value = 2, message = "Name must be at least 2 characters")
        private String name;

        @NotBlank(message = "Surname cannot be blank!")
        @Min(value = 2, message = "Surname must be at least 2 characters")
        private String lastName;

        @NotBlank(message = "Email cannot be blank!")
        @Email(message = "Email should be valid!")
        private String email;

        @NotBlank(message = "Password cannot be blank!")
        @Min(value = 6, message = "Password must be at least 6 characters")
        private String password;

        @NotBlank(message = "Phone number cannot be blank!")
        @Min(value = 10, message = "Phone number must be at least 10 characters")
        private String phoneNumber;

        public AddUserRequest() {
        }

        public AddUserRequest(String name, String lastName, String email, String password, String phoneNumber) {
            this.name = name;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
}
