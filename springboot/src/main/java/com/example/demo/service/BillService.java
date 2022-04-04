package com.example.demo.service;

import com.example.demo.domain.Bill;

import java.util.Vector;

public interface BillService {
    Bill selectBillBybillPhone(String billPhone);
}
