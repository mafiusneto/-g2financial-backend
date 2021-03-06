package g2financial.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity(name = "contas_a_receber_pagamento")
@Data
public class BillToPayPayment {

	@Id
	@Column(name = "Codigo")
	private Integer id;

	@Column(name = "Cod_Contas_a_receber")
	private Integer billToPayId;
	
	@Column(name = "Pago")
	private String isPay;
	
	@Column(name = "Operador")
	private String operator;
	
	@Column(name = "vencimento")
	@Temporal(TemporalType.DATE)
	private Date maturity;
	
	@Column(name = "Data_Hora")
	@Temporal(TemporalType.TIMESTAMP)
	private Date hourDate;
	
	@Column(name = "Observacao")
	private String Observation;
	
	@Column(name = "Valor_Pago")
	private Double amountPaid;
	
	@Column(name = "Juros")
	private Double interest;
	
	@Column(name = "Nosso_numero")
	private String ourNumber;
	
}
