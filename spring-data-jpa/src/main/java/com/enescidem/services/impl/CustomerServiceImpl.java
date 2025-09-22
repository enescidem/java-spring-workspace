package com.enescidem.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enescidem.dto.DtoAddress;
import com.enescidem.dto.DtoCustomer;
import com.enescidem.entites.Address;
import com.enescidem.entites.Customer;
import com.enescidem.repository.CustomerRepository;
import com.enescidem.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public DtoCustomer findCustomerById(Long id) {
		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		Optional<Customer> optional = customerRepository.findById(id);

		if (optional.isPresent()) {
			Customer dbCustomer = optional.get();
			Address dbaddress = optional.get().getAddress();
			BeanUtils.copyProperties(dbCustomer, dtoCustomer);

			BeanUtils.copyProperties(dbaddress, dtoAddress);
			dtoCustomer.setAddress(dtoAddress);
			return dtoCustomer;
		}
		return null;

	}

}
