package com.enescidem.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enescidem.dto.DtoHome;
import com.enescidem.dto.DtoRoom;
import com.enescidem.entites.Home;
import com.enescidem.entites.Room;
import com.enescidem.repository.HomeRepository;
import com.enescidem.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private HomeRepository homeRepository;

	@Override
	public DtoHome findHomeById(Long id) {
		DtoHome dtoHome = new DtoHome();

		Optional<Home> optional = homeRepository.findById(id);
		if (optional.isPresent()) {
			Home dbHome = optional.get();
			List<Room> dbRooms = optional.get().getRoom();
			BeanUtils.copyProperties(dbHome, dtoHome);

			if (dbRooms != null && !dbRooms.isEmpty()) {
				for (Room room : dbRooms) {
					DtoRoom dtoRoom = new DtoRoom();
					BeanUtils.copyProperties(room, dtoRoom);
					dtoHome.getRooms().add(dtoRoom);
				}
			}
			return dtoHome;	
		}
		return null;
	}

}
