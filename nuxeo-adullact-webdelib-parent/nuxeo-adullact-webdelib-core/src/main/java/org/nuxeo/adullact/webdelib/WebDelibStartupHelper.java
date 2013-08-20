package org.nuxeo.adullact.webdelib;

import static org.jboss.seam.ScopeType.SESSION;
import static org.jboss.seam.annotations.Install.APPLICATION;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Install;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentRef;
import org.nuxeo.ecm.core.api.PathRef;
import org.nuxeo.ecm.webapp.helpers.StartupHelper;


/**
 * Overriding default {@see org.nuxeo.ecm.webapp.helpers.StartupHelper} to
 * redirect user into the default domain if available or dashboard after login in.
 */
@Name("startupHelper")
@Scope(SESSION)
@Install(precedence = APPLICATION)
public class WebDelibStartupHelper extends StartupHelper {

    private static final Log log = LogFactory.getLog(WebDelibStartupHelper.class);

    private static final long serialVersionUID = 1L;

    @Override
    @Begin(id = "#{conversationIdGenerator.nextMainConversationId}", join = true)
    public String initDomainAndFindStartupPage(String domainTitle, String viewId) {
        super.initDomainAndFindStartupPage(domainTitle, viewId);

        DocumentRef domainRef = new PathRef("/default-domain");
        try {
            if ( documentManager.exists(domainRef) ) {
                return navigationContext.navigateToRef(domainRef);
            }
        } catch (ClientException e) {
            log.error("Error during default Domain fetch, navigate into the Dashboard", e);
        }
        return dashboardNavigationHelper.navigateToDashboard();
    }
}
