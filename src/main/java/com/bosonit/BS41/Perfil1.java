package com.bosonit.BS41;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")

public class Perfil1 implements Perfiles {

    @Value("${spring.profiles.active}")
    String perfil;

    public String getPerfil() {
        return perfil;
    }

    public void miFuncion() {
        System.out.println("Esta activo el " + perfil);
    }
}
