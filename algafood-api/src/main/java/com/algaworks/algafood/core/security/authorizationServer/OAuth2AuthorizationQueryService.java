package com.algaworks.algafood.core.security.authorizationServer;

import java.util.List;

import org.springframework.security.oauth2.server.authorization.OAuth2Authorization;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

public interface OAuth2AuthorizationQueryService {

	List<RegisteredClient> listClientsWithConsent(String principalName);
	List<OAuth2Authorization> listAuthorizations(String prnicipalName, String clientId);
}
