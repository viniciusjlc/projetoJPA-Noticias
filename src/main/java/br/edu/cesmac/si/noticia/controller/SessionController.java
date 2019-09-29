package br.edu.cesmac.si.noticia.controller;

import javax.faces.bean.ManagedBean;

import br.edu.cesmac.si.noticia.util.PagesUtil;

@ManagedBean(name = "sessionMB")
public class SessionController {
	public void redirecionarPaginaJornalista() {
		PagesUtil.redirectPage("jornalista/consultar");
	}

	public void redirecionarPaginaEditoria() {
		PagesUtil.redirectPage("editoria/consultar");
	}

}
