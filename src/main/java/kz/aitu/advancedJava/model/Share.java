package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "share")
public class Share {
    @Id
    private Long id;

    private Long request_id;

    private String note;
    private Long senderId;
    private Long receiverId;
    private Long shareTimestamp;
}
