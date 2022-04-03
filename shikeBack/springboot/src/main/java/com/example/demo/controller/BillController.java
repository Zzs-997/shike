package com.example.demo.controller;

import com.example.demo.domain.Bill;
import com.example.demo.entity.ResponseResult;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping("/selectBillBybillPhone/{billPhone}")
    public ResponseResult<Bill> selectBillBybillPhone(@PathVariable String billPhone) {
        Bill bill = billService.selectBillBybillPhone(billPhone);
        return new ResponseResult<>(ResponseResult.CodeStatus.OK, "查询账单", bill);
//        使用：http://localhost:9090/bill/selectBillBybillPhone/15207074966
    }
}
