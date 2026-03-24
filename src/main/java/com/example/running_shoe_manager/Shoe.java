package com.example.running_shoe_manager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Shoe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;         // ブランド
    private String modelName;     // モデル名
    private Double totalDistance = 0.0; // 走行距離
    private LocalDate purchasedAt; // 購入日
    private Boolean isActive = true; // 現役かどうか
}