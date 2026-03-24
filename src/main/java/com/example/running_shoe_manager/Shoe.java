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
    private String category;       // カテゴリ
    private Float size;           // サイズ(小数第一位までしか入力しない想定、8バイトのdoubleより小さい4バイトのfloatを採用)
    private Double limitDistance = 0.0; // 上限走行距離
    private Boolean hasPlate = false; // カーボンプレート有無
    private String memo;             // メモ
}