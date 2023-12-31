package com.proyecto.onlybooks.service;

import com.proyecto.onlybooks.dto.BookSummary;
import com.proyecto.onlybooks.dto.UserDTO;
import com.proyecto.onlybooks.dto.UserSummary;
import com.proyecto.onlybooks.entity.Book;
import com.proyecto.onlybooks.entity.User;
import com.proyecto.onlybooks.exceptions.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {

    Long guardar(User user);
    List<UserDTO> mostrarTodos();
    UserDTO buscarPorId(Long id) throws ResourceNotFoundException;
    void modificar(User user);
    void eliminar(Long id) throws ResourceNotFoundException;
    UserDTO buscarPorEmail(String email) throws ResourceNotFoundException;
    List<Book> listarFavoritos( Long id) throws ResourceNotFoundException;
    void eliminarFavorito(Long userId, Long bookId) throws ResourceNotFoundException;
    List<UserSummary> listarUserExpress() throws ResourceNotFoundException;

}
