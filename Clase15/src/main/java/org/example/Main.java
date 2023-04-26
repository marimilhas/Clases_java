package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        //obtenerObjetoFromJson();
        //obtenerMapFromJson();
        obtenerStringJsonFromObjetoConRelaciones();
    }

    public static void obtenerStringJsonFromObjeto() throws JsonProcessingException {
        Producto prod = new Producto();
        prod.setNombre("Destornillador");
        prod.setPrecio(10f);
        prod.setStock(100);

        ObjectMapper mapper = new ObjectMapper();
        String  stringJson =  mapper.writeValueAsString(prod);
        System.out.println(stringJson);
    }

    public static void obtenerStringJsonFromObjetoConRelaciones() throws JsonProcessingException {
        System.out.println("Hello world!");
        Persona pers = new Persona();
        pers.setNombre("Juan");
        Departamento depto = new Departamento();
        depto.setId(1);
        depto.setNombre("IT");
        pers.setDepartamento(depto);
        depto.setPersona(pers);

        ObjectMapper mapper = new ObjectMapper();
        String  stringJson =  mapper.writeValueAsString(pers);
        System.out.println(stringJson);
    }
    public static void obtenerObjetoFromJson () throws JsonMappingException, JsonProcessingException {
        String jsonStr = "{\"nombre\":\"Taladro\",\"stock\":10,\"precio\":50.2}";
        ObjectMapper mapper = new ObjectMapper();
        Producto otroProd = mapper.readValue(jsonStr, Producto.class) ;
        System.out.println(otroProd);

    }

    public static void obtenerMapFromJson () throws JsonMappingException, JsonProcessingException {
        String jsonStr = "{\"nombre\":\"Taladro\",\"stock\":10,\"precio\":50.2}";
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.readValue(jsonStr, new TypeReference<Map<String,Object>>(){}) ;
        System.out.println(map);

    }


}