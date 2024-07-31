package dev.f012.liquibaserepro.database.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TestModel")
@Table(name = "test")
@Builder
public class TestModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
