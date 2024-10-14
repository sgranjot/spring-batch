package com.example.batchprocessing;

public record Person(String firstName, String lastName) {

}

/*
Un record es una clase especial en Java que permite definir de manera simple objetos 
que son principalmente contenedores de datos (similares a un POJO, pero más conciso). 
Automáticamente, el compilador genera:
    -Campos finales (inmutables): firstName y lastName
    -Constructor público que toma los valores de los campos declarados.
    -Métodos equals(), hashCode() y toString()
*/
