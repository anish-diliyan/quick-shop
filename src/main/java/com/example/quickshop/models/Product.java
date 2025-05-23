package com.example.quickshop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private Long price;
    private int inventory;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    /*
      @OneToMany: One product can have many images.
      mappedBy = "product": The Image entity has a field named product that owns the relationship.
      cascade = CascadeType.ALL: All operations (save, delete, etc.) on Product will also apply to its images.
      orphanRemoval = true: If an image is removed from the product's image list, it will be deleted from the
      database.
    */
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;
}
