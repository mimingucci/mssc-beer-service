package vnt.com.msscbeerservice.web.service;

import org.springframework.stereotype.Service;
import vnt.com.msscbeerservice.web.model.BeerDto;
import vnt.com.msscbeerservice.web.model.BeerStyleEnum;

import java.util.Date;
import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getById(UUID beerId) {
        return BeerDto.builder()
                .beerName("Hanoi")
                .beerStyle(BeerStyleEnum.LAGER)
                .quantityOnHand(1)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .quantityOnHand(beerDto.getQuantityOnHand())
                .beerName(beerDto.getBeerName())
                .upc(beerDto.getUpc())
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto getByUpc(String upc) {
        return null;
    }
}
