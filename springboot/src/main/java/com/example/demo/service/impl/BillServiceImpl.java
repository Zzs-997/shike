package com.example.demo.service.impl;

import com.example.demo.domain.Bill;
import com.example.demo.domain.BillExample;
import com.example.demo.mapper.BillMapper;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public Bill selectBillBybillPhone(String billPhone){
        BillExample billExample = new BillExample();
        billExample.createCriteria().andPhoneEqualTo(billPhone);

        List<Bill> bill = billMapper.selectByExample(billExample);

        return bill.get(0);
    }
}
