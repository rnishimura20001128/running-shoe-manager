package com.example.running_shoe_manager;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
    // 現役のシューズだけを取得する
    List<Shoe> findByIsActiveTrue();

    // ブランド名またはモデル名に部分一致するシューズを取得する
    List<Shoe> findByBrandContainingOrModelNameContaining(String brand, String modelName);
}