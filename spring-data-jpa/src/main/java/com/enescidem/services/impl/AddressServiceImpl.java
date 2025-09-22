package com.enescidem.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enescidem.dto.DtoAddress;
import com.enescidem.dto.DtoCustomer;
import com.enescidem.entites.Address;
import com.enescidem.entites.Customer;
import com.enescidem.repository.AddressRepository;
import com.enescidem.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public DtoAddress findAddressById(Long id) {
		DtoAddress dtoAddress = new DtoAddress();
		DtoCustomer dtoCustomer = new DtoCustomer();
		Optional<Address> optional = addressRepository.findById(id);

		if (optional.isPresent()) {
			Address dbAddress = optional.get();
			Customer dbCustomer = optional.get().getCustomer();
			BeanUtils.copyProperties(dbAddress, dtoAddress);
			BeanUtils.copyProperties(dbCustomer, dtoCustomer);
			dtoAddress.setCustomer(dtoCustomer);
			return dtoAddress;

		}
		return null;
	}

}
