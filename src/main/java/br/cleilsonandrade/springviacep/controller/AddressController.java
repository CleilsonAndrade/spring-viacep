package br.cleilsonandrade.springviacep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.cleilsonandrade.springviacep.model.dto.AddressRequest;
import br.cleilsonandrade.springviacep.service.AddressService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AddressController {

  private final AddressService addressService;

  @GetMapping("/consultas")
  public ResponseEntity getCep(@RequestBody AddressRequest addressRequest) {
    return ResponseEntity.ok(this.addressService.execute(addressRequest));
  }
}
