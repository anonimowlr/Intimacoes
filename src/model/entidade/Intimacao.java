/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author f5078775
 */
@Entity
@Table(name = "tb_comunica_agencia_intimacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Intimacao.findAll", query = "SELECT i FROM Intimacao i")
    , @NamedQuery(name = "Intimacao.findByCdPrc", query = "SELECT i FROM Intimacao i WHERE i.cdPrc = :cdPrc")
    , @NamedQuery(name = "Intimacao.findByCdPrfUnd", query = "SELECT i FROM Intimacao i WHERE i.cdPrfUnd = :cdPrfUnd")
    , @NamedQuery(name = "Intimacao.findByCdPrfDepe", query = "SELECT i FROM Intimacao i WHERE i.cdPrfDepe = :cdPrfDepe")
    , @NamedQuery(name = "Intimacao.findByDtEntdPrc", query = "SELECT i FROM Intimacao i WHERE i.dtEntdPrc = :dtEntdPrc")
    , @NamedQuery(name = "Intimacao.findByDtSaidPrc", query = "SELECT i FROM Intimacao i WHERE i.dtSaidPrc = :dtSaidPrc")
    , @NamedQuery(name = "Intimacao.findByCdUsuArea", query = "SELECT i FROM Intimacao i WHERE i.cdUsuArea = :cdUsuArea")
    , @NamedQuery(name = "Intimacao.findByCdUsuEqp", query = "SELECT i FROM Intimacao i WHERE i.cdUsuEqp = :cdUsuEqp")
    , @NamedQuery(name = "Intimacao.findByCdUsuFun", query = "SELECT i FROM Intimacao i WHERE i.cdUsuFun = :cdUsuFun")
    , @NamedQuery(name = "Intimacao.findByCdEtp", query = "SELECT i FROM Intimacao i WHERE i.cdEtp = :cdEtp")
    , @NamedQuery(name = "Intimacao.findByDtLimite", query = "SELECT i FROM Intimacao i WHERE i.dtLimite = :dtLimite")
    , @NamedQuery(name = "Intimacao.findByCdTipPrc", query = "SELECT i FROM Intimacao i WHERE i.cdTipPrc = :cdTipPrc")
    , @NamedQuery(name = "Intimacao.findByCdEqp", query = "SELECT i FROM Intimacao i WHERE i.cdEqp = :cdEqp")
    , @NamedQuery(name = "Intimacao.findByCdPrfOper", query = "SELECT i FROM Intimacao i WHERE i.cdPrfOper = :cdPrfOper")
    , @NamedQuery(name = "Intimacao.findByCdAgrupPrc", query = "SELECT i FROM Intimacao i WHERE i.cdAgrupPrc = :cdAgrupPrc")
    , @NamedQuery(name = "Intimacao.findByCdTipAtend", query = "SELECT i FROM Intimacao i WHERE i.cdTipAtend = :cdTipAtend")
    , @NamedQuery(name = "Intimacao.findByPriorizado", query = "SELECT i FROM Intimacao i WHERE i.priorizado = :priorizado")
    , @NamedQuery(name = "Intimacao.findByCompartilhado", query = "SELECT i FROM Intimacao i WHERE i.compartilhado = :compartilhado")
    , @NamedQuery(name = "Intimacao.findByCdTipAtvd", query = "SELECT i FROM Intimacao i WHERE i.cdTipAtvd = :cdTipAtvd")
    , @NamedQuery(name = "Intimacao.findByCdDetalheOcr", query = "SELECT i FROM Intimacao i WHERE i.cdDetalheOcr = :cdDetalheOcr")
    , @NamedQuery(name = "Intimacao.findBySb", query = "SELECT i FROM Intimacao i WHERE i.sb = :sb")
    , @NamedQuery(name = "Intimacao.findByMatriculaSolicitante", query = "SELECT i FROM Intimacao i WHERE i.matriculaSolicitante = :matriculaSolicitante")
    , @NamedQuery(name = "Intimacao.findByCdCli", query = "SELECT i FROM Intimacao i WHERE i.cdCli = :cdCli")
    , @NamedQuery(name = "Intimacao.findByDtInicioEntd", query = "SELECT i FROM Intimacao i WHERE i.dtInicioEntd = :dtInicioEntd")
    , @NamedQuery(name = "Intimacao.findByValor", query = "SELECT i FROM Intimacao i WHERE i.valor = :valor")
    , @NamedQuery(name = "Intimacao.findByDtVenc", query = "SELECT i FROM Intimacao i WHERE i.dtVenc = :dtVenc")
    , @NamedQuery(name = "Intimacao.findByDtConclPrc", query = "SELECT i FROM Intimacao i WHERE i.dtConclPrc = :dtConclPrc")
    , @NamedQuery(name = "Intimacao.findByPermTotal", query = "SELECT i FROM Intimacao i WHERE i.permTotal = :permTotal")
    , @NamedQuery(name = "Intimacao.findByPermDilig", query = "SELECT i FROM Intimacao i WHERE i.permDilig = :permDilig")
    , @NamedQuery(name = "Intimacao.findByPermCso", query = "SELECT i FROM Intimacao i WHERE i.permCso = :permCso")
    , @NamedQuery(name = "Intimacao.findByDiasAtraso", query = "SELECT i FROM Intimacao i WHERE i.diasAtraso = :diasAtraso")
    , @NamedQuery(name = "Intimacao.findByIdentific1", query = "SELECT i FROM Intimacao i WHERE i.identific1 = :identific1")
    , @NamedQuery(name = "Intimacao.findByIdentific2", query = "SELECT i FROM Intimacao i WHERE i.identific2 = :identific2")
    , @NamedQuery(name = "Intimacao.findByIdentific3", query = "SELECT i FROM Intimacao i WHERE i.identific3 = :identific3")
    , @NamedQuery(name = "Intimacao.findByCdPrfUndOrigem", query = "SELECT i FROM Intimacao i WHERE i.cdPrfUndOrigem = :cdPrfUndOrigem")
    , @NamedQuery(name = "Intimacao.findBySbOrigem", query = "SELECT i FROM Intimacao i WHERE i.sbOrigem = :sbOrigem")
    , @NamedQuery(name = "Intimacao.findByDuracaoTarefas", query = "SELECT i FROM Intimacao i WHERE i.duracaoTarefas = :duracaoTarefas")
    , @NamedQuery(name = "Intimacao.findByDtLimiteInicial", query = "SELECT i FROM Intimacao i WHERE i.dtLimiteInicial = :dtLimiteInicial")
    , @NamedQuery(name = "Intimacao.findByDtEtpAtual", query = "SELECT i FROM Intimacao i WHERE i.dtEtpAtual = :dtEtpAtual")
    , @NamedQuery(name = "Intimacao.findByCdUltimaOcr", query = "SELECT i FROM Intimacao i WHERE i.cdUltimaOcr = :cdUltimaOcr")
    , @NamedQuery(name = "Intimacao.findByCdUltOcrPrc", query = "SELECT i FROM Intimacao i WHERE i.cdUltOcrPrc = :cdUltOcrPrc")
    , @NamedQuery(name = "Intimacao.findByCdUltTarefaPrc", query = "SELECT i FROM Intimacao i WHERE i.cdUltTarefaPrc = :cdUltTarefaPrc")
    , @NamedQuery(name = "Intimacao.findByDtDevOcr", query = "SELECT i FROM Intimacao i WHERE i.dtDevOcr = :dtDevOcr")
    , @NamedQuery(name = "Intimacao.findByDtSla", query = "SELECT i FROM Intimacao i WHERE i.dtSla = :dtSla")
    , @NamedQuery(name = "Intimacao.findByAtraso1n", query = "SELECT i FROM Intimacao i WHERE i.atraso1n = :atraso1n")
    , @NamedQuery(name = "Intimacao.findByAtraso2n", query = "SELECT i FROM Intimacao i WHERE i.atraso2n = :atraso2n")
    , @NamedQuery(name = "Intimacao.findByCdAgendaPrc", query = "SELECT i FROM Intimacao i WHERE i.cdAgendaPrc = :cdAgendaPrc")
    , @NamedQuery(name = "Intimacao.findByCdFasePrc", query = "SELECT i FROM Intimacao i WHERE i.cdFasePrc = :cdFasePrc")
    , @NamedQuery(name = "Intimacao.findByCdPrcVinc", query = "SELECT i FROM Intimacao i WHERE i.cdPrcVinc = :cdPrcVinc")
    , @NamedQuery(name = "Intimacao.findByCdTipOrigem", query = "SELECT i FROM Intimacao i WHERE i.cdTipOrigem = :cdTipOrigem")
    , @NamedQuery(name = "Intimacao.findByDtLimiteCli", query = "SELECT i FROM Intimacao i WHERE i.dtLimiteCli = :dtLimiteCli")
    , @NamedQuery(name = "Intimacao.findByDiasAtrasoCli", query = "SELECT i FROM Intimacao i WHERE i.diasAtrasoCli = :diasAtrasoCli")
    , @NamedQuery(name = "Intimacao.findByPermCli", query = "SELECT i FROM Intimacao i WHERE i.permCli = :permCli")
    , @NamedQuery(name = "Intimacao.findByCdControle", query = "SELECT i FROM Intimacao i WHERE i.cdControle = :cdControle")
    , @NamedQuery(name = "Intimacao.findByCdUsuEntd", query = "SELECT i FROM Intimacao i WHERE i.cdUsuEntd = :cdUsuEntd")
    , @NamedQuery(name = "Intimacao.findByCdUsuLatl", query = "SELECT i FROM Intimacao i WHERE i.cdUsuLatl = :cdUsuLatl")
    , @NamedQuery(name = "Intimacao.findByDtSlaFunci", query = "SELECT i FROM Intimacao i WHERE i.dtSlaFunci = :dtSlaFunci")
    , @NamedQuery(name = "Intimacao.findBySituacaoLatl", query = "SELECT i FROM Intimacao i WHERE i.situacaoLatl = :situacaoLatl")
    , @NamedQuery(name = "Intimacao.findByCdClassePrc", query = "SELECT i FROM Intimacao i WHERE i.cdClassePrc = :cdClassePrc")
    , @NamedQuery(name = "Intimacao.findByEntdForaHoraLim", query = "SELECT i FROM Intimacao i WHERE i.entdForaHoraLim = :entdForaHoraLim")
    , @NamedQuery(name = "Intimacao.findByCdSitPrc", query = "SELECT i FROM Intimacao i WHERE i.cdSitPrc = :cdSitPrc")
    , @NamedQuery(name = "Intimacao.findByCdUltFlxFase", query = "SELECT i FROM Intimacao i WHERE i.cdUltFlxFase = :cdUltFlxFase")
    , @NamedQuery(name = "Intimacao.findByCdUltFlxFaseCtrl", query = "SELECT i FROM Intimacao i WHERE i.cdUltFlxFaseCtrl = :cdUltFlxFaseCtrl")
    , @NamedQuery(name = "Intimacao.findByCdUsuStr", query = "SELECT i FROM Intimacao i WHERE i.cdUsuStr = :cdUsuStr")
    , @NamedQuery(name = "Intimacao.findByDtLimRepactuada", query = "SELECT i FROM Intimacao i WHERE i.dtLimRepactuada = :dtLimRepactuada")
    , @NamedQuery(name = "Intimacao.findByPrazoPacto", query = "SELECT i FROM Intimacao i WHERE i.prazoPacto = :prazoPacto")
    , @NamedQuery(name = "Intimacao.findByPactoCliente", query = "SELECT i FROM Intimacao i WHERE i.pactoCliente = :pactoCliente")
    , @NamedQuery(name = "Intimacao.findByNmTipAtvd", query = "SELECT i FROM Intimacao i WHERE i.nmTipAtvd = :nmTipAtvd")
    , @NamedQuery(name = "Intimacao.findByEtapaAtual", query = "SELECT i FROM Intimacao i WHERE i.etapaAtual = :etapaAtual")
    , @NamedQuery(name = "Intimacao.findByFunciRsp", query = "SELECT i FROM Intimacao i WHERE i.funciRsp = :funciRsp")
    , @NamedQuery(name = "Intimacao.findByGerResp", query = "SELECT i FROM Intimacao i WHERE i.gerResp = :gerResp")
    , @NamedQuery(name = "Intimacao.findByObs", query = "SELECT i FROM Intimacao i WHERE i.obs = :obs")
    , @NamedQuery(name = "Intimacao.findByAjureResponsavel", query = "SELECT i FROM Intimacao i WHERE i.ajureResponsavel = :ajureResponsavel")
    , @NamedQuery(name = "Intimacao.findByDataEnvio", query = "SELECT i FROM Intimacao i WHERE i.dataEnvio = :dataEnvio")
    , @NamedQuery(name = "Intimacao.findByResponsavelEnvioCorreio", query = "SELECT i FROM Intimacao i WHERE i.responsavelEnvioCorreio = :responsavelEnvioCorreio")
    , @NamedQuery(name = "Intimacao.findByAdvogadoBb", query = "SELECT i FROM Intimacao i WHERE i.advogadoBb = :advogadoBb")
    , @NamedQuery(name = "Intimacao.findByEmail", query = "SELECT i FROM Intimacao i WHERE i.email = :email")
    , @NamedQuery(name = "Intimacao.findByTipoDependencia", query = "SELECT i FROM Intimacao i WHERE i.tipoDependencia = :tipoDependencia")
    , @NamedQuery(name = "Intimacao.findByNomeAdverso", query = "SELECT i FROM Intimacao i WHERE i.nomeAdverso = :nomeAdverso")
    , @NamedQuery(name = "Intimacao.findByCpfAdverso", query = "SELECT i FROM Intimacao i WHERE i.cpfAdverso = :cpfAdverso")
    , @NamedQuery(name = "Intimacao.findByPsoJur", query = "SELECT i FROM Intimacao i WHERE i.psoJur = :psoJur")
    , @NamedQuery(name = "Intimacao.findByEmailPso", query = "SELECT i FROM Intimacao i WHERE i.emailPso = :emailPso")})
