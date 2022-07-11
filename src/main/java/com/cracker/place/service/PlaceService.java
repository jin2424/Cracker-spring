package com.cracker.place.service;

import com.cracker.place.domain.Place;
import com.cracker.place.dto.PlaceCreateRequestDto;
import com.cracker.place.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService {
    private final PlaceRepository placeRepository;

    @Transactional
    public Long save(PlaceCreateRequestDto placeCreateRequestDto) {
        Place place = Place.builder()
                .name(placeCreateRequestDto.getName())
                .addr(placeCreateRequestDto.getAddr())
                .addrRoad(placeCreateRequestDto.getAddrRoad())
                .coordX(placeCreateRequestDto.getCoordX())
                .coordY(placeCreateRequestDto.getCoordY())
                .phoneNum(placeCreateRequestDto.getPhoneNum())
                .cate(placeCreateRequestDto.getCate())
        .build();

        return placeRepository.save(place).getId();
    }

    @Transactional
    public List<Place> placeList() {
        return placeRepository.findAll();
    }

    @Transactional
    public Long deletePlace(Long id) {
        placeRepository.deleteById(id);
        return id;
    }

    @Transactional
    public Place placeSearch(Long id){
        return placeRepository.getById(id);
    }
}
