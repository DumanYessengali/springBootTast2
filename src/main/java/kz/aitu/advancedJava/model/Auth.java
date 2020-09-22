package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="auth")
public class Auth {
    @Id
    private Long id;

    private String username;
    private String email;
    private String password;
    private String rope;

    @Column(name = "forgot_password_key")
    private String forgot_password_key;

    @Column(name = "forgot_password_key_timestamp")
    private Long forgot_password_key_timestamp;


    @Column(name = "company_unit_id")
    private Long company_unit_id;
}
