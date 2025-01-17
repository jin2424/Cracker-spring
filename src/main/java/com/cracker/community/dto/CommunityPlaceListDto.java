package com.cracker.community.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommunityPlaceListDto {
    private Long communityId;
    private String name;
    private String addr;
    private String addrRoad;
    private String coordX;
    private String coordY;
    private String phoneNum;
    private String cate;
    private String markerPic;
    private String url;

    private Integer countPlaces;

    @Builder
    public CommunityPlaceListDto(Long communityId, String name, String addr, String addrRoad, String coordX,
                               String coordY, String phoneNum, String cate, String markerPic, String url, Integer countPlaces) {
        this.communityId = communityId;
        this.name = name;
        this.addr = addr;
        this.addrRoad = addrRoad;
        this.coordX = coordX;
        this.coordY = coordY;
        this.phoneNum = phoneNum;
        this.cate = cate;
        this.markerPic = markerPic;
        this.url = url;
        this.countPlaces = countPlaces;
    }
}
