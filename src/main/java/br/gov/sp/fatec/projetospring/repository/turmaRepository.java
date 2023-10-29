package br.gov.sp.fatec.projetospring.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.gov.sp.fatec.projetospring.entity.Turma;


public interface turmaRepository extends JpaRepository<Turma, Long> {

    @Query("select t from Turma t where t.ano = 2023")
    public Optional<Turma> buscarPorano(Integer ano);
    
    
//   /turma/buscarPorAnoETamanho?ano=2023&tamanho=40
    @Query("select t from Turma t where t.ano = :anoParam and t.tamanho < :tamanhoParam")
    List<Turma> findTurmasByAnoAndTamanho(@Param("anoParam") Integer ano, @Param("tamanhoParam") Integer tamanho);
}
