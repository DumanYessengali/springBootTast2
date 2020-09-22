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
@Table(name="nomenclature")
public class Nomenclature {
    @Id
    private Long id;

    private String nomenclatureNumber;
    private Long year;
    @Column(name = "nomenclature_summary_id")
    private Long nomenclature_summary_id;

    @Column(name = "company_unit_id")
    private Long company_unit_id;

    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}
