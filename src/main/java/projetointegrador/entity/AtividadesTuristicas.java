package projetointegrador.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AtividadesTuristicas {
	
	// RELIGIOSO:
	private String capVieiras;
	private String SantNsaBrotas;
	private String OlhoAguaJoaodMaria;
	private String CatSantAna;
	private String MesquitaIslamica;
	private String MosteiroRessurreicao;
	private String SantuarioPedraFria; 
	private String SantaParedaoSerraVelha;
	
	// ECOTURISMO:
	private String ParqueEstCerrado;
	private String ParqueGuartela;
	private String ParqueMunBuracoPadre;
	private String ParqueEstVilaVelha;
	private String FazendaSaoDamasio;
	private String ReservaPartNaturalItaytyba;
	
	// AVENTURA
	private String CanyonsRioJaguariaiva;
	private String AquatrekkingTrilhaLagoAzul;
	private String RaftingTibagi;
	private String MorrosJacareComuna;
	private String montanhaPedraBranca;
	
	//CULTURAL RURAL
	private String MuseuColHolandesa;
	private String MoinhoHolandesArapoti;
	private String ColoniaWitmarsun;
}
