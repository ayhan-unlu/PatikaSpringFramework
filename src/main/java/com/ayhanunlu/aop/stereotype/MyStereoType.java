package com.ayhanunlu.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Stereotype
@Target({TYPE,METHOD,FIELD})
@Retention(RUNTIME)
@Documented
@Named
@ApplicationScoped

/*
Can be Used only for classes not interfaces
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
 */

public @interface MyStereoType {
}
