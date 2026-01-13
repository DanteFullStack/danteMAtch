package com.alura.screenmatch.excepcion;

public class ErrorEnConvercionDeDuracionExepcion extends RuntimeException{
   private String mensaje;

    public ErrorEnConvercionDeDuracionExepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
