## Spring Boot Configuration: Environment Variables vs. Properties

- In `docker-compose.yml`, environment variable names use **uppercase** and **underscores** (e.g., `SPRING_DATASOURCE_URL`).  
  This is the standard for environment variables in Linux and Docker.

- In `application.properties`, property names use **lowercase** and **dots** (e.g., `spring.datasource.url`).  
  This is the Spring Boot convention for configuration files.

### How Spring Boot Maps Environment Variables

Spring Boot automatically maps environment variables to property names by converting uppercase and underscores to lowercase and dots.

**Example mapping:**

| Environment Variable         | Property Name                |
|-----------------------------|------------------------------|
| `SPRING_DATASOURCE_URL`     | `spring.datasource.url`      |
| `SPRING_DATASOURCE_USERNAME`| `spring.datasource.username` |
| `SPRING_DATASOURCE_PASSWORD`| `spring.datasource.password` |

This allows you to override properties via environment variables in Docker without changing your code or property files.

### Docker Containers Can Share Env Variable  
  Containers cannot directly access each other's environment variables, even if they are on the same Docker network. Each container's environment variables are isolated and only available inside that specific container.

### @OneToMany: One product can have many images.
  mappedBy = "product": The Image entity has a field named product that owns the relationship.
  cascade = CascadeType.ALL: All operations (save, delete, etc.) on Product will also apply to its images.
  orphanRemoval = true: If an image is removed from the product's image list, it will be deleted from the database.

  You do not need a product_id field in Product.java. The product_id column is automatically
  created in the Image table as a foreign key referencing the id column in the Product table.
  This is how the link between images and products is maintained in the database.