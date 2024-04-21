package com.example.banking.service;

import com.example.banking.dto.BankResponse;
import com.example.banking.dto.UserRequest;

public interface UserService {
	BankResponse createAccount(UserRequest userRequest);
	
}
