package com.dio.padroes.de.java;

public final class SingletonLazy {
    private static SingletonLazy instancia;
    public String valor;

    private SingletonLazy(String valor) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }

    public static SingletonLazy getInstance(String valor){
      if (instancia == null){
          instancia = new SingletonLazy(valor);
      }
      return instancia;
    }

}
