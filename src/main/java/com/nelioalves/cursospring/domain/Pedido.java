package com.nelioalves.cursospring.domain;

import com.nelioalves.cursospring.domain.enums.EstadoPagamento;

public class Pedido {

	private Integer id;
	private EstadoPagamento estado;

	private Endereco enderecoDeEntrega;
	private Cliente cliente;
	private Pagamento pagamento;

	public Pedido() {
	}

	public Pedido(Integer id, EstadoPagamento estado, Endereco enderecoDeEntrega, Cliente cliente,
			Pagamento pagamento) {
		super();
		this.id = id;
		this.estado = estado;
		this.enderecoDeEntrega = enderecoDeEntrega;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstado() {
		return estado;
	}

	public void setEstado(EstadoPagamento estado) {
		this.estado = estado;
	}

	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
