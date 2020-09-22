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
@Table(name = "notification")
public class Notification {
    @Id
    private Long id;

    private String objectType;
    private Long objectId;
    @Column(name = "company_unit_id")
    private Long company_unit_id;

    private Long userId;
    private Long createdTimestamp;
    private Long viewedTimestamp;
    private Long isViewed;
    private String title;
    private String text;
    private Long companyId;

}
