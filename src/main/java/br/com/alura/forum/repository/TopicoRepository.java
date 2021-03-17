package br.com.alura.forum.repository;


import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//                                 Nossa interface irá herdar do jpaRepository, e temos que passar a Entidade o tipo do
//                                  atributo da chave primária
public interface TopicoRepository extends JpaRepository <Topico, Long> {

    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
}
