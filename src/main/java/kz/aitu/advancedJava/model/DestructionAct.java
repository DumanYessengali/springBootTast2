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
@Table(name = "destruction_act")
public class DestructionAct {
    @Id
    private Long id;

    private String actNumber;
    private String base;

    @Column(name = "structural_subdivision_id")
    private Long structural_subdivision_id;

    private Long createdTimestamp;
    private Long createdBy;
    private Long updatedTimestamp;
    private Long updatedBy;
}