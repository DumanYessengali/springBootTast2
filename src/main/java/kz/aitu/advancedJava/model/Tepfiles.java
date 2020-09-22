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
@Table(name = "tepfiles")
public class Tepfiles {
    @Id
    private Long id;

    private String fileBinary;
    @Column(name = "file_binary_byte")
    private String file_binary_byte;
}
