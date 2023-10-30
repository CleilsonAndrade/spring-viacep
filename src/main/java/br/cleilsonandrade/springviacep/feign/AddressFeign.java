package br.cleilsonandrade.springviacep.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.cleilsonandrade.springviacep.model.dto.AddressResponse;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface AddressFeign {

  @GetMapping("{cep}/json")
  AddressResponse getAddressCep(@PathVariable("cep") String cep);

}