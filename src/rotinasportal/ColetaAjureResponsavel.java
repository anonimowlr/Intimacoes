/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotinasportal;


import dao.IntimacaoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.entidade.Intimacao;
import static rotinasportal.Coletas.driver;


/**
 *
 * @author f5078775
 */
public class ColetaAjureResponsavel {
    
   Coletas coletas = new Coletas();
    
     List<Intimacao> lista = null;
     IntimacaoDAO intimacaoDAO = new IntimacaoDAO();

    public ColetaAjureResponsavel() {
    }

   

 
    public void iniciar() {

        createList();    // descomentar para coletar portal antes de sisbb
        lerLista();
        driver.close();
    }

    public void createList() {
        lista = intimacaoDAO.buscarParaLerAjureResponsavel();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Não há registros para consultar");
        } else {
           coletas.autenticarUsuario();   // habilitar no bb
        }
    }

    public void lerLista() {
      

        for (Intimacao intimacao : lista) {
            capturarAjure(intimacao); // habilitar no bb
          
           
        }
        
    }
    
    
    
    
    private void capturarAjure(Intimacao intimacao) {
        int tamanhoNpj = intimacao.getIdentific3().length();

        driver.manage().window().maximize();
        coletas.setURL("https://juridico.intranet.bb.com.br/paj/processo/pesquisarSolicitacao");
        coletas.aguardaElementoTelaByID("pesquisarSolicitacaoForm:j_id74");




        coletas.procuraElementoPorId(driver, "pesquisarSolicitacaoForm:numerobbjurDecorate:numerobbjurAnoDecorate:numerobbjurAnoInput", intimacao.getIdentific3().subSequence(0, 4).toString());
        coletas.procuraElementoPorId(driver, "pesquisarSolicitacaoForm:numerobbjurDecorate:numerobbjurAnoDecorate:numerobbjurAnoNumeroProcessoInput", intimacao.getIdentific3().subSequence(4, tamanhoNpj-3).toString());




        coletas.clickElementId(driver, "pesquisarSolicitacaoForm:btPesquisarSolicitacao");

        
        
        
        
        if (coletas.isElementPresentID(driver, "modaldivMessagesGlobal")) {

            String n = coletas.lerValorElementoID("modaldivMessagesGlobal");

            if (!n.equals("")) {
                
                intimacao.setObs(n);
                intimacaoDAO.salvar(intimacao);
                return;
            }
        }

        // ler gegistros na pagina
        Integer qtdreg = null;
        if (coletas.isElementPresentID(driver, "pesquisarSolicitacaoForm:j_id336")) {

            String n = coletas.lerValorElementoID("pesquisarSolicitacaoForm:j_id336");

            qtdreg = Integer.parseInt(coletas.quantidadeRegistrosListados(n));
        } else {

            
            intimacao.setObs("Não localizado nenhum subsídio para este npj");
            intimacaoDAO.salvar(intimacao);
            return;
        }
        
        
        if(qtdreg>9){
            
            
         
           for(int n =0;n<=9;n++){
               
            if(coletas.isElementPresentXpath(driver, ".//*[@id='pesquisarSolicitacaoForm:j_id36" + n + "']")){
              coletas.clickElementXpath(driver, ".//*[@id='pesquisarSolicitacaoForm:j_id36" + n + "']");
              break;
              
            }
                
           }
           
        
                
                
            
            
            
        }


        for (int reg = 0; reg < qtdreg; reg++) {
        
            
            String agenciaOrigemSubsidio = coletas.lerValorElementoID("pesquisarSolicitacaoForm:dataTabletableSolicitacaoComplemento:" + reg + ":colDependenciaSolicitanteDecorate:j_id390");
            String agenciaDestinoSubsidio = coletas.lerValorElementoID("pesquisarSolicitacaoForm:dataTabletableSolicitacaoComplemento:" +  reg + ":colDependenciaDestinoDecorate:j_id423");
            String estadoSubsidio = coletas.lerValorElementoID("pesquisarSolicitacaoForm:dataTabletableSolicitacaoComplemento:" +  reg + ":colEstadoDecorate");

        
            if((agenciaOrigemSubsidio.equals("1915") && (!agenciaDestinoSubsidio.equals("1915")) && (estadoSubsidio.equals("Solicitado")))){
                
                return;
            } 
             
             
             
        }

    }

    
    
}
