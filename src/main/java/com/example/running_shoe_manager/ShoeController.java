package com.example.running_shoe_manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ShoeController {
    private final ShoeRepository repository;

    // トップ画面：シューズ一覧を表示する
    @GetMapping("/")
    public String index(Model model) {
        List<Shoe> shoes = repository.findAll();
        model.addAttribute("shoes", shoes);
        return "index"; // index.html を表示する
    }

    // シューズの登録処理
    @PostMapping("/add")
    public String add(@ModelAttribute Shoe shoe) {
        repository.save(shoe);
        return "redirect:/"; // 登録が終わったらトップ画面に戻る
    }
}