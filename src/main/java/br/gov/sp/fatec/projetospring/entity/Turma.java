package br.gov.sp.fatec.projetospring.entity;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="trm_turma")
public class Turma {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "trm_id")
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm") //aqui to deixando o formato da data e hora mais facil de aplicar;
    @Column (name = "trm_data_hora_cadastro")
    private LocalDateTime data_hora_cadastro;

    @Column (name = "trm_ano")
    private Integer ano;

    @Column (name = "trm_semestre")
    private Integer semestre;

    @Column (name = "trm_tamanho")
    private Integer tamanho;

    public Turma() {
        
    }

    // public Turma(LocalDateTime data_hora_cadastro, Integer ano, Integer semestre, Integer tamanho){
        
    //     this.data_hora_cadastro = data_hora_cadastro;
    //     this.ano = ano;
    //     this.semestre = semestre;
    //     this.tamanho = tamanho;
    // }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getData_hora_cadastro() {
        return data_hora_cadastro;
    }


    public void setData_hora_cadastro(LocalDateTime data_hora_cadastro) {
        this.data_hora_cadastro = data_hora_cadastro;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    
    
}
