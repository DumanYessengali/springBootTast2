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
@Table(name = "company_unit")
public class CompanyUnit {
    @Id
    private Long id;

    private String nameRu;
    private String nameKz;
    private String nameEn;
    private Long parentId;
    private Long year;
    private Long companyId;
    private String codeIndex;
    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}
