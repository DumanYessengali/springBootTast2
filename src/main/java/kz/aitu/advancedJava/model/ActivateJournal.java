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
@Table(name = "activate_Journal")
public class ActivateJournal {
    @Id
    private long id;

    private String event_type;
    private String object_type;
    private long object_id;
    private long created_timestamp;
    private long created_by;
    private String message_level;
    private String message;
}
