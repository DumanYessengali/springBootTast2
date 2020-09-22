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
@Table(name = "users")
public class Users {
    @Id
    private Long id;

    private Long authId;
    private String name;
    private String fullname;
    private String surname;
    private String secondname;
    private String status;

    @Column(name = "company_unit_id")
    private Long company_unit_id;

    private String password;


    @Column(name = "last_login_timestamp")
    private Long last_login_timestamp;

    private String iin;
    private Boolean isActive;
    private Boolean isActiveted;
    private Long companyId;
    private String codeIndex;
    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}
