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
@Table(name="company")
public class Company {
    @Id
    private Long id;

    private String nameRu;
    private String nameKz;
    private String nameEn;
    private String bin;
    private Long parentId;
    private Long fondId;
    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}
