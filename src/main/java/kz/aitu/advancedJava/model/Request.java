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
@Table(name="request")
public class Request {
    @Id
    private Long id;

    @Column(name = "request_user_id")
    private Long request_user_id;

    @Column(name = "response_user_id")
    private Long response_user_id;

    private Long caseId;
    @Column(name = "case_index_id")
    private Long case_index_id;

    private String createdType;
    private String comment;
    private String status;
    private Long timestamp;
    private Long sharestamp;
    private Long sharefinish;
    private Boolean favorite;
    private Long updatedTimestamp;
    private Long updatedBy;
    private String declinenote;
    @Column(name = "company_unit_id")
    private Long company_unit_id;
    @Column(name = "from_request_id")
    private Long from_request_id;




}
