package web;
import java.util.*;
import org.springframework.ui.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
class Number {
	@GetMapping("/list-factor")
	ArrayList getFactor(int number) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				a.add(i);
			}
		}
		return a;
	}
}


@Controller
class NumberWeb {
	@GetMapping("/show-factor")
	String getFactor(Model model, Integer number) {
		ArrayList<Integer> a = new ArrayList<>();
		if (number != null) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					a.add(i);
				}
			}
		}
		model.addAttribute("result", a);
		return "show-result";
	}
}
