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
@Table(name="case_index")
public class CaseIndex {
    @Id
    private Long id;

    private String caseIndex;
    private String titleRu;
    private String titleKx;
    private String titleEn;
    private Long storageType;
    private Long storageYear;
    private String note;

    @Column(name = "company_unit_id")
    private Long company_unit_id;

    private Long nomenclatureId;

    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}
