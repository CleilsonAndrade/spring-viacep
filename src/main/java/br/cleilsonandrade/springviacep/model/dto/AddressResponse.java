package br.cleilsonandrade.springviacep.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddressResponse {
  private String cep;

  private String logradouro;

  private String bairro;

  private String localidade;

  private String uf;
}
