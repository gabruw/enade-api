package com.uniacademia.enade.api.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IncludeUser implements Serializable {
	private static final long serialVersionUID = 4919296048494520957L;

	@Size(min = 1, max = 200, message = "O campo 'Nome' deve conter entre 1 e 200 caracteres.")
	private String name;

	@CPF(message = "O campo 'CPF' é inválido.")
	private String cpf;

	@NotNull(message = "O campo 'Data de Nascimento' é obrigatório.")
	private Date birth;

	@Size(max = 2500, message = "O campo 'Imagem' deve conter no máximo 2500 caracteres.")
	private String picture;

	@Override
	public String toString() {
		return "InsertUser [name=" + name + ", cpf=" + cpf + ", birth=" + birth + ", picture=" + picture + "]";
	}
}
