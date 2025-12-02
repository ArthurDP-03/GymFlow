package br.com.gymflow.api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Document(collection = "equipamentos")
public abstract class  Equipamento implements Monitoravel {

    @Id
    private String id;
    private String nome;
    private StatusEquipamento status;
    private LocalDateTime ultimaAtualizacao;

    public Equipamento(String nome){
        this.nome = nome;
        this.status = StatusEquipamento.DISPONIVEL;
        this.ultimaAtualizacao = LocalDateTime.now();
    }
    
}

