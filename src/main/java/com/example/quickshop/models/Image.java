package com.example.quickshop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
    @Id
    // Each new record gets the next available number as its ID.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;
    private String downloadUrl;

    @Lob
    private Blob image;

    /*
      You do not need a product_id field in Product.java. The product_id column is automatically
      created in the Image table as a foreign key referencing the id column in the Product table.
      This is how the link between images and products is maintained in the database.
    */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