public class Intimacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_PRC")
    private Integer cdPrc;
    @Column(name = "CD_PRF_UND")
    private Integer cdPrfUnd;
    @Column(name = "CD_PRF_DEPE")
    private String cdPrfDepe;
    @Column(name = "DT_ENTD_PRC")
    @Temporal(TemporalType.DATE)
    private Date dtEntdPrc;
    @Column(name = "DT_SAID_PRC")
    @Temporal(TemporalType.DATE)
    private Date dtSaidPrc;
    @Column(name = "CD_USU_AREA")
    private String cdUsuArea;
    @Column(name = "CD_USU_EQP")
    private String cdUsuEqp;
    @Column(name = "CD_USU_FUN")
    private String cdUsuFun;
    @Column(name = "CD_ETP")
    private Integer cdEtp;
    @Column(name = "DT_LIMITE")
    @Temporal(TemporalType.DATE)
    private Date dtLimite;
    @Column(name = "CD_TIP_PRC")
    private Integer cdTipPrc;
    @Column(name = "CD_EQP")
    private Integer cdEqp;
    @Column(name = "CD_PRF_OPER")
    private String cdPrfOper;
    @Column(name = "CD_AGRUP_PRC")
    private Integer cdAgrupPrc;
    @Column(name = "CD_TIP_ATEND")
    private Integer cdTipAtend;
    @Column(name = "PRIORIZADO")
    private Character priorizado;
    @Column(name = "COMPARTILHADO")
    private Character compartilhado;
    @Column(name = "CD_TIP_ATVD")
    private Integer cdTipAtvd;
    @Column(name = "CD_DETALHE_OCR")
    private Integer cdDetalheOcr;
    @Column(name = "SB")
    private String sb;
    @Column(name = "MATRICULA_SOLICITANTE")
    private String matriculaSolicitante;
    @Column(name = "CD_CLI")
    private Integer cdCli;
    @Basic(optional = false)
    @Column(name = "DT_INICIO_ENTD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInicioEntd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;
    @Column(name = "DT_VENC")
    @Temporal(TemporalType.DATE)
    private Date dtVenc;
    @Column(name = "DT_CONCL_PRC")
    @Temporal(TemporalType.DATE)
    private Date dtConclPrc;
    @Column(name = "PERM_TOTAL")
    private Integer permTotal;
    @Column(name = "PERM_DILIG")
    private Integer permDilig;
    @Column(name = "PERM_CSO")
    private Integer permCso;
    @Column(name = "DIAS_ATRASO")
    private Integer diasAtraso;
    @Column(name = "IDENTIFIC1")
    private String identific1;
    @Column(name = "IDENTIFIC2")
    private String identific2;
    @Column(name = "IDENTIFIC3")
    private String identific3;
    @Column(name = "CD_PRF_UND_ORIGEM")
    private Integer cdPrfUndOrigem;
    @Column(name = "SB_ORIGEM")
    private String sbOrigem;
    @Column(name = "DURACAO_TAREFAS")
    private Double duracaoTarefas;
    @Column(name = "DT_LIMITE_INICIAL")
    @Temporal(TemporalType.DATE)
    private Date dtLimiteInicial;
    @Column(name = "DT_ETP_ATUAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEtpAtual;
    @Column(name = "CD_ULTIMA_OCR")
    private Integer cdUltimaOcr;
    @Column(name = "CD_ULT_OCR_PRC")
    private Integer cdUltOcrPrc;
    @Column(name = "CD_ULT_TAREFA_PRC")
    private Integer cdUltTarefaPrc;
    @Column(name = "DT_DEV_OCR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtDevOcr;
    @Column(name = "DT_SLA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtSla;
    @Column(name = "ATRASO_1N")
    private Integer atraso1n;
    @Column(name = "ATRASO_2N")
    private Integer atraso2n;
    @Column(name = "CD_AGENDA_PRC")
    private Integer cdAgendaPrc;
    @Column(name = "CD_FASE_PRC")
    private Integer cdFasePrc;
    @Column(name = "CD_PRC_VINC")
    private Integer cdPrcVinc;
    @Column(name = "CD_TIP_ORIGEM")
    private Integer cdTipOrigem;
    @Column(name = "DT_LIMITE_CLI")
    @Temporal(TemporalType.DATE)
    private Date dtLimiteCli;
    @Column(name = "DIAS_ATRASO_CLI")
    private Integer diasAtrasoCli;
    @Column(name = "PERM_CLI")
    private Integer permCli;
    @Column(name = "CD_CONTROLE")
    private Character cdControle;
    @Column(name = "CD_USU_ENTD")
    private String cdUsuEntd;
    @Column(name = "CD_USU_LATL")
    private String cdUsuLatl;
    @Column(name = "DT_SLA_FUNCI")
    @Temporal(TemporalType.DATE)
    private Date dtSlaFunci;
    @Column(name = "SITUACAO_LATL")
    private Character situacaoLatl;
    @Column(name = "CD_CLASSE_PRC")
    private Integer cdClassePrc;
    @Column(name = "ENTD_FORA_HORA_LIM")
    private Character entdForaHoraLim;
    @Column(name = "CD_SIT_PRC")
    private Integer cdSitPrc;
    @Column(name = "CD_ULT_FLX_FASE")
    private Integer cdUltFlxFase;
    @Column(name = "CD_ULT_FLX_FASE_CTRL")
    private Integer cdUltFlxFaseCtrl;
    @Column(name = "CD_USU_STR")
    private String cdUsuStr;
    @Column(name = "DT_LIM_REPACTUADA")
    private Character dtLimRepactuada;
    @Column(name = "PRAZO_PACTO")
    private Integer prazoPacto;
    @Column(name = "PACTO_CLIENTE")
    private Integer pactoCliente;
    @Basic(optional = false)
    @Column(name = "NM_TIP_ATVD")
    private String nmTipAtvd;
    @Basic(optional = false)
    @Column(name = "ETAPA_ATUAL")
    private String etapaAtual;
    @Column(name = "FUNCI_RSP")
    private String funciRsp;
    @Column(name = "GER_RESP")
    private String gerResp;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "AJURE_RESPONSAVEL")
    private String ajureResponsavel;
    @Column(name = "DATA_ENVIO")
    @Temporal(TemporalType.DATE)
    private Date dataEnvio;
    @Column(name = "RESPONSAVEL_ENVIO_CORREIO")
    private String responsavelEnvioCorreio;
    @Column(name = "ADVOGADO_BB")
    private String advogadoBb;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TIPO_DEPENDENCIA")
    private String tipoDependencia;
    @Column(name = "NOME_ADVERSO")
    private String nomeAdverso;
    @Column(name = "CPF_ADVERSO")
    private String cpfAdverso;
    @Column(name = "PSO_JUR")
    private String psoJur;
    @Column(name = "EMAIL_PSO")
    private String emailPso;

    public Intimacao() {
    }

    public Intimacao(Integer cdPrc) {
        this.cdPrc = cdPrc;
    }

    public Intimacao(Integer cdPrc, Date dtInicioEntd, String nmTipAtvd, String etapaAtual) {
        this.cdPrc = cdPrc;
        this.dtInicioEntd = dtInicioEntd;
        this.nmTipAtvd = nmTipAtvd;
        this.etapaAtual = etapaAtual;
    }

    public Integer getCdPrc() {
        return cdPrc;
    }

    public void setCdPrc(Integer cdPrc) {
        this.cdPrc = cdPrc;
    }

    public Integer getCdPrfUnd() {
        return cdPrfUnd;
    }

    public void setCdPrfUnd(Integer cdPrfUnd) {
        this.cdPrfUnd = cdPrfUnd;
    }

    public String getCdPrfDepe() {
        return cdPrfDepe;
    }

    public void setCdPrfDepe(String cdPrfDepe) {
        this.cdPrfDepe = cdPrfDepe;
    }

    public Date getDtEntdPrc() {
        return dtEntdPrc;
    }

    public void setDtEntdPrc(Date dtEntdPrc) {
        this.dtEntdPrc = dtEntdPrc;
    }

    public Date getDtSaidPrc() {
        return dtSaidPrc;
    }

    public void setDtSaidPrc(Date dtSaidPrc) {
        this.dtSaidPrc = dtSaidPrc;
    }

    public String getCdUsuArea() {
        return cdUsuArea;
    }

    public void setCdUsuArea(String cdUsuArea) {
        this.cdUsuArea = cdUsuArea;
    }

    public String getCdUsuEqp() {
        return cdUsuEqp;
    }

    public void setCdUsuEqp(String cdUsuEqp) {
        this.cdUsuEqp = cdUsuEqp;
    }

    public String getCdUsuFun() {
        return cdUsuFun;
    }

    public void setCdUsuFun(String cdUsuFun) {
        this.cdUsuFun = cdUsuFun;
    }

    public Integer getCdEtp() {
        return cdEtp;
    }

    public void setCdEtp(Integer cdEtp) {
        this.cdEtp = cdEtp;
    }

    public Date getDtLimite() {
        return dtLimite;
    }

    public void setDtLimite(Date dtLimite) {
        this.dtLimite = dtLimite;
    }

    public Integer getCdTipPrc() {
        return cdTipPrc;
    }

    public void setCdTipPrc(Integer cdTipPrc) {
        this.cdTipPrc = cdTipPrc;
    }

    public Integer getCdEqp() {
        return cdEqp;
    }

    public void setCdEqp(Integer cdEqp) {
        this.cdEqp = cdEqp;
    }

    public String getCdPrfOper() {
        return cdPrfOper;
    }

    public void setCdPrfOper(String cdPrfOper) {
        this.cdPrfOper = cdPrfOper;
    }

    public Integer getCdAgrupPrc() {
        return cdAgrupPrc;
    }

    public void setCdAgrupPrc(Integer cdAgrupPrc) {
        this.cdAgrupPrc = cdAgrupPrc;
    }

    public Integer getCdTipAtend() {
        return cdTipAtend;
    }

    public void setCdTipAtend(Integer cdTipAtend) {
        this.cdTipAtend = cdTipAtend;
    }

    public Character getPriorizado() {
        return priorizado;
    }

    public void setPriorizado(Character priorizado) {
        this.priorizado = priorizado;
    }

    public Character getCompartilhado() {
        return compartilhado;
    }

    public void setCompartilhado(Character compartilhado) {
        this.compartilhado = compartilhado;
    }

    public Integer getCdTipAtvd() {
        return cdTipAtvd;
    }

    public void setCdTipAtvd(Integer cdTipAtvd) {
        this.cdTipAtvd = cdTipAtvd;
    }

    public Integer getCdDetalheOcr() {
        return cdDetalheOcr;
    }

    public void setCdDetalheOcr(Integer cdDetalheOcr) {
        this.cdDetalheOcr = cdDetalheOcr;
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public String getMatriculaSolicitante() {
        return matriculaSolicitante;
    }

    public void setMatriculaSolicitante(String matriculaSolicitante) {
        this.matriculaSolicitante = matriculaSolicitante;
    }

    public Integer getCdCli() {
        return cdCli;
    }

    public void setCdCli(Integer cdCli) {
        this.cdCli = cdCli;
    }

    public Date getDtInicioEntd() {
        return dtInicioEntd;
    }

    public void setDtInicioEntd(Date dtInicioEntd) {
        this.dtInicioEntd = dtInicioEntd;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDtVenc() {
        return dtVenc;
    }

    public void setDtVenc(Date dtVenc) {
        this.dtVenc = dtVenc;
    }

    public Date getDtConclPrc() {
        return dtConclPrc;
    }

    public void setDtConclPrc(Date dtConclPrc) {
        this.dtConclPrc = dtConclPrc;
    }

    public Integer getPermTotal() {
        return permTotal;
    }

    public void setPermTotal(Integer permTotal) {
        this.permTotal = permTotal;
    }

    public Integer getPermDilig() {
        return permDilig;
    }

    public void setPermDilig(Integer permDilig) {
        this.permDilig = permDilig;
    }

    public Integer getPermCso() {
        return permCso;
    }

    public void setPermCso(Integer permCso) {
        this.permCso = permCso;
    }

    public Integer getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public String getIdentific1() {
        return identific1;
    }

    public void setIdentific1(String identific1) {
        this.identific1 = identific1;
    }

    public String getIdentific2() {
        return identific2;
    }

    public void setIdentific2(String identific2) {
        this.identific2 = identific2;
    }

    public String getIdentific3() {
        return identific3;
    }

    public void setIdentific3(String identific3) {
        this.identific3 = identific3;
    }

    public Integer getCdPrfUndOrigem() {
        return cdPrfUndOrigem;
    }

    public void setCdPrfUndOrigem(Integer cdPrfUndOrigem) {
        this.cdPrfUndOrigem = cdPrfUndOrigem;
    }

    public String getSbOrigem() {
        return sbOrigem;
    }

    public void setSbOrigem(String sbOrigem) {
        this.sbOrigem = sbOrigem;
    }

    public Double getDuracaoTarefas() {
        return duracaoTarefas;
    }

    public void setDuracaoTarefas(Double duracaoTarefas) {
        this.duracaoTarefas = duracaoTarefas;
    }

    public Date getDtLimiteInicial() {
        return dtLimiteInicial;
    }

    public void setDtLimiteInicial(Date dtLimiteInicial) {
        this.dtLimiteInicial = dtLimiteInicial;
    }

    public Date getDtEtpAtual() {
        return dtEtpAtual;
    }

    public void setDtEtpAtual(Date dtEtpAtual) {
        this.dtEtpAtual = dtEtpAtual;
    }

    public Integer getCdUltimaOcr() {
        return cdUltimaOcr;
    }

    public void setCdUltimaOcr(Integer cdUltimaOcr) {
        this.cdUltimaOcr = cdUltimaOcr;
    }

    public Integer getCdUltOcrPrc() {
        return cdUltOcrPrc;
    }

    public void setCdUltOcrPrc(Integer cdUltOcrPrc) {
        this.cdUltOcrPrc = cdUltOcrPrc;
    }

    public Integer getCdUltTarefaPrc() {
        return cdUltTarefaPrc;
    }

    public void setCdUltTarefaPrc(Integer cdUltTarefaPrc) {
        this.cdUltTarefaPrc = cdUltTarefaPrc;
    }

    public Date getDtDevOcr() {
        return dtDevOcr;
    }

    public void setDtDevOcr(Date dtDevOcr) {
        this.dtDevOcr = dtDevOcr;
    }

    public Date getDtSla() {
        return dtSla;
    }

    public void setDtSla(Date dtSla) {
        this.dtSla = dtSla;
    }

    public Integer getAtraso1n() {
        return atraso1n;
    }

    public void setAtraso1n(Integer atraso1n) {
        this.atraso1n = atraso1n;
    }

    public Integer getAtraso2n() {
        return atraso2n;
    }

    public void setAtraso2n(Integer atraso2n) {
        this.atraso2n = atraso2n;
    }

    public Integer getCdAgendaPrc() {
        return cdAgendaPrc;
    }

    public void setCdAgendaPrc(Integer cdAgendaPrc) {
        this.cdAgendaPrc = cdAgendaPrc;
    }

    public Integer getCdFasePrc() {
        return cdFasePrc;
    }

    public void setCdFasePrc(Integer cdFasePrc) {
        this.cdFasePrc = cdFasePrc;
    }

    public Integer getCdPrcVinc() {
        return cdPrcVinc;
    }

    public void setCdPrcVinc(Integer cdPrcVinc) {
        this.cdPrcVinc = cdPrcVinc;
    }

    public Integer getCdTipOrigem() {
        return cdTipOrigem;
    }

    public void setCdTipOrigem(Integer cdTipOrigem) {
        this.cdTipOrigem = cdTipOrigem;
    }

    public Date getDtLimiteCli() {
        return dtLimiteCli;
    }

    public void setDtLimiteCli(Date dtLimiteCli) {
        this.dtLimiteCli = dtLimiteCli;
    }

    public Integer getDiasAtrasoCli() {
        return diasAtrasoCli;
    }

    public void setDiasAtrasoCli(Integer diasAtrasoCli) {
        this.diasAtrasoCli = diasAtrasoCli;
    }

    public Integer getPermCli() {
        return permCli;
    }

    public void setPermCli(Integer permCli) {
        this.permCli = permCli;
    }

    public Character getCdControle() {
        return cdControle;
    }

    public void setCdControle(Character cdControle) {
        this.cdControle = cdControle;
    }

    public String getCdUsuEntd() {
        return cdUsuEntd;
    }

    public void setCdUsuEntd(String cdUsuEntd) {
        this.cdUsuEntd = cdUsuEntd;
    }

    public String getCdUsuLatl() {
        return cdUsuLatl;
    }

    public void setCdUsuLatl(String cdUsuLatl) {
        this.cdUsuLatl = cdUsuLatl;
    }

    public Date getDtSlaFunci() {
        return dtSlaFunci;
    }

    public void setDtSlaFunci(Date dtSlaFunci) {
        this.dtSlaFunci = dtSlaFunci;
    }

    public Character getSituacaoLatl() {
        return situacaoLatl;
    }

    public void setSituacaoLatl(Character situacaoLatl) {
        this.situacaoLatl = situacaoLatl;
    }

    public Integer getCdClassePrc() {
        return cdClassePrc;
    }

    public void setCdClassePrc(Integer cdClassePrc) {
        this.cdClassePrc = cdClassePrc;
    }

    public Character getEntdForaHoraLim() {
        return entdForaHoraLim;
    }

    public void setEntdForaHoraLim(Character entdForaHoraLim) {
        this.entdForaHoraLim = entdForaHoraLim;
    }

    public Integer getCdSitPrc() {
        return cdSitPrc;
    }

    public void setCdSitPrc(Integer cdSitPrc) {
        this.cdSitPrc = cdSitPrc;
    }

    public Integer getCdUltFlxFase() {
        return cdUltFlxFase;
    }

    public void setCdUltFlxFase(Integer cdUltFlxFase) {
        this.cdUltFlxFase = cdUltFlxFase;
    }

    public Integer getCdUltFlxFaseCtrl() {
        return cdUltFlxFaseCtrl;
    }

    public void setCdUltFlxFaseCtrl(Integer cdUltFlxFaseCtrl) {
        this.cdUltFlxFaseCtrl = cdUltFlxFaseCtrl;
    }

    public String getCdUsuStr() {
        return cdUsuStr;
    }

    public void setCdUsuStr(String cdUsuStr) {
        this.cdUsuStr = cdUsuStr;
    }

    public Character getDtLimRepactuada() {
        return dtLimRepactuada;
    }

    public void setDtLimRepactuada(Character dtLimRepactuada) {
        this.dtLimRepactuada = dtLimRepactuada;
    }

    public Integer getPrazoPacto() {
        return prazoPacto;
    }

    public void setPrazoPacto(Integer prazoPacto) {
        this.prazoPacto = prazoPacto;
    }

    public Integer getPactoCliente() {
        return pactoCliente;
    }

    public void setPactoCliente(Integer pactoCliente) {
        this.pactoCliente = pactoCliente;
    }

    public String getNmTipAtvd() {
        return nmTipAtvd;
    }

    public void setNmTipAtvd(String nmTipAtvd) {
        this.nmTipAtvd = nmTipAtvd;
    }

    public String getEtapaAtual() {
        return etapaAtual;
    }

    public void setEtapaAtual(String etapaAtual) {
        this.etapaAtual = etapaAtual;
    }

    public String getFunciRsp() {
        return funciRsp;
    }

    public void setFunciRsp(String funciRsp) {
        this.funciRsp = funciRsp;
    }

    public String getGerResp() {
        return gerResp;
    }

    public void setGerResp(String gerResp) {
        this.gerResp = gerResp;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getAjureResponsavel() {
        return ajureResponsavel;
    }

    public void setAjureResponsavel(String ajureResponsavel) {
        this.ajureResponsavel = ajureResponsavel;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getResponsavelEnvioCorreio() {
        return responsavelEnvioCorreio;
    }

    public void setResponsavelEnvioCorreio(String responsavelEnvioCorreio) {
        this.responsavelEnvioCorreio = responsavelEnvioCorreio;
    }

    public String getAdvogadoBb() {
        return advogadoBb;
    }

    public void setAdvogadoBb(String advogadoBb) {
        this.advogadoBb = advogadoBb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDependencia() {
        return tipoDependencia;
    }

    public void setTipoDependencia(String tipoDependencia) {
        this.tipoDependencia = tipoDependencia;
    }

    public String getNomeAdverso() {
        return nomeAdverso;
    }

    public void setNomeAdverso(String nomeAdverso) {
        this.nomeAdverso = nomeAdverso;
    }

    public String getCpfAdverso() {
        return cpfAdverso;
    }

    public void setCpfAdverso(String cpfAdverso) {
        this.cpfAdverso = cpfAdverso;
    }

    public String getPsoJur() {
        return psoJur;
    }

    public void setPsoJur(String psoJur) {
        this.psoJur = psoJur;
    }

    public String getEmailPso() {
        return emailPso;
    }

    public void setEmailPso(String emailPso) {
        this.emailPso = emailPso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdPrc != null ? cdPrc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intimacao)) {
            return false;
        }
        Intimacao other = (Intimacao) object;
        if ((this.cdPrc == null && other.cdPrc != null) || (this.cdPrc != null && !this.cdPrc.equals(other.cdPrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entidade.Intimacao[ cdPrc=" + cdPrc + " ]";
    }
    
}
