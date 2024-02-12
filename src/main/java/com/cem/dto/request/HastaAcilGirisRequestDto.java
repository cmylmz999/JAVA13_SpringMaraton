package com.cem.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HastaAcilGirisRequestDto {

    String ad;
    String soyad;
    String tcKimlik;
}
