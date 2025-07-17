package com.ayhanunlu.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@MyStereoType
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StereoTypeBean {

    private Long id;
    private String name = "Hello From StereoTypeBean";
    private String trade;
}
