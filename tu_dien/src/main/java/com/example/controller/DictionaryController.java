package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    // Dictionary data
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        // Everyday vocabulary
        dictionary.put("morning", "Buổi sáng");
        dictionary.put("afternoon", "Buổi chiều");
        dictionary.put("evening", "Buổi tối");
        dictionary.put("night", "Đêm");
        dictionary.put("today", "Hôm nay");
        dictionary.put("tomorrow", "Ngày mai");
        dictionary.put("yesterday", "Hôm qua");
        dictionary.put("week", "Tuần");
        dictionary.put("month", "Tháng");
        dictionary.put("year", "Năm");
        dictionary.put("time", "Thời gian");
        dictionary.put("day", "Ngày");
        dictionary.put("man", "Đàn ông");
        dictionary.put("woman", "Phụ nữ");
        dictionary.put("child", "Trẻ em");
        dictionary.put("people", "Mọi người");
        dictionary.put("name", "Tên");
        dictionary.put("work", "Công việc");
        dictionary.put("job", "Nghề nghiệp");
        dictionary.put("money", "Tiền");
        dictionary.put("city", "Thành phố");
        dictionary.put("country", "Đất nước");
        dictionary.put("road", "Con đường");
        dictionary.put("car", "Xe hơi");
        dictionary.put("bus", "Xe buýt");
        dictionary.put("bicycle", "Xe đạp");
        dictionary.put("hospital", "Bệnh viện");
        dictionary.put("market", "Chợ");
        dictionary.put("restaurant", "Nhà hàng");
        dictionary.put("hotel", "Khách sạn");
        dictionary.put("teacher", "Giáo viên");
        dictionary.put("student", "Học sinh/Sinh viên");
        dictionary.put("class", "Lớp học");
        dictionary.put("lesson", "Bài học");
        dictionary.put("language", "Ngôn ngữ");
        dictionary.put("question", "Câu hỏi");
        dictionary.put("answer", "Câu trả lời");
        dictionary.put("idea", "Ý tưởng");
        dictionary.put("problem", "Vấn đề");
        dictionary.put("help", "Giúp đỡ");
        dictionary.put("eat", "Ăn");
        dictionary.put("drink", "Uống");
        dictionary.put("sleep", "Ngủ");
        dictionary.put("wake up", "Thức dậy");
        dictionary.put("go", "Đi");
        dictionary.put("come", "Đến");
        dictionary.put("walk", "Đi bộ");
        dictionary.put("run", "Chạy");
        dictionary.put("read", "Đọc");
        dictionary.put("write", "Viết");
        dictionary.put("listen", "Lắng nghe");
        dictionary.put("speak", "Nói");
        dictionary.put("learn", "Học");
        dictionary.put("teach", "Dạy");
        dictionary.put("buy", "Mua");
        dictionary.put("sell", "Bán");
        dictionary.put("open", "Mở");
        dictionary.put("close", "Đóng");
        dictionary.put("big", "To/Lớn");
        dictionary.put("small", "Nhỏ");
        dictionary.put("new", "Mới");
        dictionary.put("old", "Cũ/Già");
        dictionary.put("good", "Tốt");
        dictionary.put("bad", "Xấu/Tệ");
        dictionary.put("beautiful", "Đẹp");
        dictionary.put("easy", "Dễ");
        dictionary.put("difficult", "Khó");
        dictionary.put("hot", "Nóng");
        dictionary.put("cold", "Lạnh");
        dictionary.put("fast", "Nhanh");
        dictionary.put("slow", "Chậm");
        dictionary.put("red", "Màu đỏ");
        dictionary.put("blue", "Màu xanh dương");
        dictionary.put("green", "Màu xanh lá");
        dictionary.put("yellow", "Màu vàng");
        dictionary.put("black", "Màu đen");
        dictionary.put("white", "Màu trắng");
        dictionary.put("where", "Ở đâu");
        dictionary.put("when", "Khi nào");
        dictionary.put("why", "Tại sao");
        dictionary.put("who", "Ai");
        dictionary.put("what", "Cái gì");
        dictionary.put("hello", "Xin chào");
        dictionary.put("goodbye", "Tạm biệt");
        dictionary.put("thank you", "Cảm ơn bạn");
        dictionary.put("please", "Vui lòng");
        dictionary.put("yes", "Có/Vâng");
        dictionary.put("no", "Không");
        dictionary.put("sorry", "Xin lỗi");
        dictionary.put("excuse me", "Xin lỗi");
        dictionary.put("how are you", "Bạn khỏe không?");
        dictionary.put("fine", "Tốt/Khỏe");
        dictionary.put("water", "Nước");
        dictionary.put("food", "Thức ăn");
        dictionary.put("house", "Nhà");
        dictionary.put("book", "Sách");
        dictionary.put("computer", "Máy tính");
        dictionary.put("school", "Trường học");
        dictionary.put("love", "Yêu");
        dictionary.put("friend", "Bạn");
        dictionary.put("family", "Gia đình");
        dictionary.put("happy", "Vui vẻ");
    }

    // Display home page
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    // Handle search request
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@RequestParam(value = "keyword", defaultValue = "") String keyword, Model model) {
        String keyword_lower = keyword.trim().toLowerCase();
        
        model.addAttribute("keyword", keyword);
        
        if (keyword_lower.isEmpty()) {
            model.addAttribute("message", "Vui lòng nhập từ cần tìm!");
            model.addAttribute("found", false);
        } else if (dictionary.containsKey(keyword_lower)) {
            model.addAttribute("meaning", dictionary.get(keyword_lower));
            model.addAttribute("found", true);
        } else {
            model.addAttribute("message", "Không tìm thấy từ: " + keyword);
            model.addAttribute("found", false);
        }
        
        return "index";
    }
}
