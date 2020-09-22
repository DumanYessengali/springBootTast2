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
@Table(name="case_table")
public class CaseTable {
    @Id
    private Long id;

    private String caseNumber;
    private String volumeNumber;

    @Column(name = "case_title_ru")
    private String case_title_ru;

    @Column(name = "case_title_kz")
    private String case_title_kz;

    @Column(name = "case_title_en")
    private String case_title_en;

    private Long startDate;
    private Long endDate;
    private Long pageNumber;
    @Column(name = "signature_flag_eds")
    private Boolean signature_flag_eds;

    private String signatureEds;
    @Column(name = "naf_sign_sending")
    private Boolean naf_sign_sending;

    private Boolean deletionSign;
    private Boolean restrictedFlag;

    private String hash;
    private Long version;
    private Long idVersoin;
    @Column(name = "active_version_flag")
    private Boolean active_version_flag;

    private String note;
    private Long locationId;
    @Column(name = "index_case_id")
    private Long index_case_id;

    private Long recordId;
    @Column(name = "destruction_act_id")
    private Long destruction_act_id;

    @Column(name = "structural_unit_id")
    private Long structural_unit_id;

    @Column(name = "blockchain_address_case")
    private String blockchain_address_case;

    @Column(name = "blockchain_date_added")
    private Long blockchain_date_added;

    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}
