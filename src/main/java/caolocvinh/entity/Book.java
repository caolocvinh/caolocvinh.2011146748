package caolocvinh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import caolocvinh.Validator.annotation.ValidCategoryId;
import caolocvinh.Validator.annotation.ValidUserId;
import lombok.Data;

@Data
@Entity
@Table(name ="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "title")
    @NotEmpty(message = "Title must not be empty")
    private String title;

    @Column(name =  "author")
    private String author;

    @Column (name = "price")
    @NotNull(message = "Price is required")
    private  Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;
}
