package br.gov.sp.fatec.projetospring.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gov.sp.fatec.projetospring.entity.Turma;
import br.gov.sp.fatec.projetospring.repository.turmaRepository;

//questao 3 - 3 metodos um para cadastro, um para buscar todos registros e um para buscar turma
@Service
public class turmaService {
    
    @Autowired
    private turmaRepository turmaRepo;

    //listando todos os registros;
    public List<Turma> todasAsTurmas() {    
        return turmaRepo.findAll();
    }

    //buscando por ano, consulta anterior. Rota de paramentros esta no repository 
    public List<Turma> buscarTurmasPorAnoETamanho(Integer ano, Integer tamanho) {
        return turmaRepo.findTurmasByAnoAndTamanho(ano, tamanho);
    }

    //Cadastro de turmas :D
    public Turma cadastrarTurma(Turma turma) {
        return turmaRepo.save(turma);
    }

    /*para cadastrar, 
    1 - acessa o link https://www.webtools.services/online-rest-api-client, 
    2 - adicionar tipo de metodo, no caso do cadastro é metodo POST
    3 - cole a rota da aplicação do metodo de cadastrarTurma()
    4 - Em request settings, ir em BODY selecionar 'raw', selecionar json aplication. Logo abaixo colocar seguinte
    json ou algo parecido:
     
        {
            "ano": 2023,
            "semestre": 1,
            "tamanho": 30,
            "data_hora_cadastro": "2023-10-29 14:00" 
        }

    5 - clicar em SEND, e ta pronto o sorvetinho!😄🍦

     */
}
