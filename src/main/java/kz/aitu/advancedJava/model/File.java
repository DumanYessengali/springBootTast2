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
@Table(name = "file")
public class File {
    @Id
    private Long id;

    private String name;
    private String type;
    private Long size;
    private Long pageCount;
    private String hash;
    private Boolean is_deleted;
    @Column(name = "file_binary_id")
    private Long file_binary_id;

    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}
