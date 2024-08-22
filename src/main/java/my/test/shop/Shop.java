package my.test.shop;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "apples")
    private int apples;
    @Column(name = "oranges")
    private int oranges;
}
