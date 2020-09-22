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
@Table(name = "search_key_routing")
public class SearchKeyRouting {
    @Id
    private Long id;

    @Column(name = "search_key_id")
    private Long search_key_id;
    private String tableName;

    private Long tableId;
    private String type;
}
