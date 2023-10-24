package com.proyecto.onlybooks.service;

import com.proyecto.onlybooks.dto.BookDTO;
import com.proyecto.onlybooks.entity.Book;
import com.proyecto.onlybooks.exceptions.ResourceNotFoundException;

import java.util.List;

public interface IBookService {

        Long guardar(Book book);
        List<BookDTO> mostrarTodos() throws ResourceNotFoundException;
        BookDTO buscarPorId(Long id) throws ResourceNotFoundException;
        void modificar(Book book) ;
        void eliminar(Long id) throws ResourceNotFoundException;

        //List<String> buscarListaImagenes(Long id) throws ResourceNotFoundException;
}