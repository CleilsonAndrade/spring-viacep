package br.cleilsonandrade.springviacep.service;

import org.springframework.stereotype.Service;

import br.cleilsonandrade.springviacep.feign.AddressFeign;
import br.cleilsonandrade.springviacep.model.dto.AddressRequest;
import br.cleilsonandrade.springviacep.model.dto.AddressResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AddressService {
  private final AddressFeign addressFeign;

  public AddressResponse execute(AddressRequest addressRequest) {
    return addressFeign.getAddressCep(addressRequest.getCep());
  }
}
