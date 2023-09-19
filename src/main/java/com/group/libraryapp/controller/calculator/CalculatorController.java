package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController //API의 진입점이다. 이 클래스를 api로 만들어주는 것이다 ,API의 입구 아래 주어진 클래스를 Controller로 등록
public class CalculatorController {
    @GetMapping("/add") // get방식으로 HTTP Method를 정하겠다 ()안의 /add가 path가 되는 거임
    //GET /add?number1=10&number2=20
//    public int addTwoNumbers(@RequestParam int number1,@RequestParam int number2) { // key값으로 두 인자를 받아옴 annotation으로 number1,2에 값을 넣어주겠다 라는 진입점을 만듬
//        return number1 + number2;
    public int addTwoNumbers(CalculatorAddRequest request) { // calculatorAddRequest가 중간애 데이터를 받아줌 이걸 dto라고 한다
        return request.getNumber1()+request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {return request.getNumber1()*request.getNumber2();} // dto 클래스로 받아줌


}
