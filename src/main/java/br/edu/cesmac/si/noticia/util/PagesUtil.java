package br.edu.cesmac.si.noticia.util;

import org.primefaces.context.RequestContext;
import static br.edu.cesmac.si.noticia.shared.ConstantesMensagens.*;
import javax.faces.context.FacesContext;

public class PagesUtil {
    public static void redirectPage(String page) {
    	try {
            FacesContext context  = FacesContext.getCurrentInstance();
            String url = context.getExternalContext().getRequestContextPath();
            context.getExternalContext().redirect(url+"/pages/"+page+".xhtml");
    	}catch (Exception e) {
			MensagemUtil.erro(MENSAGEM_ERRO_REDIRECIONAR_PAGINA+e.getMessage());
		}
    }

    public static void fecharDialog(String dialog) {
        getRequestContext().execute("PF('" + dialog + "').hide();");
    }
    
    public static void abrirDialog(String dialog) {
        getRequestContext().execute("PF('" + dialog + "').show();");
    }

    private static RequestContext getRequestContext() {
        return RequestContext.getCurrentInstance();
    }
}
