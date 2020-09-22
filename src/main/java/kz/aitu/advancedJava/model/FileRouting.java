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
@Table(name = "file_routing")
public class FileRouting {
    @Id
    private Long id;

    private Long fileId;

    private String  tableName;
    private Long tableId;
    private String type;
}
