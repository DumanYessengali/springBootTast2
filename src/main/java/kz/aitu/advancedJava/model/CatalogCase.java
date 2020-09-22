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
@Table(name = "catalog_case")
public class CatalogCase {
    @Id
    private Long id;
    private Long caseId;
    private Long catalogId;

    @Column(name = "company_unit_id")
    private Long company_unit_id;

    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}